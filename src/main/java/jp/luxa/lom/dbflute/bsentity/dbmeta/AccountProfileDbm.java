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
 * The DB meta of account_profile. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AccountProfileDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AccountProfileDbm _instance = new AccountProfileDbm();
    private AccountProfileDbm() {}
    public static AccountProfileDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((AccountProfile)et).getAccountProfileId(), (et, vl) -> ((AccountProfile)et).setAccountProfileId(cti(vl)), "accountProfileId");
        setupEpg(_epgMap, et -> ((AccountProfile)et).getAccountId(), (et, vl) -> ((AccountProfile)et).setAccountId(cti(vl)), "accountId");
        setupEpg(_epgMap, et -> ((AccountProfile)et).getAccountName(), (et, vl) -> ((AccountProfile)et).setAccountName((String)vl), "accountName");
        setupEpg(_epgMap, et -> ((AccountProfile)et).getRegisterDatetime(), (et, vl) -> ((AccountProfile)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((AccountProfile)et).getUpdateDatetime(), (et, vl) -> ((AccountProfile)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
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
        setupEfpg(_efpgMap, et -> ((AccountProfile)et).getAccount(), (et, vl) -> ((AccountProfile)et).setAccount((OptionalEntity<Account>)vl), "account");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "account_profile";
    protected final String _tableDispName = "ACCOUNT_PROFILE";
    protected final String _tablePropertyName = "accountProfile";
    protected final TableSqlName _tableSqlName = new TableSqlName("ACCOUNT_PROFILE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAccountProfileId = cci("ACCOUNT_PROFILE_ID", "ACCOUNT_PROFILE_ID", null, null, Integer.class, "accountProfileId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccountId = cci("ACCOUNT_ID", "ACCOUNT_ID", null, "アカウントID", Integer.class, "accountId", null, false, false, true, "INT", 10, 0, null, null, false, null, null, "account", null, null, false);
    protected final ColumnInfo _columnAccountName = cci("ACCOUNT_NAME", "ACCOUNT_NAME", null, "氏名", String.class, "accountName", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * ACCOUNT_PROFILE_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountProfileId() { return _columnAccountProfileId; }
    /**
     * (アカウントID)ACCOUNT_ID: {UQ, NotNull, INT(10), FK to account}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountId() { return _columnAccountId; }
    /**
     * (氏名)ACCOUNT_NAME: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountName() { return _columnAccountName; }
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
        ls.add(columnAccountProfileId());
        ls.add(columnAccountId());
        ls.add(columnAccountName());
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
    protected UniqueInfo cpui() { return hpcpui(columnAccountProfileId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnAccountId()); }

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
        return cfi("FK_ACCOUNT_PROFILE_ACCOUNT", "account", this, AccountDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "accountProfileAsOne", false);
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
    public String getEntityTypeName() { return "jp.luxa.lom.dbflute.exentity.AccountProfile"; }
    public String getConditionBeanTypeName() { return "jp.luxa.lom.dbflute.cbean.AccountProfileCB"; }
    public String getBehaviorTypeName() { return "jp.luxa.lom.dbflute.exbhv.AccountProfileBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<AccountProfile> getEntityType() { return AccountProfile.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public AccountProfile newEntity() { return new AccountProfile(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((AccountProfile)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((AccountProfile)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
