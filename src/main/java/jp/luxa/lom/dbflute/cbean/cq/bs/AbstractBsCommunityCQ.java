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

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import jp.luxa.lom.dbflute.allcommon.*;
import jp.luxa.lom.dbflute.cbean.*;
import jp.luxa.lom.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of community.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCommunityCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCommunityCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "community";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityId The value of communityId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_Equal(Integer communityId) {
        doSetCommunityId_Equal(communityId);
    }

    protected void doSetCommunityId_Equal(Integer communityId) {
        regCommunityId(CK_EQ, communityId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityId The value of communityId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_NotEqual(Integer communityId) {
        doSetCommunityId_NotEqual(communityId);
    }

    protected void doSetCommunityId_NotEqual(Integer communityId) {
        regCommunityId(CK_NES, communityId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityId The value of communityId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_GreaterThan(Integer communityId) {
        regCommunityId(CK_GT, communityId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityId The value of communityId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_LessThan(Integer communityId) {
        regCommunityId(CK_LT, communityId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityId The value of communityId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_GreaterEqual(Integer communityId) {
        regCommunityId(CK_GE, communityId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityId The value of communityId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_LessEqual(Integer communityId) {
        regCommunityId(CK_LE, communityId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of communityId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of communityId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCommunityId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCommunityId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of communityId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of communityId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCommunityId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCommunityId(), "COMMUNITY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityIdList The collection of communityId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommunityId_InScope(Collection<Integer> communityIdList) {
        doSetCommunityId_InScope(communityIdList);
    }

    protected void doSetCommunityId_InScope(Collection<Integer> communityIdList) {
        regINS(CK_INS, cTL(communityIdList), xgetCValueCommunityId(), "COMMUNITY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @param communityIdList The collection of communityId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommunityId_NotInScope(Collection<Integer> communityIdList) {
        doSetCommunityId_NotInScope(communityIdList);
    }

    protected void doSetCommunityId_NotInScope(Collection<Integer> communityIdList) {
        regINS(CK_NINS, cTL(communityIdList), xgetCValueCommunityId(), "COMMUNITY_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COMMUNITY_ID from user_grouping where ...)} <br>
     * (コミュニティ所属)user_grouping by COMMUNITY_ID, named 'userGroupingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserGrouping</span>(groupingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     groupingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserGroupingList for 'exists'. (NotNull)
     */
    public void existsUserGrouping(SubQuery<UserGroupingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommunityId_ExistsReferrer_UserGroupingList(cb.query());
        registerExistsReferrer(cb.query(), "COMMUNITY_ID", "COMMUNITY_ID", pp, "userGroupingList");
    }
    public abstract String keepCommunityId_ExistsReferrer_UserGroupingList(UserGroupingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COMMUNITY_ID from user_grouping where ...)} <br>
     * (コミュニティ所属)user_grouping by COMMUNITY_ID, named 'userGroupingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserGrouping</span>(groupingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     groupingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CommunityId_NotExistsReferrer_UserGroupingList for 'not exists'. (NotNull)
     */
    public void notExistsUserGrouping(SubQuery<UserGroupingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommunityId_NotExistsReferrer_UserGroupingList(cb.query());
        registerNotExistsReferrer(cb.query(), "COMMUNITY_ID", "COMMUNITY_ID", pp, "userGroupingList");
    }
    public abstract String keepCommunityId_NotExistsReferrer_UserGroupingList(UserGroupingCQ sq);

    public void xsderiveUserGroupingList(String fn, SubQuery<UserGroupingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCommunityId_SpecifyDerivedReferrer_UserGroupingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COMMUNITY_ID", "COMMUNITY_ID", pp, "userGroupingList", al, op);
    }
    public abstract String keepCommunityId_SpecifyDerivedReferrer_UserGroupingList(UserGroupingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_grouping where ...)} <br>
     * (コミュニティ所属)user_grouping by COMMUNITY_ID, named 'userGroupingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserGrouping()</span>.<span style="color: #CC4747">max</span>(groupingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     groupingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     groupingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserGroupingCB> derivedUserGrouping() {
        return xcreateQDRFunctionUserGroupingList();
    }
    protected HpQDRFunction<UserGroupingCB> xcreateQDRFunctionUserGroupingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserGroupingList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserGroupingList(String fn, SubQuery<UserGroupingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCommunityId_QueryDerivedReferrer_UserGroupingList(cb.query()); String prpp = keepCommunityId_QueryDerivedReferrer_UserGroupingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COMMUNITY_ID", "COMMUNITY_ID", sqpp, "userGroupingList", rd, vl, prpp, op);
    }
    public abstract String keepCommunityId_QueryDerivedReferrer_UserGroupingList(UserGroupingCQ sq);
    public abstract String keepCommunityId_QueryDerivedReferrer_UserGroupingListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setCommunityId_IsNull() { regCommunityId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setCommunityId_IsNotNull() { regCommunityId(CK_ISNN, DOBJ); }

    protected void regCommunityId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommunityId(), "COMMUNITY_ID"); }
    protected abstract ConditionValue xgetCValueCommunityId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMMUNITY_NAME: {NotNull, VARCHAR(128)}
     * @param communityName The value of communityName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommunityName_Equal(String communityName) {
        doSetCommunityName_Equal(fRES(communityName));
    }

    protected void doSetCommunityName_Equal(String communityName) {
        regCommunityName(CK_EQ, communityName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMUNITY_NAME: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setCommunityName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param communityName The value of communityName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCommunityName_LikeSearch(String communityName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCommunityName_LikeSearch(communityName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMUNITY_NAME: {NotNull, VARCHAR(128)} <br>
     * <pre>e.g. setCommunityName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param communityName The value of communityName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCommunityName_LikeSearch(String communityName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(communityName), xgetCValueCommunityName(), "COMMUNITY_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMUNITY_NAME: {NotNull, VARCHAR(128)}
     * @param communityName The value of communityName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCommunityName_NotLikeSearch(String communityName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCommunityName_NotLikeSearch(communityName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMMUNITY_NAME: {NotNull, VARCHAR(128)}
     * @param communityName The value of communityName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCommunityName_NotLikeSearch(String communityName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(communityName), xgetCValueCommunityName(), "COMMUNITY_NAME", likeSearchOption);
    }

    protected void regCommunityName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommunityName(), "COMMUNITY_NAME"); }
    protected abstract ConditionValue xgetCValueCommunityName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountId The value of accountId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_Equal(Integer accountId) {
        doSetAccountId_Equal(accountId);
    }

    protected void doSetAccountId_Equal(Integer accountId) {
        regAccountId(CK_EQ, accountId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountId The value of accountId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_NotEqual(Integer accountId) {
        doSetAccountId_NotEqual(accountId);
    }

    protected void doSetAccountId_NotEqual(Integer accountId) {
        regAccountId(CK_NES, accountId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountId The value of accountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterThan(Integer accountId) {
        regAccountId(CK_GT, accountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountId The value of accountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessThan(Integer accountId) {
        regAccountId(CK_LT, accountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountId The value of accountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterEqual(Integer accountId) {
        regAccountId(CK_GE, accountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountId The value of accountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessEqual(Integer accountId) {
        regAccountId(CK_LE, accountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param minNumber The min number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAccountId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAccountId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param minNumber The min number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountId(), "ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountIdList The collection of accountId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountId_InScope(Collection<Integer> accountIdList) {
        doSetAccountId_InScope(accountIdList);
    }

    protected void doSetAccountId_InScope(Collection<Integer> accountIdList) {
        regINS(CK_INS, cTL(accountIdList), xgetCValueAccountId(), "ACCOUNT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @param accountIdList The collection of accountId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountId_NotInScope(Collection<Integer> accountIdList) {
        doSetAccountId_NotInScope(accountIdList);
    }

    protected void doSetAccountId_NotInScope(Collection<Integer> accountIdList) {
        regINS(CK_NINS, cTL(accountIdList), xgetCValueAccountId(), "ACCOUNT_ID");
    }

    protected void regAccountId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountId(), "ACCOUNT_ID"); }
    protected abstract ConditionValue xgetCValueAccountId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPDATE_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CommunityCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CommunityCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CommunityCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CommunityCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CommunityCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CommunityCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CommunityCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CommunityCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CommunityCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CommunityCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CommunityCB&gt;() {
     *     public void query(CommunityCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CommunityCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CommunityCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CommunityCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CommunityCQ sq);

    protected CommunityCB xcreateScalarConditionCB() {
        CommunityCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CommunityCB xcreateScalarConditionPartitionByCB() {
        CommunityCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CommunityCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommunityCB cb = new CommunityCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COMMUNITY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CommunityCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CommunityCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CommunityCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CommunityCB cb = new CommunityCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COMMUNITY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CommunityCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CommunityCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CommunityCB cb = new CommunityCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CommunityCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected CommunityCB newMyCB() {
        return new CommunityCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CommunityCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
