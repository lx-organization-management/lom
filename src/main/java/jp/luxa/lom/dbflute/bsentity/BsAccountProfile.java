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
 * The entity of ACCOUNT_PROFILE as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ACCOUNT_PROFILE_ID
 *
 * [column]
 *     ACCOUNT_PROFILE_ID, ACCOUNT_ID, ACCOUNT_NAME, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ACCOUNT_PROFILE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ACCOUNT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     account
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer accountProfileId = entity.getAccountProfileId();
 * Integer accountId = entity.getAccountId();
 * String accountName = entity.getAccountName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setAccountProfileId(accountProfileId);
 * entity.setAccountId(accountId);
 * entity.setAccountName(accountName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAccountProfile extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _accountProfileId;

    /** (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account} */
    protected Integer _accountId;

    /** (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)} */
    protected String _accountName;

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
        return "account_profile";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_accountProfileId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param accountId (アカウントID): UQ, NotNull, INT(10), FK to account. (NotNull)
     */
    public void uniqueBy(Integer accountId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("accountId");
        setAccountId(accountId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** (アカウント)ACCOUNT by my ACCOUNT_ID, named 'account'. */
    protected OptionalEntity<Account> _account;

    /**
     * [get] (アカウント)ACCOUNT by my ACCOUNT_ID, named 'account'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'account'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Account> getAccount() {
        if (_account == null) { _account = OptionalEntity.relationEmpty(this, "account"); }
        return _account;
    }

    /**
     * [set] (アカウント)ACCOUNT by my ACCOUNT_ID, named 'account'.
     * @param account The entity of foreign property 'account'. (NullAllowed)
     */
    public void setAccount(OptionalEntity<Account> account) {
        _account = account;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsAccountProfile) {
            BsAccountProfile other = (BsAccountProfile)obj;
            if (!xSV(_accountProfileId, other._accountProfileId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _accountProfileId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_account != null && _account.isPresent())
        { sb.append(li).append(xbRDS(_account, "account")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_accountProfileId));
        sb.append(dm).append(xfND(_accountId));
        sb.append(dm).append(xfND(_accountName));
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
        if (_account != null && _account.isPresent())
        { sb.append(dm).append("account"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public AccountProfile clone() {
        return (AccountProfile)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'ACCOUNT_PROFILE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAccountProfileId() {
        checkSpecifiedProperty("accountProfileId");
        return _accountProfileId;
    }

    /**
     * [set] ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param accountProfileId The value of the column 'ACCOUNT_PROFILE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountProfileId(Integer accountProfileId) {
        registerModifiedProperty("accountProfileId");
        _accountProfileId = accountProfileId;
    }

    /**
     * [get] (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account} <br>
     * @return The value of the column 'ACCOUNT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account} <br>
     * @param accountId The value of the column 'ACCOUNT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountId(Integer accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
    }

    /**
     * [get] (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'ACCOUNT_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getAccountName() {
        checkSpecifiedProperty("accountName");
        return convertEmptyToNull(_accountName);
    }

    /**
     * [set] (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)} <br>
     * @param accountName The value of the column 'ACCOUNT_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setAccountName(String accountName) {
        registerModifiedProperty("accountName");
        _accountName = accountName;
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
