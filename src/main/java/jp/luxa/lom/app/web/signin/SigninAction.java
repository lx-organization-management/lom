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
package jp.luxa.lom.app.web.signin;

import javax.annotation.Resource;

import jp.luxa.lom.app.web.RootAction;
import jp.luxa.lom.app.web.base.LomBaseAction;
import jp.luxa.lom.app.web.base.login.LomLoginAssist;
import jp.luxa.lom.mylasta.action.LomMessages;
import org.lastaflute.core.util.LaStringUtil;
import org.lastaflute.web.Execute;
import org.lastaflute.web.login.credential.UserPasswordCredential;
import org.lastaflute.web.response.HtmlResponse;

/**
 * @author jflute
 */
public class SigninAction extends LomBaseAction {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private LomLoginAssist loginAssist;

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Execute
    public HtmlResponse index() {
        if (getUserBean().isPresent()) {
            return asHtml(path_Test_TestHtml);
            //return redirect(MypageAction.class);
        }
        return asHtml(path_Signin_SigninHtml);
    }

    @Execute
    public HtmlResponse signin(SigninForm form) {
        validate(form, messages -> moreValidate(form, messages), () -> {
            form.clearSecurityInfo();
            return asHtml(path_Signin_SigninHtml);
        });
        return loginAssist.loginRedirect(createCredential(form), op -> op.rememberMe(form.rememberMe), () -> {
            return redirect(RootAction.class);
        });
    }

    private void moreValidate(SigninForm form, LomMessages messages) {
        if (LaStringUtil.isNotEmpty(form.account) && LaStringUtil.isNotEmpty(form.password)) {
            if (!loginAssist.checkUserLoginable(createCredential(form))) {
                messages.addErrorsLoginFailure("account");
            }
        }
    }

    private UserPasswordCredential createCredential(SigninForm form) {
        return new UserPasswordCredential(form.account, form.password);
    }
}