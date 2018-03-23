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

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import jp.luxa.lom.dbflute.allcommon.EntityDefinedCommonColumn;
import jp.luxa.lom.dbflute.allcommon.DBMetaInstanceHandler;
import jp.luxa.lom.dbflute.exentity.*;

/**
 * The entity of (ユーザコミュニティ)COMMUNITY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     COMMUNITY_ID
 *
 * [column]
 *     COMMUNITY_ID, COMMUNITY_NAME, ACCOUNT_ID, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COMMUNITY_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     USER_GROUPING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     userGroupingList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer communityId = entity.getCommunityId();
 * String communityName = entity.getCommunityName();
 * Integer accountId = entity.getAccountId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setCommunityId(communityId);
 * entity.setCommunityName(communityName);
 * entity.setAccountId(accountId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsCommunity extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** COMMUNITY_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _communityId;

    /** COMMUNITY_NAME: {NotNull, VARCHAR(128)} */
    protected String _communityName;

    /** (アカウントID)ACCOUNT_ID: {NotNull, INT(10)} */
    protected Integer _accountId;

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
        return "community";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_communityId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (コミュニティ所属)USER_GROUPING by COMMUNITY_ID, named 'userGroupingList'. */
    protected List<UserGrouping> _userGroupingList;

    /**
     * [get] (コミュニティ所属)USER_GROUPING by COMMUNITY_ID, named 'userGroupingList'.
     * @return The entity list of referrer property 'userGroupingList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserGrouping> getUserGroupingList() {
        if (_userGroupingList == null) { _userGroupingList = newReferrerList(); }
        return _userGroupingList;
    }

    /**
     * [set] (コミュニティ所属)USER_GROUPING by COMMUNITY_ID, named 'userGroupingList'.
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
        if (obj instanceof BsCommunity) {
            BsCommunity other = (BsCommunity)obj;
            if (!xSV(_communityId, other._communityId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _communityId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userGroupingList != null) { for (UserGrouping et : _userGroupingList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userGroupingList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_communityId));
        sb.append(dm).append(xfND(_communityName));
        sb.append(dm).append(xfND(_accountId));
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
        if (_userGroupingList != null && !_userGroupingList.isEmpty())
        { sb.append(dm).append("userGroupingList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Community clone() {
        return (Community)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] COMMUNITY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'COMMUNITY_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getCommunityId() {
        checkSpecifiedProperty("communityId");
        return _communityId;
    }

    /**
     * [set] COMMUNITY_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param communityId The value of the column 'COMMUNITY_ID'. (basically NotNull if update: for the constraint)
     */
    public void setCommunityId(Integer communityId) {
        registerModifiedProperty("communityId");
        _communityId = communityId;
    }

    /**
     * [get] COMMUNITY_NAME: {NotNull, VARCHAR(128)} <br>
     * @return The value of the column 'COMMUNITY_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getCommunityName() {
        checkSpecifiedProperty("communityName");
        return convertEmptyToNull(_communityName);
    }

    /**
     * [set] COMMUNITY_NAME: {NotNull, VARCHAR(128)} <br>
     * @param communityName The value of the column 'COMMUNITY_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setCommunityName(String communityName) {
        registerModifiedProperty("communityName");
        _communityName = communityName;
    }

    /**
     * [get] (アカウントID)ACCOUNT_ID: {NotNull, INT(10)} <br>
     * 代表者アカウントID
     * @return The value of the column 'ACCOUNT_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] (アカウントID)ACCOUNT_ID: {NotNull, INT(10)} <br>
     * 代表者アカウントID
     * @param accountId The value of the column 'ACCOUNT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountId(Integer accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
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
