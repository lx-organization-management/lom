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
 * The base condition-query of account.
 * @author DBFlute(AutoGenerator)
 */
public class BsAccountCQ extends AbstractBsAccountCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AccountCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAccountCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from account) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AccountCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AccountCIQ xcreateCIQ() {
        AccountCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AccountCIQ xnewCIQ() {
        return new AccountCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join account on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AccountCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AccountCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _accountId;
    public ConditionValue xdfgetAccountId()
    { if (_accountId == null) { _accountId = nCV(); }
      return _accountId; }
    protected ConditionValue xgetCValueAccountId() { return xdfgetAccountId(); }

    public Map<String, UserGroupingCQ> xdfgetAccountId_ExistsReferrer_UserGroupingList() { return xgetSQueMap("accountId_ExistsReferrer_UserGroupingList"); }
    public String keepAccountId_ExistsReferrer_UserGroupingList(UserGroupingCQ sq) { return xkeepSQue("accountId_ExistsReferrer_UserGroupingList", sq); }

    public Map<String, UserGroupingCQ> xdfgetAccountId_NotExistsReferrer_UserGroupingList() { return xgetSQueMap("accountId_NotExistsReferrer_UserGroupingList"); }
    public String keepAccountId_NotExistsReferrer_UserGroupingList(UserGroupingCQ sq) { return xkeepSQue("accountId_NotExistsReferrer_UserGroupingList", sq); }

    public Map<String, UserGroupingCQ> xdfgetAccountId_SpecifyDerivedReferrer_UserGroupingList() { return xgetSQueMap("accountId_SpecifyDerivedReferrer_UserGroupingList"); }
    public String keepAccountId_SpecifyDerivedReferrer_UserGroupingList(UserGroupingCQ sq) { return xkeepSQue("accountId_SpecifyDerivedReferrer_UserGroupingList", sq); }

    public Map<String, UserGroupingCQ> xdfgetAccountId_QueryDerivedReferrer_UserGroupingList() { return xgetSQueMap("accountId_QueryDerivedReferrer_UserGroupingList"); }
    public String keepAccountId_QueryDerivedReferrer_UserGroupingList(UserGroupingCQ sq) { return xkeepSQue("accountId_QueryDerivedReferrer_UserGroupingList", sq); }
    public Map<String, Object> xdfgetAccountId_QueryDerivedReferrer_UserGroupingListParameter() { return xgetSQuePmMap("accountId_QueryDerivedReferrer_UserGroupingList"); }
    public String keepAccountId_QueryDerivedReferrer_UserGroupingListParameter(Object pm) { return xkeepSQuePm("accountId_QueryDerivedReferrer_UserGroupingList", pm); }

    /**
     * Add order-by as ascend. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountId_Asc() { regOBA("ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_AccountId_Desc() { regOBD("ACCOUNT_ID"); return this; }

    protected ConditionValue _employeeNo;
    public ConditionValue xdfgetEmployeeNo()
    { if (_employeeNo == null) { _employeeNo = nCV(); }
      return _employeeNo; }
    protected ConditionValue xgetCValueEmployeeNo() { return xdfgetEmployeeNo(); }

    /**
     * Add order-by as ascend. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_EmployeeNo_Asc() { regOBA("EMPLOYEE_NO"); return this; }

    /**
     * Add order-by as descend. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_EmployeeNo_Desc() { regOBD("EMPLOYEE_NO"); return this; }

    protected ConditionValue _emailAddress;
    public ConditionValue xdfgetEmailAddress()
    { if (_emailAddress == null) { _emailAddress = nCV(); }
      return _emailAddress; }
    protected ConditionValue xgetCValueEmailAddress() { return xdfgetEmailAddress(); }

    /**
     * Add order-by as ascend. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_EmailAddress_Asc() { regOBA("EMAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_EmailAddress_Desc() { regOBD("EMAIL_ADDRESS"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /**
     * Add order-by as ascend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

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
    public BsAccountCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsAccountCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsAccountCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsAccountCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsAccountCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        AccountCQ bq = (AccountCQ)bqs;
        AccountCQ uq = (AccountCQ)uqs;
        if (bq.hasConditionQueryAccountProfileAsOne()) {
            uq.queryAccountProfileAsOne().reflectRelationOnUnionQuery(bq.queryAccountProfileAsOne(), uq.queryAccountProfileAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * account_profile by ACCOUNT_ID, named 'accountProfileAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public AccountProfileCQ queryAccountProfileAsOne() { return xdfgetConditionQueryAccountProfileAsOne(); }
    public AccountProfileCQ xdfgetConditionQueryAccountProfileAsOne() {
        String prop = "accountProfileAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryAccountProfileAsOne()); xsetupOuterJoinAccountProfileAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected AccountProfileCQ xcreateQueryAccountProfileAsOne() {
        String nrp = xresolveNRP("account", "accountProfileAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AccountProfileCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "accountProfileAsOne", nrp);
    }
    protected void xsetupOuterJoinAccountProfileAsOne() { xregOutJo("accountProfileAsOne"); }
    public boolean hasConditionQueryAccountProfileAsOne() { return xhasQueRlMap("accountProfileAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, AccountCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(AccountCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, AccountCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(AccountCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, AccountCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(AccountCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, AccountCQ> _myselfExistsMap;
    public Map<String, AccountCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(AccountCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, AccountCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(AccountCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AccountCB.class.getName(); }
    protected String xCQ() { return AccountCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
