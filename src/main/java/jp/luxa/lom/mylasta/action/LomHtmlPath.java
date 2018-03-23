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
package jp.luxa.lom.mylasta.action;

import org.lastaflute.web.response.next.HtmlNext;

/**
 * The path definition of HTML.
 * @author FreeGen
 */
public interface LomHtmlPath {

    /** The path of the HTML: /error/show_errors.html */
    HtmlNext path_Error_ShowErrorsHtml = new HtmlNext("/error/show_errors.html");

    /** The path of the HTML: /mypage/mypage.html */
    HtmlNext path_Mypage_MypageHtml = new HtmlNext("/mypage/mypage.html");

    /** The path of the HTML: /signin/signin.html */
    HtmlNext path_Signin_SigninHtml = new HtmlNext("/signin/signin.html");

    /** The path of the HTML: /signin/signin_reminder.html */
    HtmlNext path_Signin_SigninReminderHtml = new HtmlNext("/signin/signin_reminder.html");

    /** The path of the HTML: /test/test.html */
    HtmlNext path_Test_TestHtml = new HtmlNext("/test/test.html");
}
