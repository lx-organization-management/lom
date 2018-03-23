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
import jp.luxa.lom.dbflute.allcommon.DBMetaInstanceHandler;
import jp.luxa.lom.dbflute.exentity.*;

/**
 * The entity of (勤務地)LOCATION as TABLE. <br>
 * <pre>
 * [primary-key]
 *     LOCATION_ID
 *
 * [column]
 *     LOCATION_ID, LOCATION_NAME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer locationId = entity.getLocationId();
 * String locationName = entity.getLocationName();
 * entity.setLocationId(locationId);
 * entity.setLocationName(locationName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLocation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOCATION_ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _locationId;

    /** LOCATION_NAME: {NotNull, VARCHAR(64)} */
    protected String _locationName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "location";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_locationId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsLocation) {
            BsLocation other = (BsLocation)obj;
            if (!xSV(_locationId, other._locationId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _locationId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locationName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Location clone() {
        return (Location)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOCATION_ID: {PK, ID, NotNull, INT(10)} <br>
     * @return The value of the column 'LOCATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {PK, ID, NotNull, INT(10)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setLocationId(Integer locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOCATION_NAME: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'LOCATION_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getLocationName() {
        checkSpecifiedProperty("locationName");
        return convertEmptyToNull(_locationName);
    }

    /**
     * [set] LOCATION_NAME: {NotNull, VARCHAR(64)} <br>
     * @param locationName The value of the column 'LOCATION_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setLocationName(String locationName) {
        registerModifiedProperty("locationName");
        _locationName = locationName;
    }
}
