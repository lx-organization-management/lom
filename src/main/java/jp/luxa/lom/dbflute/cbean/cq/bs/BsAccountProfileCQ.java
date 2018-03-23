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
package jp.luxa.lom.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import jp.luxa.lom.dbflute.cbean.cq.ciq.*;
import jp.luxa.lom.dbflute.cbean.*;
import jp.luxa.lom.dbflute.cbean.cq.*;

/**
 * The base condition-query of account_profile.
 * @author DBFlute(AutoGenerator)
 */
public class BsAccountProfileCQ extends AbstractBsAccountProfileCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AccountProfileCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAccountProfileCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from account_profile) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AccountProfileCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AccountProfileCIQ xcreateCIQ() {
        AccountProfileCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AccountProfileCIQ xnewCIQ() {
        return new AccountProfileCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join account_profile on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AccountProfileCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AccountProfileCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _accountProfileId;
    public ConditionValue xdfgetAccountProfileId()
    { if (_accountProfileId == null) { _accountProfileId = nCV(); }
      return _accountProfileId; }
    protected ConditionValue xgetCValueAccountProfileId() { return xdfgetAccountProfileId(); }

    /**
     * Add order-by as ascend. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_AccountProfileId_Asc() { regOBA("ACCOUNT_PROFILE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_AccountProfileId_Desc() { regOBD("ACCOUNT_PROFILE_ID"); return this; }

    protected ConditionValue _accountId;
    public ConditionValue xdfgetAccountId()
    { if (_accountId == null) { _accountId = nCV(); }
      return _accountId; }
    protected ConditionValue xgetCValueAccountId() { return xdfgetAccountId(); }

    /**
     * Add order-by as ascend. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_AccountId_Asc() { regOBA("ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_AccountId_Desc() { regOBD("ACCOUNT_ID"); return this; }

    protected ConditionValue _accountName;
    public ConditionValue xdfgetAccountName()
    { if (_accountName == null) { _accountName = nCV(); }
      return _accountName; }
    protected ConditionValue xgetCValueAccountName() { return xdfgetAccountName(); }

    /**
     * Add order-by as ascend. <br>
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_AccountName_Asc() { regOBA("ACCOUNT_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_AccountName_Desc() { regOBD("ACCOUNT_NAME"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsAccountProfileCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AccountProfileCQ bq = (AccountProfileCQ)bqs;
        AccountProfileCQ uq = (AccountProfileCQ)uqs;
        if (bq.hasConditionQueryAccount()) {
            uq.queryAccount().reflectRelationOnUnionQuery(bq.queryAccount(), uq.queryAccount());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (アカウント)ACCOUNT by my ACCOUNT_ID, named 'account'.
     * @return The instance of condition-query. (NotNull)
     */
    public AccountCQ queryAccount() {
        return xdfgetConditionQueryAccount();
    }
    public AccountCQ xdfgetConditionQueryAccount() {
        String prop = "account";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAccount()); xsetupOuterJoinAccount(); }
        return xgetQueRlMap(prop);
    }
    protected AccountCQ xcreateQueryAccount() {
        String nrp = xresolveNRP("account_profile", "account"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AccountCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "account", nrp);
    }
    protected void xsetupOuterJoinAccount() { xregOutJo("account"); }
    public boolean hasConditionQueryAccount() { return xhasQueRlMap("account"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AccountProfileCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AccountProfileCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AccountProfileCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AccountProfileCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AccountProfileCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AccountProfileCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AccountProfileCQ> _myselfExistsMap;
    public Map<String, AccountProfileCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AccountProfileCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AccountProfileCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AccountProfileCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AccountProfileCB.class.getName(); }
    protected String xCQ() { return AccountProfileCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
