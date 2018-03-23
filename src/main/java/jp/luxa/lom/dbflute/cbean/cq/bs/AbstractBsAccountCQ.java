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
 * The abstract condition-query of account.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAccountCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAccountCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "account";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
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
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
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
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @param accountId The value of accountId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterThan(Integer accountId) {
        regAccountId(CK_GT, accountId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @param accountId The value of accountId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessThan(Integer accountId) {
        regAccountId(CK_LT, accountId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @param accountId The value of accountId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_GreaterEqual(Integer accountId) {
        regAccountId(CK_GE, accountId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @param accountId The value of accountId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAccountId_LessEqual(Integer accountId) {
        regAccountId(CK_LE, accountId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
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
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of accountId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setAccountId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAccountId(), "ACCOUNT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
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
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @param accountIdList The collection of accountId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountId_NotInScope(Collection<Integer> accountIdList) {
        doSetAccountId_NotInScope(accountIdList);
    }

    protected void doSetAccountId_NotInScope(Collection<Integer> accountIdList) {
        regINS(CK_NINS, cTL(accountIdList), xgetCValueAccountId(), "ACCOUNT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ACCOUNT_ID from user_grouping where ...)} <br>
     * (コミュニティ所属)user_grouping by ACCOUNT_ID, named 'userGroupingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAccountId_ExistsReferrer_UserGroupingList(cb.query());
        registerExistsReferrer(cb.query(), "ACCOUNT_ID", "ACCOUNT_ID", pp, "userGroupingList");
    }
    public abstract String keepAccountId_ExistsReferrer_UserGroupingList(UserGroupingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ACCOUNT_ID from user_grouping where ...)} <br>
     * (コミュニティ所属)user_grouping by ACCOUNT_ID, named 'userGroupingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserGrouping</span>(groupingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     groupingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of AccountId_NotExistsReferrer_UserGroupingList for 'not exists'. (NotNull)
     */
    public void notExistsUserGrouping(SubQuery<UserGroupingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepAccountId_NotExistsReferrer_UserGroupingList(cb.query());
        registerNotExistsReferrer(cb.query(), "ACCOUNT_ID", "ACCOUNT_ID", pp, "userGroupingList");
    }
    public abstract String keepAccountId_NotExistsReferrer_UserGroupingList(UserGroupingCQ sq);

    public void xsderiveUserGroupingList(String fn, SubQuery<UserGroupingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserGroupingCB cb = new UserGroupingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepAccountId_SpecifyDerivedReferrer_UserGroupingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "ACCOUNT_ID", "ACCOUNT_ID", pp, "userGroupingList", al, op);
    }
    public abstract String keepAccountId_SpecifyDerivedReferrer_UserGroupingList(UserGroupingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from user_grouping where ...)} <br>
     * (コミュニティ所属)user_grouping by ACCOUNT_ID, named 'userGroupingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepAccountId_QueryDerivedReferrer_UserGroupingList(cb.query()); String prpp = keepAccountId_QueryDerivedReferrer_UserGroupingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "ACCOUNT_ID", "ACCOUNT_ID", sqpp, "userGroupingList", rd, vl, prpp, op);
    }
    public abstract String keepAccountId_QueryDerivedReferrer_UserGroupingList(UserGroupingCQ sq);
    public abstract String keepAccountId_QueryDerivedReferrer_UserGroupingListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setAccountId_IsNull() { regAccountId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setAccountId_IsNotNull() { regAccountId(CK_ISNN, DOBJ); }

    protected void regAccountId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountId(), "ACCOUNT_ID"); }
    protected abstract ConditionValue xgetCValueAccountId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNo The value of employeeNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmployeeNo_Equal(Integer employeeNo) {
        doSetEmployeeNo_Equal(employeeNo);
    }

    protected void doSetEmployeeNo_Equal(Integer employeeNo) {
        regEmployeeNo(CK_EQ, employeeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNo The value of employeeNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmployeeNo_NotEqual(Integer employeeNo) {
        doSetEmployeeNo_NotEqual(employeeNo);
    }

    protected void doSetEmployeeNo_NotEqual(Integer employeeNo) {
        regEmployeeNo(CK_NES, employeeNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNo The value of employeeNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmployeeNo_GreaterThan(Integer employeeNo) {
        regEmployeeNo(CK_GT, employeeNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNo The value of employeeNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmployeeNo_LessThan(Integer employeeNo) {
        regEmployeeNo(CK_LT, employeeNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNo The value of employeeNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmployeeNo_GreaterEqual(Integer employeeNo) {
        regEmployeeNo(CK_GE, employeeNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNo The value of employeeNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEmployeeNo_LessEqual(Integer employeeNo) {
        regEmployeeNo(CK_LE, employeeNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param minNumber The min number of employeeNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of employeeNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setEmployeeNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setEmployeeNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param minNumber The min number of employeeNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of employeeNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setEmployeeNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueEmployeeNo(), "EMPLOYEE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNoList The collection of employeeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_InScope(Collection<Integer> employeeNoList) {
        doSetEmployeeNo_InScope(employeeNoList);
    }

    protected void doSetEmployeeNo_InScope(Collection<Integer> employeeNoList) {
        regINS(CK_INS, cTL(employeeNoList), xgetCValueEmployeeNo(), "EMPLOYEE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @param employeeNoList The collection of employeeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmployeeNo_NotInScope(Collection<Integer> employeeNoList) {
        doSetEmployeeNo_NotInScope(employeeNoList);
    }

    protected void doSetEmployeeNo_NotInScope(Collection<Integer> employeeNoList) {
        regINS(CK_NINS, cTL(employeeNoList), xgetCValueEmployeeNo(), "EMPLOYEE_NO");
    }

    protected void regEmployeeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmployeeNo(), "EMPLOYEE_NO"); }
    protected abstract ConditionValue xgetCValueEmployeeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @param emailAddress The value of emailAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmailAddress_Equal(String emailAddress) {
        doSetEmailAddress_Equal(fRES(emailAddress));
    }

    protected void doSetEmailAddress_Equal(String emailAddress) {
        regEmailAddress(CK_EQ, emailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @param emailAddress The value of emailAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmailAddress_NotEqual(String emailAddress) {
        doSetEmailAddress_NotEqual(fRES(emailAddress));
    }

    protected void doSetEmailAddress_NotEqual(String emailAddress) {
        regEmailAddress(CK_NES, emailAddress);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @param emailAddressList The collection of emailAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmailAddress_InScope(Collection<String> emailAddressList) {
        doSetEmailAddress_InScope(emailAddressList);
    }

    protected void doSetEmailAddress_InScope(Collection<String> emailAddressList) {
        regINS(CK_INS, cTL(emailAddressList), xgetCValueEmailAddress(), "EMAIL_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @param emailAddressList The collection of emailAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmailAddress_NotInScope(Collection<String> emailAddressList) {
        doSetEmailAddress_NotInScope(emailAddressList);
    }

    protected void doSetEmailAddress_NotInScope(Collection<String> emailAddressList) {
        regINS(CK_NINS, cTL(emailAddressList), xgetCValueEmailAddress(), "EMAIL_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)} <br>
     * <pre>e.g. setEmailAddress_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param emailAddress The value of emailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmailAddress_LikeSearch(String emailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmailAddress_LikeSearch(emailAddress, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)} <br>
     * <pre>e.g. setEmailAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param emailAddress The value of emailAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setEmailAddress_LikeSearch(String emailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(emailAddress), xgetCValueEmailAddress(), "EMAIL_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @param emailAddress The value of emailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setEmailAddress_NotLikeSearch(String emailAddress, ConditionOptionCall<LikeSearchOption> opLambda) {
        setEmailAddress_NotLikeSearch(emailAddress, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @param emailAddress The value of emailAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setEmailAddress_NotLikeSearch(String emailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(emailAddress), xgetCValueEmailAddress(), "EMAIL_ADDRESS", likeSearchOption);
    }

    protected void regEmailAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmailAddress(), "EMAIL_ADDRESS"); }
    protected abstract ConditionValue xgetCValueEmailAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

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
    public HpSLCFunction<AccountCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, AccountCB.class);
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
    public HpSLCFunction<AccountCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, AccountCB.class);
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
    public HpSLCFunction<AccountCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, AccountCB.class);
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
    public HpSLCFunction<AccountCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, AccountCB.class);
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
    public HpSLCFunction<AccountCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, AccountCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AccountCB&gt;() {
     *     public void query(AccountCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<AccountCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, AccountCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(AccountCQ sq);

    protected AccountCB xcreateScalarConditionCB() {
        AccountCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected AccountCB xcreateScalarConditionPartitionByCB() {
        AccountCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<AccountCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountCB cb = new AccountCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ACCOUNT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(AccountCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AccountCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(AccountCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        AccountCB cb = new AccountCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ACCOUNT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(AccountCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<AccountCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        AccountCB cb = new AccountCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(AccountCQ sq);

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
    protected AccountCB newMyCB() {
        return new AccountCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return AccountCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
