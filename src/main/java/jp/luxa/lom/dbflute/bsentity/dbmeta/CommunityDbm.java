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
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import jp.luxa.lom.dbflute.allcommon.*;
import jp.luxa.lom.dbflute.exentity.*;

/**
 * The DB meta of community. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CommunityDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CommunityDbm _instance = new CommunityDbm();
    private CommunityDbm() {}
    public static CommunityDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Community)et).getCommunityId(), (et, vl) -> ((Community)et).setCommunityId(cti(vl)), "communityId");
        setupEpg(_epgMap, et -> ((Community)et).getCommunityName(), (et, vl) -> ((Community)et).setCommunityName((String)vl), "communityName");
        setupEpg(_epgMap, et -> ((Community)et).getAccountId(), (et, vl) -> ((Community)et).setAccountId(cti(vl)), "accountId");
        setupEpg(_epgMap, et -> ((Community)et).getRegisterDatetime(), (et, vl) -> ((Community)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Community)et).getUpdateDatetime(), (et, vl) -> ((Community)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "community";
    protected final String _tableDispName = "COMMUNITY";
    protected final String _tablePropertyName = "community";
    protected final TableSqlName _tableSqlName = new TableSqlName("COMMUNITY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "ユーザコミュニティ";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCommunityId = cci("COMMUNITY_ID", "COMMUNITY_ID", null, null, Integer.class, "communityId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, "userGroupingList", null, false);
    protected final ColumnInfo _columnCommunityName = cci("COMMUNITY_NAME", "COMMUNITY_NAME", null, null, String.class, "communityName", null, false, false, true, "VARCHAR", 128, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccountId = cci("ACCOUNT_ID", "ACCOUNT_ID", null, "アカウントID", Integer.class, "accountId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * COMMUNITY_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommunityId() { return _columnCommunityId; }
    /**
     * COMMUNITY_NAME: {NotNull, VARCHAR(128)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCommunityName() { return _columnCommunityName; }
    /**
     * (アカウントID)ACCOUNT_ID: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountId() { return _columnAccountId; }
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
        ls.add(columnCommunityId());
        ls.add(columnCommunityName());
        ls.add(columnAccountId());
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
    protected UniqueInfo cpui() { return hpcpui(columnCommunityId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (コミュニティ所属)USER_GROUPING by COMMUNITY_ID, named 'userGroupingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserGroupingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCommunityId(), UserGroupingDbm.getInstance().columnCommunityId());
        return cri("FK_USER_GROUPING_COMMUNITY", "userGroupingList", this, UserGroupingDbm.getInstance(), mp, false, "community");
    }

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
    public String getEntityTypeName() { return "jp.luxa.lom.dbflute.exentity.Community"; }
    public String getConditionBeanTypeName() { return "jp.luxa.lom.dbflute.cbean.CommunityCB"; }
    public String getBehaviorTypeName() { return "jp.luxa.lom.dbflute.exbhv.CommunityBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Community> getEntityType() { return Community.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Community newEntity() { return new Community(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Community)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Community)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
