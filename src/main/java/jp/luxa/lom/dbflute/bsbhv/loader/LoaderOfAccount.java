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
package jp.luxa.lom.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import jp.luxa.lom.dbflute.exbhv.*;
import jp.luxa.lom.dbflute.exentity.*;
import jp.luxa.lom.dbflute.cbean.*;

/**
 * The referrer loader of (アカウント)ACCOUNT as TABLE. <br>
 * <pre>
 * [primary key]
 *     ACCOUNT_ID
 *
 * [column]
 *     ACCOUNT_ID, EMPLOYEE_NO, EMAIL_ADDRESS, PASSWORD, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ACCOUNT_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ACCOUNT_PROFILE(AsOne)
 *
 * [referrer table]
 *     USER_GROUPING, ACCOUNT_PROFILE
 *
 * [foreign property]
 *     accountProfileAsOne
 *
 * [referrer property]
 *     userGroupingList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAccount {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Account> _selectedList;
    protected BehaviorSelector _selector;
    protected AccountBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAccount ready(List<Account> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AccountBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AccountBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<UserGrouping> _referrerUserGrouping;

    /**
     * Load referrer of userGroupingList by the set-upper of referrer. <br>
     * (コミュニティ所属)USER_GROUPING by ACCOUNT_ID, named 'userGroupingList'.
     * <pre>
     * <span style="color: #0000C0">accountBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">accountList</span>, <span style="color: #553000">accountLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">accountLoader</span>.<span style="color: #CC4747">loadUserGrouping</span>(<span style="color: #553000">groupingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">groupingCB</span>.setupSelect...
     *         <span style="color: #553000">groupingCB</span>.query().set...
     *         <span style="color: #553000">groupingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">groupingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    groupingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Account account : <span style="color: #553000">accountList</span>) {
     *     ... = account.<span style="color: #CC4747">getUserGroupingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAccountId_InScope(pkList);
     * cb.query().addOrderBy_AccountId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserGrouping> loadUserGrouping(ReferrerConditionSetupper<UserGroupingCB> refCBLambda) {
        myBhv().loadUserGrouping(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserGrouping = refLs);
        return hd -> hd.handle(new LoaderOfUserGrouping().ready(_referrerUserGrouping, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfAccountProfile _foreignAccountProfileAsOneLoader;
    public LoaderOfAccountProfile pulloutAccountProfileAsOne() {
        if (_foreignAccountProfileAsOneLoader == null)
        { _foreignAccountProfileAsOneLoader = new LoaderOfAccountProfile().ready(myBhv().pulloutAccountProfileAsOne(_selectedList), _selector); }
        return _foreignAccountProfileAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Account> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
