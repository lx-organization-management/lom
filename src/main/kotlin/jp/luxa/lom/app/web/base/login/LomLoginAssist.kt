/*
 * Copyright (C) LUXA, Inc. All Rights Reserved.
 */
package jp.luxa.lom.app.web.base.login

import jp.luxa.lom.app.web.signin.SigninAction
import jp.luxa.lom.dbflute.cbean.AccountCB
import jp.luxa.lom.dbflute.exbhv.AccountBhv
import jp.luxa.lom.dbflute.exentity.Account
import jp.luxa.lom.mylasta.action.LomUserBean
import jp.luxa.lom.mylasta.direction.LomConfig
import org.dbflute.optional.OptionalEntity
import org.dbflute.optional.OptionalThing
import org.lastaflute.core.time.TimeManager
import org.lastaflute.web.login.PrimaryLoginManager
import org.lastaflute.web.login.TypicalLoginAssist
import org.lastaflute.web.login.credential.UserPasswordCredential
import org.lastaflute.web.login.option.LoginSpecifiedOption
import javax.annotation.Resource

/**
 * @author jflute
 * @author shogo.kataoka
 */
open class LomLoginAssist : TypicalLoginAssist<Int, LomUserBean, Account>(), PrimaryLoginManager {

    // ===================================================================================
    //                                                                          Attributes
    //                                                                          ==========
    @Resource
    private lateinit var timeManager: TimeManager
    @Resource
    private lateinit var accountBhv: AccountBhv
    @Resource
    private lateinit var config: LomConfig

    // ===================================================================================
    //                                                                           Find User
    //                                                                          ==========
    protected override fun checkCredential(checker: CredentialChecker) {
        checker.check(UserPasswordCredential::class.java) { credential ->
            accountBhv.selectCount { cb -> arrangeByCredential(cb, credential) } > 0
        }
    }

    protected override fun resolveCredential(resolver: CredentialResolver) {
        resolver.resolve(UserPasswordCredential::class.java) { credential ->
            accountBhv.selectEntity { cb -> arrangeByCredential(cb, credential) }
        }
    }

    private fun arrangeByCredential(cb: AccountCB, credential: UserPasswordCredential) {
        // cb.query().arrangeLogin(credential.user, encryptPassword(credential.password))
        cb.query().arrangeLogin(credential.user, encryptPassword(credential.password))
    }

    protected override fun doFindLoginUser(userId: Int): OptionalEntity<Account> {
        return accountBhv.selectEntity { cb -> cb.query().arrangeLogin(userId) }
    }

    // ===================================================================================
    //                                                                       Login Process
    //                                                                       =============
    protected override fun createUserBean(account: Account): LomUserBean {
        return LomUserBean(account)
    }

    protected override fun getCookieRememberMeKey(): OptionalThing<String> {
        return OptionalThing.of(config.cookieRememberMeLomKey)
    }

    protected override fun toTypedUserId(userKey: String) = userKey.toInt()

    protected override fun saveLoginHistory(account: Account, userBean: LomUserBean, option: LoginSpecifiedOption) {
        // TODO someone Create Login history table (2018/03/23)
    }

    // ===================================================================================
    //                                                                      Login Resource
    //                                                                      ==============
    protected override fun getUserBeanType() = LomUserBean::class.java

    protected override fun getLoginActionType() = SigninAction::class.java
}
