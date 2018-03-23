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
 * The base condition-query of user_grouping.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserGroupingCQ extends AbstractBsUserGroupingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserGroupingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserGroupingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user_grouping) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserGroupingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserGroupingCIQ xcreateCIQ() {
        UserGroupingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserGroupingCIQ xnewCIQ() {
        return new UserGroupingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user_grouping on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserGroupingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserGroupingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userGroupingId;
    public ConditionValue xdfgetUserGroupingId()
    { if (_userGroupingId == null) { _userGroupingId = nCV(); }
      return _userGroupingId; }
    protected ConditionValue xgetCValueUserGroupingId() { return xdfgetUserGroupingId(); }

    /**
     * Add order-by as ascend. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_UserGroupingId_Asc() { regOBA("USER_GROUPING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_UserGroupingId_Desc() { regOBD("USER_GROUPING_ID"); return this; }

    protected ConditionValue _accountId;
    public ConditionValue xdfgetAccountId()
    { if (_accountId == null) { _accountId = nCV(); }
      return _accountId; }
    protected ConditionValue xgetCValueAccountId() { return xdfgetAccountId(); }

    /**
     * Add order-by as ascend. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_AccountId_Asc() { regOBA("ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_AccountId_Desc() { regOBD("ACCOUNT_ID"); return this; }

    protected ConditionValue _communityId;
    public ConditionValue xdfgetCommunityId()
    { if (_communityId == null) { _communityId = nCV(); }
      return _communityId; }
    protected ConditionValue xgetCValueCommunityId() { return xdfgetCommunityId(); }

    /**
     * Add order-by as ascend. <br>
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_CommunityId_Asc() { regOBA("COMMUNITY_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_CommunityId_Desc() { regOBD("COMMUNITY_ID"); return this; }

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
    public BsUserGroupingCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsUserGroupingCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserGroupingCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsUserGroupingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserGroupingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        UserGroupingCQ bq = (UserGroupingCQ)bqs;
        UserGroupingCQ uq = (UserGroupingCQ)uqs;
        if (bq.hasConditionQueryAccount()) {
            uq.queryAccount().reflectRelationOnUnionQuery(bq.queryAccount(), uq.queryAccount());
        }
        if (bq.hasConditionQueryCommunity()) {
            uq.queryCommunity().reflectRelationOnUnionQuery(bq.queryCommunity(), uq.queryCommunity());
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
        String nrp = xresolveNRP("user_grouping", "account"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new AccountCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "account", nrp);
    }
    protected void xsetupOuterJoinAccount() { xregOutJo("account"); }
    public boolean hasConditionQueryAccount() { return xhasQueRlMap("account"); }

    /**
     * Get the condition-query for relation table. <br>
     * (ユーザコミュニティ)COMMUNITY by my COMMUNITY_ID, named 'community'.
     * @return The instance of condition-query. (NotNull)
     */
    public CommunityCQ queryCommunity() {
        return xdfgetConditionQueryCommunity();
    }
    public CommunityCQ xdfgetConditionQueryCommunity() {
        String prop = "community";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryCommunity()); xsetupOuterJoinCommunity(); }
        return xgetQueRlMap(prop);
    }
    protected CommunityCQ xcreateQueryCommunity() {
        String nrp = xresolveNRP("user_grouping", "community"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new CommunityCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "community", nrp);
    }
    protected void xsetupOuterJoinCommunity() { xregOutJo("community"); }
    public boolean hasConditionQueryCommunity() { return xhasQueRlMap("community"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserGroupingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserGroupingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserGroupingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserGroupingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserGroupingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserGroupingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserGroupingCQ> _myselfExistsMap;
    public Map<String, UserGroupingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserGroupingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserGroupingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserGroupingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserGroupingCB.class.getName(); }
    protected String xCQ() { return UserGroupingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
