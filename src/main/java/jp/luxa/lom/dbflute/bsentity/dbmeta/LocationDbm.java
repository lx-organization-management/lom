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
 * The DB meta of location. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LocationDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LocationDbm _instance = new LocationDbm();
    private LocationDbm() {}
    public static LocationDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Location)et).getLocationId(), (et, vl) -> ((Location)et).setLocationId(cti(vl)), "locationId");
        setupEpg(_epgMap, et -> ((Location)et).getLocationName(), (et, vl) -> ((Location)et).setLocationName((String)vl), "locationName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "location";
    protected final String _tableDispName = "LOCATION";
    protected final String _tablePropertyName = "location";
    protected final TableSqlName _tableSqlName = new TableSqlName("LOCATION", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "勤務地";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLocationId = cci("LOCATION_ID", "LOCATION_ID", null, null, Integer.class, "locationId", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLocationName = cci("LOCATION_NAME", "LOCATION_NAME", null, null, String.class, "locationName", null, false, false, true, "VARCHAR", 64, 0, null, null, false, null, null, null, null, null, false);

    /**
     * LOCATION_ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationId() { return _columnLocationId; }
    /**
     * LOCATION_NAME: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLocationName() { return _columnLocationName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLocationId());
        ls.add(columnLocationName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLocationId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "jp.luxa.lom.dbflute.exentity.Location"; }
    public String getConditionBeanTypeName() { return "jp.luxa.lom.dbflute.cbean.LocationCB"; }
    public String getBehaviorTypeName() { return "jp.luxa.lom.dbflute.exbhv.LocationBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Location> getEntityType() { return Location.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Location newEntity() { return new Location(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Location)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Location)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
