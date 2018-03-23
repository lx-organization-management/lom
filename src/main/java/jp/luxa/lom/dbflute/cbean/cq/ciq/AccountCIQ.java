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
package jp.luxa.lom.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import jp.luxa.lom.dbflute.cbean.*;
import jp.luxa.lom.dbflute.cbean.cq.bs.*;
import jp.luxa.lom.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of account.
 * @author DBFlute(AutoGenerator)
 */
public class AccountCIQ extends AbstractBsAccountCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsAccountCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AccountCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsAccountCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueAccountId() { return _myCQ.xdfgetAccountId(); }
    public String keepAccountId_ExistsReferrer_UserGroupingList(UserGroupingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAccountId_NotExistsReferrer_UserGroupingList(UserGroupingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAccountId_SpecifyDerivedReferrer_UserGroupingList(UserGroupingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAccountId_QueryDerivedReferrer_UserGroupingList(UserGroupingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAccountId_QueryDerivedReferrer_UserGroupingListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueEmployeeNo() { return _myCQ.xdfgetEmployeeNo(); }
    protected ConditionValue xgetCValueEmailAddress() { return _myCQ.xdfgetEmailAddress(); }
    protected ConditionValue xgetCValuePassword() { return _myCQ.xdfgetPassword(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(AccountCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(AccountCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(AccountCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(AccountCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return AccountCB.class.getName(); }
    protected String xinCQ() { return AccountCQ.class.getName(); }
}
