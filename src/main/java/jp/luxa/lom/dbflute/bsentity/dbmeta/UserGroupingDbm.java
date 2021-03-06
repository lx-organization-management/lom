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
package jp.luxa.lom.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import jp.luxa.lom.dbflute.allcommon.*;
import jp.luxa.lom.dbflute.exentity.*;

/**
 * The DB meta of user_grouping. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserGroupingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserGroupingDbm _instance = new UserGroupingDbm();
    private UserGroupingDbm() {}
    public static UserGroupingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((UserGrouping)et).getUserGroupingId(), (et, vl) -> ((UserGrouping)et).setUserGroupingId(cti(vl)), "userGroupingId");
        setupEpg(_epgMap, et -> ((UserGrouping)et).getAccountId(), (et, vl) -> ((UserGrouping)et).setAccountId(cti(vl)), "accountId");
        setupEpg(_epgMap, et -> ((UserGrouping)et).getCommunityId(), (et, vl) -> ((UserGrouping)et).setCommunityId(cti(vl)), "communityId");
        setupEpg(_epgMap, et -> ((UserGrouping)et).getRegisterDatetime(), (et, vl) -> ((UserGrouping)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((UserGrouping)et).getUpdateDatetime(), (et, vl) -> ((UserGrouping)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((UserGrouping)et).getAccount(), (et, vl) -> ((UserGrouping)et).setAccount((OptionalEntity<Account>)vl), "account");
        setupEfpg(_efpgMap, et -> ((UserGrouping)et).getCommunity(), (et, vl) -> ((UserGrouping)et).setCommunity((OptionalEntity<Community>)vl), "community");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user_grouping";
    protected final String _tableDispName = "USER_GROUPING";
    protected final String _tablePropertyName = "userGrouping";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER_GROUPING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "コミュニティ所属";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserGroupingId = cci("USER_GROUPING_ID", "USER_GROUPING_ID", null, null, Integer.class, "userGroupingId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccountId = cci("ACCOUNT_ID", "ACCOUNT_ID", null, "アカウントID", Integer.class, "accountId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "account", null, null, false);
    protected final ColumnInfo _columnCommunityId = cci("COMMUNITY_ID", "COMMUNITY_ID", null, "コミュニティID", Integer.class, "communityId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "community", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * USER_GROUPING_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserGroupingId() { return _columnUserGroupingId; }
    /**
     * (アカウントID)ACCOUNT_ID: {IX, NotNull, INT(10), FK to account}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountId() { return _columnAccountId; }
    /**
     * (コミュニティID)COMMUNITY_ID: {IX, NotNull, INT(10), FK to community}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommunityId() { return _columnCommunityId; }
    /**
     * (登録日時)REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (更新日時)UPDATE_DATETIME: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserGroupingId());
        ls.add(columnAccountId());
        ls.add(columnCommunityId());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserGroupingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * (アカウント)ACCOUNT by my ACCOUNT_ID, named 'account'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAccount() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAccountId(), AccountDbm.getInstance().columnAccountId());
        return cfi("FK_USER_GROUPING_MEMBER", "account", this, AccountDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userGroupingList", false);
    }
    /**
     * (ユーザコミュニティ)COMMUNITY by my COMMUNITY_ID, named 'community'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCommunity() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCommunityId(), CommunityDbm.getInstance().columnCommunityId());
        return cfi("FK_USER_GROUPING_COMMUNITY", "community", this, CommunityDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userGroupingList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.luxa.lom.dbflute.exentity.UserGrouping"; }
    public String getConditionBeanTypeName() { return "jp.luxa.lom.dbflute.cbean.UserGroupingCB"; }
    public String getBehaviorTypeName() { return "jp.luxa.lom.dbflute.exbhv.UserGroupingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserGrouping> getEntityType() { return UserGrouping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserGrouping newEntity() { return new UserGrouping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserGrouping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserGrouping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
