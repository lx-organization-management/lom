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
package jp.luxa.lom.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import jp.luxa.lom.dbflute.allcommon.EntityDefinedCommonColumn;
import jp.luxa.lom.dbflute.allcommon.DBMetaInstanceHandler;
import jp.luxa.lom.dbflute.exentity.*;

/**
 * The entity of (アカウント)ACCOUNT as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ACCOUNT_ID
 *
 * [column]
 *     ACCOUNT_ID, EMPLOYEE_NO, EMAIL_ADDRESS, PASSWORD, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ACCOUNT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ACCOUNT_PROFILE(AsOne)
 *
 * [referrer table]
 *     USER_GROUPING, ACCOUNT_PROFILE
 *
 * [foreign property]
 *     accountProfileAsOne
 *
 * [referrer property]
 *     userGroupingList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer accountId = entity.getAccountId();
 * Integer employeeNo = entity.getEmployeeNo();
 * String emailAddress = entity.getEmailAddress();
 * String password = entity.getPassword();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setAccountId(accountId);
 * entity.setEmployeeNo(employeeNo);
 * entity.setEmailAddress(emailAddress);
 * entity.setPassword(password);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAccount extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _accountId;

    /** (社員番号)EMPLOYEE_NO: {NotNull, INT(10)} */
    protected Integer _employeeNo;

    /** (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)} */
    protected String _emailAddress;

    /** (パスワード)PASSWORD: {NotNull, VARCHAR(64)} */
    protected String _password;

    /** (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "account";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_accountId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** account_profile by ACCOUNT_ID, named 'accountProfileAsOne'. */
    protected OptionalEntity<AccountProfile> _accountProfileAsOne;

    /**
     * [get] account_profile by ACCOUNT_ID, named 'accountProfileAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'accountProfileAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<AccountProfile> getAccountProfileAsOne() {
        if (_accountProfileAsOne == null) { _accountProfileAsOne = OptionalEntity.relationEmpty(this, "accountProfileAsOne"); }
        return _accountProfileAsOne;
    }

    /**
     * [set] account_profile by ACCOUNT_ID, named 'accountProfileAsOne'.
     * @param accountProfileAsOne The entity of foreign property(referrer-as-one) 'accountProfileAsOne'. (NullAllowed)
     */
    public void setAccountProfileAsOne(OptionalEntity<AccountProfile> accountProfileAsOne) {
        _accountProfileAsOne = accountProfileAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (コミュニティ所属)USER_GROUPING by ACCOUNT_ID, named 'userGroupingList'. */
    protected List<UserGrouping> _userGroupingList;

    /**
     * [get] (コミュニティ所属)USER_GROUPING by ACCOUNT_ID, named 'userGroupingList'.
     * @return The entity list of referrer property 'userGroupingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserGrouping> getUserGroupingList() {
        if (_userGroupingList == null) { _userGroupingList = newReferrerList(); }
        return _userGroupingList;
    }

    /**
     * [set] (コミュニティ所属)USER_GROUPING by ACCOUNT_ID, named 'userGroupingList'.
     * @param userGroupingList The entity list of referrer property 'userGroupingList'. (NullAllowed)
     */
    public void setUserGroupingList(List<UserGrouping> userGroupingList) {
        _userGroupingList = userGroupingList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAccount) {
            BsAccount other = (BsAccount)obj;
            if (!xSV(_accountId, other._accountId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _accountId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_accountProfileAsOne != null && _accountProfileAsOne.isPresent())
        { sb.append(li).append(xbRDS(_accountProfileAsOne, "accountProfileAsOne")); }
        if (_userGroupingList != null) { for (UserGrouping et : _userGroupingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userGroupingList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_accountId));
        sb.append(dm).append(xfND(_employeeNo));
        sb.append(dm).append(xfND(_emailAddress));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_accountProfileAsOne != null && _accountProfileAsOne.isPresent())
        { sb.append(dm).append("accountProfileAsOne"); }
        if (_userGroupingList != null && !_userGroupingList.isEmpty())
        { sb.append(dm).append("userGroupingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Account clone() {
        return (Account)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'ACCOUNT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param accountId The value of the column 'ACCOUNT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountId(Integer accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
    }

    /**
     * [get] (社員番号)EMPLOYEE_NO: {NotNull, INT(10)} <br>
     * @return The value of the column 'EMPLOYEE_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getEmployeeNo() {
        checkSpecifiedProperty("employeeNo");
        return _employeeNo;
    }

    /**
     * [set] (社員番号)EMPLOYEE_NO: {NotNull, INT(10)} <br>
     * @param employeeNo The value of the column 'EMPLOYEE_NO'. (basically NotNull if update: for the constraint)
     */
    public void setEmployeeNo(Integer employeeNo) {
        registerModifiedProperty("employeeNo");
        _employeeNo = employeeNo;
    }

    /**
     * [get] (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)} <br>
     * @return The value of the column 'EMAIL_ADDRESS'. (basically NotNull if selected: for the constraint)
     */
    public String getEmailAddress() {
        checkSpecifiedProperty("emailAddress");
        return convertEmptyToNull(_emailAddress);
    }

    /**
     * [set] (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)} <br>
     * @param emailAddress The value of the column 'EMAIL_ADDRESS'. (basically NotNull if update: for the constraint)
     */
    public void setEmailAddress(String emailAddress) {
        registerModifiedProperty("emailAddress");
        _emailAddress = emailAddress;
    }

    /**
     * [get] (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * 暗号化済みパスワード
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return convertEmptyToNull(_password);
    }

    /**
     * [set] (パスワード)PASSWORD: {NotNull, VARCHAR(64)} <br>
     * 暗号化済みパスワード
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 共通カラム
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 共通カラム
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * 共通カラム
     * @return The value of the column 'UPDATE_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)} <br>
     * 共通カラム
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
