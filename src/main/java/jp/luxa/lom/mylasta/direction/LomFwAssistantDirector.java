/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.luxa.lom.mylasta.direction;

import javax.annotation.Resource;

import jp.luxa.lom.mylasta.direction.sponsor.LomActionAdjustmentProvider;
import jp.luxa.lom.mylasta.direction.sponsor.LomApiFailureHook;
import jp.luxa.lom.mylasta.direction.sponsor.LomCookieResourceProvider;
import jp.luxa.lom.mylasta.direction.sponsor.LomCurtainBeforeHook;
import jp.luxa.lom.mylasta.direction.sponsor.LomJsonResourceProvider;
import jp.luxa.lom.mylasta.direction.sponsor.LomListedClassificationProvider;
import jp.luxa.lom.mylasta.direction.sponsor.LomMailDeliveryDepartmentCreator;
import jp.luxa.lom.mylasta.direction.sponsor.LomMultipartRequestHandler;
import jp.luxa.lom.mylasta.direction.sponsor.LomSecurityResourceProvider;
import jp.luxa.lom.mylasta.direction.sponsor.LomTimeResourceProvider;
import jp.luxa.lom.mylasta.direction.sponsor.LomUserLocaleProcessProvider;
import jp.luxa.lom.mylasta.direction.sponsor.LomUserTimeZoneProcessProvider;
import org.lastaflute.core.direction.CachedFwAssistantDirector;
import org.lastaflute.core.direction.CurtainBeforeHook;
import org.lastaflute.core.direction.FwAssistDirection;
import org.lastaflute.core.direction.FwCoreDirection;
import org.lastaflute.core.json.JsonResourceProvider;
import org.lastaflute.core.security.InvertibleCryptographer;
import org.lastaflute.core.security.OneWayCryptographer;
import org.lastaflute.core.security.SecurityResourceProvider;
import org.lastaflute.core.time.TimeResourceProvider;
import org.lastaflute.db.dbflute.classification.ListedClassificationProvider;
import org.lastaflute.db.direction.FwDbDirection;
import org.lastaflute.thymeleaf.ThymeleafRenderingProvider;
import org.lastaflute.web.api.ApiFailureHook;
import org.lastaflute.web.direction.FwWebDirection;
import org.lastaflute.web.path.ActionAdjustmentProvider;
import org.lastaflute.web.ruts.multipart.MultipartResourceProvider;
import org.lastaflute.web.ruts.renderer.HtmlRenderingProvider;
import org.lastaflute.web.servlet.cookie.CookieResourceProvider;
import org.lastaflute.web.servlet.request.UserLocaleProcessProvider;
import org.lastaflute.web.servlet.request.UserTimeZoneProcessProvider;

/**
 * @author jflute
 * @author shogo.kataoka
 */
public class LomFwAssistantDirector extends CachedFwAssistantDirector {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LomConfig config;

    // ===================================================================================
    //                                                                              Assist
    //                                                                              ======
    @Override
    protected void prepareAssistDirection(FwAssistDirection direction) {
        direction.directConfig(nameList -> nameList.add("lom_config.properties"), "lom_env.properties");
    }

    // ===================================================================================
    //                                                                               Core
    //                                                                              ======
    @Override
    protected void prepareCoreDirection(FwCoreDirection direction) {
        // this configuration is on lom_env.properties because this is true only when development
        direction.directDevelopmentHere(config.isDevelopmentHere());

        // titles of the application for logging are from configurations
        direction.directLoggingTitle(config.getDomainTitle(), config.getEnvironmentTitle());

        // this configuration is on sea_env.properties because it has no influence to production
        // even if you set true manually and forget to set false back
        direction.directFrameworkDebug(config.isFrameworkDebug()); // basically false

        // you can add your own process when your application is booting
        direction.directCurtainBefore(createCurtainBeforeHook());

        direction.directSecurity(createSecurityResourceProvider());
        direction.directTime(createTimeResourceProvider());
        direction.directJson(createJsonResourceProvider());
        direction.directMail(createMailDeliveryDepartmentCreator().create());
    }

    protected CurtainBeforeHook createCurtainBeforeHook() {
        return new LomCurtainBeforeHook();
    }

    protected SecurityResourceProvider createSecurityResourceProvider() { // #changed
        final InvertibleCryptographer inver = InvertibleCryptographer.createBlowfishCipher("8493a4e8e4662fce2ac8e3b103fcefb0");
        final OneWayCryptographer oneWay = OneWayCryptographer.createSha256Cryptographer();
        return new LomSecurityResourceProvider(inver, oneWay);
    }

    protected TimeResourceProvider createTimeResourceProvider() {
        return new LomTimeResourceProvider(config);
    }

    protected JsonResourceProvider createJsonResourceProvider() {
        return new LomJsonResourceProvider();
    }

    protected LomMailDeliveryDepartmentCreator createMailDeliveryDepartmentCreator() {
        return new LomMailDeliveryDepartmentCreator(config);
    }

    // ===================================================================================
    //                                                                                 DB
    //                                                                                ====
    @Override
    protected void prepareDbDirection(FwDbDirection direction) {
        direction.directClassification(createListedClassificationProvider());
    }

    protected ListedClassificationProvider createListedClassificationProvider() {
        return new LomListedClassificationProvider();
    }

    // ===================================================================================
    //                                                                                Web
    //                                                                               =====
    @Override
    protected void prepareWebDirection(FwWebDirection direction) {
        direction.directRequest(createUserLocaleProcessProvider(), createUserTimeZoneProcessProvider());
        direction.directCookie(createCookieResourceProvider());
        direction.directAdjustment(createActionAdjustmentProvider());
        direction.directMessage(nameList -> nameList.add("lom_message"), "lom_label");
        direction.directApiCall(createApiFailureHook());
        direction.directHtmlRendering(createHtmlRenderingProvider());
        direction.directMultipart(createMultipartResourceProvider());
    }

    protected UserLocaleProcessProvider createUserLocaleProcessProvider() {
        return new LomUserLocaleProcessProvider();
    }

    protected UserTimeZoneProcessProvider createUserTimeZoneProcessProvider() {
        return new LomUserTimeZoneProcessProvider();
    }

    protected CookieResourceProvider createCookieResourceProvider() { // #changeed
        final InvertibleCryptographer cr = InvertibleCryptographer.createBlowfishCipher("8493a4e8e4662fce2ac8e3b103fcefb0");
        return new LomCookieResourceProvider(config, cr);
    }

    protected ActionAdjustmentProvider createActionAdjustmentProvider() {
        return new LomActionAdjustmentProvider();
    }

    protected ApiFailureHook createApiFailureHook() {
        return new LomApiFailureHook();
    }

    protected HtmlRenderingProvider createHtmlRenderingProvider() {
        return new ThymeleafRenderingProvider().asDevelopment(config.isDevelopmentHere());
    }

    protected MultipartResourceProvider createMultipartResourceProvider() {
        return () -> new LomMultipartRequestHandler();
    }
}
