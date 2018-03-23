/*
 * Copyright (C) LUXA, Inc. All Rights Reserved.
 */

package jp.luxa.lom.mylasta.action

import jp.luxa.lom.dbflute.exentity.Account
import org.lastaflute.web.login.TypicalUserBean

class LomUserBean(account: Account) : TypicalUserBean<Int>() {
    val accountId = account.accountId
    val employeeNo = account.employeeNo
    val accountName = "TODO account_name" // TODO shogo.kataoka add column AccountName (2018/03/23)
    val emailAddress = account.emailAddress
    override fun getUserId() = accountId
}