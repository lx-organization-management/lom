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
 * The entity of (コミュニティ所属)USER_GROUPING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     USER_GROUPING_ID
 *
 * [column]
 *     USER_GROUPING_ID, ACCOUNT_ID, COMMUNITY_ID, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_GROUPING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ACCOUNT, COMMUNITY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     account, community
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userGroupingId = entity.getUserGroupingId();
 * Integer accountId = entity.getAccountId();
 * Integer communityId = entity.getCommunityId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setUserGroupingId(userGroupingId);
 * entity.setAccountId(accountId);
 * entity.setCommunityId(communityId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserGrouping extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_GROUPING_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _userGroupingId;

    /** (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account} */
    protected Integer _accountId;

    /** (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community} */
    protected Integer _communityId;

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
        return "user_grouping";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userGroupingId == null) { return false; }
        return true;
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

    /** (ユーザコミュニティ)COMMUNITY by my COMMUNITY_ID, named 'community'. */
    protected OptionalEntity<Community> _community;

    /**
     * [get] (ユーザコミュニティ)COMMUNITY by my COMMUNITY_ID, named 'community'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'community'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Community> getCommunity() {
        if (_community == null) { _community = OptionalEntity.relationEmpty(this, "community"); }
        return _community;
    }

    /**
     * [set] (ユーザコミュニティ)COMMUNITY by my COMMUNITY_ID, named 'community'.
     * @param community The entity of foreign property 'community'. (NullAllowed)
     */
    public void setCommunity(OptionalEntity<Community> community) {
        _community = community;
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
        if (obj instanceof BsUserGrouping) {
            BsUserGrouping other = (BsUserGrouping)obj;
            if (!xSV(_userGroupingId, other._userGroupingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userGroupingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_account != null && _account.isPresent())
        { sb.append(li).append(xbRDS(_account, "account")); }
        if (_community != null && _community.isPresent())
        { sb.append(li).append(xbRDS(_community, "community")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userGroupingId));
        sb.append(dm).append(xfND(_accountId));
        sb.append(dm).append(xfND(_communityId));
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
        if (_community != null && _community.isPresent())
        { sb.append(dm).append("community"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserGrouping clone() {
        return (UserGrouping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_GROUPING_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'USER_GROUPING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserGroupingId() {
        checkSpecifiedProperty("userGroupingId");
        return _userGroupingId;
    }

    /**
     * [set] USER_GROUPING_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param userGroupingId The value of the column 'USER_GROUPING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserGroupingId(Integer userGroupingId) {
        registerModifiedProperty("userGroupingId");
        _userGroupingId = userGroupingId;
    }

    /**
     * [get] (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account} <br>
     * @return The value of the column 'ACCOUNT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account} <br>
     * @param accountId The value of the column 'ACCOUNT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountId(Integer accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
    }

    /**
     * [get] (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community} <br>
     * @return The value of the column 'COMMUNITY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCommunityId() {
        checkSpecifiedProperty("communityId");
        return _communityId;
    }

    /**
     * [set] (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community} <br>
     * @param communityId The value of the column 'COMMUNITY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCommunityId(Integer communityId) {
        registerModifiedProperty("communityId");
        _communityId = communityId;
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
