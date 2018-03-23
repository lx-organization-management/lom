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
 * The abstract condition-query of account_profile.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAccountProfileCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAccountProfileCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "account_profile";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileId The value of accountProfileId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountProfileId_Equal(Integer accountProfileId) {
        doSetAccountProfileId_Equal(accountProfileId);
    }

    protected void doSetAccountProfileId_Equal(Integer accountProfileId) {
        regAccountProfileId(CK_EQ, accountProfileId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileId The value of accountProfileId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountProfileId_NotEqual(Integer accountProfileId) {
        doSetAccountProfileId_NotEqual(accountProfileId);
    }

    protected void doSetAccountProfileId_NotEqual(Integer accountProfileId) {
        regAccountProfileId(CK_NES, accountProfileId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileId The value of accountProfileId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountProfileId_GreaterThan(Integer accountProfileId) {
        regAccountProfileId(CK_GT, accountProfileId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileId The value of accountProfileId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountProfileId_LessThan(Integer accountProfileId) {
        regAccountProfileId(CK_LT, accountProfileId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileId The value of accountProfileId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountProfileId_GreaterEqual(Integer accountProfileId) {
        regAccountProfileId(CK_GE, accountProfileId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileId The value of accountProfileId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountProfileId_LessEqual(Integer accountProfileId) {
        regAccountProfileId(CK_LE, accountProfileId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of accountProfileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountProfileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setAccountProfileId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setAccountProfileId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of accountProfileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountProfileId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountProfileId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountProfileId(), "ACCOUNT_PROFILE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileIdList The collection of accountProfileId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountProfileId_InScope(Collection<Integer> accountProfileIdList) {
        doSetAccountProfileId_InScope(accountProfileIdList);
    }

    protected void doSetAccountProfileId_InScope(Collection<Integer> accountProfileIdList) {
        regINS(CK_INS, cTL(accountProfileIdList), xgetCValueAccountProfileId(), "ACCOUNT_PROFILE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @param accountProfileIdList The collection of accountProfileId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountProfileId_NotInScope(Collection<Integer> accountProfileIdList) {
        doSetAccountProfileId_NotInScope(accountProfileIdList);
    }

    protected void doSetAccountProfileId_NotInScope(Collection<Integer> accountProfileIdList) {
        regINS(CK_NINS, cTL(accountProfileIdList), xgetCValueAccountProfileId(), "ACCOUNT_PROFILE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setAccountProfileId_IsNull() { regAccountProfileId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setAccountProfileId_IsNotNull() { regAccountProfileId(CK_ISNN, DOBJ); }

    protected void regAccountProfileId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountProfileId(), "ACCOUNT_PROFILE_ID"); }
    protected abstract ConditionValue xgetCValueAccountProfileId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterThan(Integer accountId) {
        regAccountId(CK_GT, accountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessThan(Integer accountId) {
        regAccountId(CK_LT, accountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterEqual(Integer accountId) {
        regAccountId(CK_GE, accountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @param accountId The value of accountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessEqual(Integer accountId) {
        regAccountId(CK_LE, accountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @param minNumber The min number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountId(), "ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
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
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)}
     * @param accountName The value of accountName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountName_Equal(String accountName) {
        doSetAccountName_Equal(fRES(accountName));
    }

    protected void doSetAccountName_Equal(String accountName) {
        regAccountName(CK_EQ, accountName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setAccountName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param accountName The value of accountName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountName_LikeSearch(String accountName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountName_LikeSearch(accountName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setAccountName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accountName The value of accountName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAccountName_LikeSearch(String accountName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accountName), xgetCValueAccountName(), "ACCOUNT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)}
     * @param accountName The value of accountName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAccountName_NotLikeSearch(String accountName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAccountName_NotLikeSearch(accountName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)}
     * @param accountName The value of accountName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAccountName_NotLikeSearch(String accountName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accountName), xgetCValueAccountName(), "ACCOUNT_NAME", likeSearchOption);
    }

    protected void regAccountName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountName(), "ACCOUNT_NAME"); }
    protected abstract ConditionValue xgetCValueAccountName();

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
    public HpSLCFunction<AccountProfileCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AccountProfileCB.class);
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
    public HpSLCFunction<AccountProfileCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AccountProfileCB.class);
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
    public HpSLCFunction<AccountProfileCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AccountProfileCB.class);
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
    public HpSLCFunction<AccountProfileCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AccountProfileCB.class);
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
    public HpSLCFunction<AccountProfileCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AccountProfileCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AccountProfileCB&gt;() {
     *     public void query(AccountProfileCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountProfileCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AccountProfileCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountProfileCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AccountProfileCQ sq);

    protected AccountProfileCB xcreateScalarConditionCB() {
        AccountProfileCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AccountProfileCB xcreateScalarConditionPartitionByCB() {
        AccountProfileCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AccountProfileCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountProfileCB cb = new AccountProfileCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ACCOUNT_PROFILE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AccountProfileCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AccountProfileCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AccountProfileCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountProfileCB cb = new AccountProfileCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ACCOUNT_PROFILE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AccountProfileCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AccountProfileCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AccountProfileCB cb = new AccountProfileCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AccountProfileCQ sq);

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
    protected AccountProfileCB newMyCB() {
        return new AccountProfileCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AccountProfileCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
