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
package jp.luxa.lom.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import jp.luxa.lom.dbflute.cbean.cq.ciq.*;
import jp.luxa.lom.dbflute.cbean.*;
import jp.luxa.lom.dbflute.cbean.cq.*;

/**
 * The base condition-query of location.
 * @author DBFlute(AutoGenerator)
 */
public class BsLocationCQ extends AbstractBsLocationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LocationCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLocationCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from location) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LocationCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LocationCIQ xcreateCIQ() {
        LocationCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LocationCIQ xnewCIQ() {
        return new LocationCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join location on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LocationCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LocationCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _locationId;
    public ConditionValue xdfgetLocationId()
    { if (_locationId == null) { _locationId = nCV(); }
      return _locationId; }
    protected ConditionValue xgetCValueLocationId() { return xdfgetLocationId(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLocationCQ addOrderBy_LocationId_Asc() { regOBA("LOCATION_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_ID: {PK, ID, NotNull, INT(10)}
     * @return this. (NotNull)
     */
    public BsLocationCQ addOrderBy_LocationId_Desc() { regOBD("LOCATION_ID"); return this; }

    protected ConditionValue _locationName;
    public ConditionValue xdfgetLocationName()
    { if (_locationName == null) { _locationName = nCV(); }
      return _locationName; }
    protected ConditionValue xgetCValueLocationName() { return xdfgetLocationName(); }

    /**
     * Add order-by as ascend. <br>
     * LOCATION_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsLocationCQ addOrderBy_LocationName_Asc() { regOBA("LOCATION_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOCATION_NAME: {NotNull, VARCHAR(64)}
     * @return this. (NotNull)
     */
    public BsLocationCQ addOrderBy_LocationName_Desc() { regOBD("LOCATION_NAME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLocationCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLocationCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LocationCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LocationCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LocationCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LocationCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LocationCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LocationCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LocationCQ> _myselfExistsMap;
    public Map<String, LocationCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LocationCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LocationCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LocationCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LocationCB.class.getName(); }
    protected String xCQ() { return LocationCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
