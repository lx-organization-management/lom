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
 * The abstract condition-query of user_grouping.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserGroupingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserGroupingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "user_grouping";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingId The value of userGroupingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserGroupingId_Equal(Integer userGroupingId) {
        doSetUserGroupingId_Equal(userGroupingId);
    }

    protected void doSetUserGroupingId_Equal(Integer userGroupingId) {
        regUserGroupingId(CK_EQ, userGroupingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingId The value of userGroupingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserGroupingId_NotEqual(Integer userGroupingId) {
        doSetUserGroupingId_NotEqual(userGroupingId);
    }

    protected void doSetUserGroupingId_NotEqual(Integer userGroupingId) {
        regUserGroupingId(CK_NES, userGroupingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingId The value of userGroupingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserGroupingId_GreaterThan(Integer userGroupingId) {
        regUserGroupingId(CK_GT, userGroupingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingId The value of userGroupingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserGroupingId_LessThan(Integer userGroupingId) {
        regUserGroupingId(CK_LT, userGroupingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingId The value of userGroupingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserGroupingId_GreaterEqual(Integer userGroupingId) {
        regUserGroupingId(CK_GE, userGroupingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingId The value of userGroupingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserGroupingId_LessEqual(Integer userGroupingId) {
        regUserGroupingId(CK_LE, userGroupingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of userGroupingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userGroupingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserGroupingId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserGroupingId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of userGroupingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userGroupingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserGroupingId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserGroupingId(), "USER_GROUPING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingIdList The collection of userGroupingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserGroupingId_InScope(Collection<Integer> userGroupingIdList) {
        doSetUserGroupingId_InScope(userGroupingIdList);
    }

    protected void doSetUserGroupingId_InScope(Collection<Integer> userGroupingIdList) {
        regINS(CK_INS, cTL(userGroupingIdList), xgetCValueUserGroupingId(), "USER_GROUPING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @param userGroupingIdList The collection of userGroupingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserGroupingId_NotInScope(Collection<Integer> userGroupingIdList) {
        doSetUserGroupingId_NotInScope(userGroupingIdList);
    }

    protected void doSetUserGroupingId_NotInScope(Collection<Integer> userGroupingIdList) {
        regINS(CK_NINS, cTL(userGroupingIdList), xgetCValueUserGroupingId(), "USER_GROUPING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setUserGroupingId_IsNull() { regUserGroupingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setUserGroupingId_IsNotNull() { regUserGroupingId(CK_ISNN, DOBJ); }

    protected void regUserGroupingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserGroupingId(), "USER_GROUPING_ID"); }
    protected abstract ConditionValue xgetCValueUserGroupingId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterThan(Integer accountId) {
        regAccountId(CK_GT, accountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessThan(Integer accountId) {
        regAccountId(CK_LT, accountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterEqual(Integer accountId) {
        regAccountId(CK_GE, accountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessEqual(Integer accountId) {
        regAccountId(CK_LE, accountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @param minNumber The min number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountId(), "ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
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
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
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
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
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
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @param communityId The value of communityId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_GreaterThan(Integer communityId) {
        regCommunityId(CK_GT, communityId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @param communityId The value of communityId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_LessThan(Integer communityId) {
        regCommunityId(CK_LT, communityId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @param communityId The value of communityId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_GreaterEqual(Integer communityId) {
        regCommunityId(CK_GE, communityId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @param communityId The value of communityId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommunityId_LessEqual(Integer communityId) {
        regCommunityId(CK_LE, communityId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
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
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @param minNumber The min number of communityId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of communityId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCommunityId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCommunityId(), "COMMUNITY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
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
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @param communityIdList The collection of communityId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommunityId_NotInScope(Collection<Integer> communityIdList) {
        doSetCommunityId_NotInScope(communityIdList);
    }

    protected void doSetCommunityId_NotInScope(Collection<Integer> communityIdList) {
        regINS(CK_NINS, cTL(communityIdList), xgetCValueCommunityId(), "COMMUNITY_ID");
    }

    protected void regCommunityId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommunityId(), "COMMUNITY_ID"); }
    protected abstract ConditionValue xgetCValueCommunityId();

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
    public HpSLCFunction<UserGroupingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserGroupingCB.class);
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
    public HpSLCFunction<UserGroupingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserGroupingCB.class);
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
    public HpSLCFunction<UserGroupingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserGroupingCB.class);
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
    public HpSLCFunction<UserGroupingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserGroupingCB.class);
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
    public HpSLCFunction<UserGroupingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserGroupingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserGroupingCB&gt;() {
     *     public void query(UserGroupingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserGroupingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserGroupingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserGroupingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserGroupingCQ sq);

    protected UserGroupingCB xcreateScalarConditionCB() {
        UserGroupingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserGroupingCB xcreateScalarConditionPartitionByCB() {
        UserGroupingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserGroupingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_GROUPING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserGroupingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserGroupingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserGroupingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_GROUPING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserGroupingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserGroupingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserGroupingCQ sq);

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
    protected UserGroupingCB newMyCB() {
        return new UserGroupingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserGroupingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
