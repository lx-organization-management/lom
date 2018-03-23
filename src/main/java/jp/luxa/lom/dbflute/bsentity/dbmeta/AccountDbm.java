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
 * The DB meta of account. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AccountDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AccountDbm _instance = new AccountDbm();
    private AccountDbm() {}
    public static AccountDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Account)et).getAccountId(), (et, vl) -> ((Account)et).setAccountId(cti(vl)), "accountId");
        setupEpg(_epgMap, et -> ((Account)et).getEmployeeNo(), (et, vl) -> ((Account)et).setEmployeeNo(cti(vl)), "employeeNo");
        setupEpg(_epgMap, et -> ((Account)et).getEmailAddress(), (et, vl) -> ((Account)et).setEmailAddress((String)vl), "emailAddress");
        setupEpg(_epgMap, et -> ((Account)et).getPassword(), (et, vl) -> ((Account)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((Account)et).getRegisterDatetime(), (et, vl) -> ((Account)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((Account)et).getUpdateDatetime(), (et, vl) -> ((Account)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
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
        setupEfpg(_efpgMap, et -> ((Account)et).getAccountProfileAsOne(), (et, vl) -> ((Account)et).setAccountProfileAsOne((OptionalEntity<AccountProfile>)vl), "accountProfileAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "account";
    protected final String _tableDispName = "ACCOUNT";
    protected final String _tablePropertyName = "account";
    protected final TableSqlName _tableSqlName = new TableSqlName("ACCOUNT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "アカウント";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAccountId = cci("ACCOUNT_ID", "ACCOUNT_ID", null, "アカウントID", Integer.class, "accountId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, "userGroupingList", null, false);
    protected final ColumnInfo _columnEmployeeNo = cci("EMPLOYEE_NO", "EMPLOYEE_NO", null, "社員番号", Integer.class, "employeeNo", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmailAddress = cci("EMAIL_ADDRESS", "EMAIL_ADDRESS", null, "メールアドレス", String.class, "emailAddress", null, false, false, true, "VARCHAR", 129, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("PASSWORD", "PASSWORD", null, "パスワード", String.class, "password", null, false, false, true, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);

    /**
     * (アカウントID)ACCOUNT_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountId() { return _columnAccountId; }
    /**
     * (社員番号)EMPLOYEE_NO: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmployeeNo() { return _columnEmployeeNo; }
    /**
     * (メールアドレス)EMAIL_ADDRESS: {NotNull, VARCHAR(129)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmailAddress() { return _columnEmailAddress; }
    /**
     * (パスワード)PASSWORD: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
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
        ls.add(columnAccountId());
        ls.add(columnEmployeeNo());
        ls.add(columnEmailAddress());
        ls.add(columnPassword());
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
    protected UniqueInfo cpui() { return hpcpui(columnAccountId()); }
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
     * account_profile by ACCOUNT_ID, named 'accountProfileAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignAccountProfileAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAccountId(), AccountProfileDbm.getInstance().columnAccountId());
        return cfi("FK_ACCOUNT_PROFILE_ACCOUNT", "accountProfileAsOne", this, AccountProfileDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "account", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * (コミュニティ所属)USER_GROUPING by ACCOUNT_ID, named 'userGroupingList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserGroupingList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAccountId(), UserGroupingDbm.getInstance().columnAccountId());
        return cri("FK_USER_GROUPING_MEMBER", "userGroupingList", this, UserGroupingDbm.getInstance(), mp, false, "account");
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
    public String getEntityTypeName() { return "jp.luxa.lom.dbflute.exentity.Account"; }
    public String getConditionBeanTypeName() { return "jp.luxa.lom.dbflute.cbean.AccountCB"; }
    public String getBehaviorTypeName() { return "jp.luxa.lom.dbflute.exbhv.AccountBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Account> getEntityType() { return Account.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Account newEntity() { return new Account(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Account)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Account)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
