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
 * The referrer loader of (ユーザコミュニティ)COMMUNITY as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfCommunity {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Community> _selectedList;
    protected BehaviorSelector _selector;
    protected CommunityBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfCommunity ready(List<Community> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected CommunityBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(CommunityBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<UserGrouping> _referrerUserGrouping;

    /**
     * Load referrer of userGroupingList by the set-upper of referrer. <br>
     * (コミュニティ所属)USER_GROUPING by COMMUNITY_ID, named 'userGroupingList'.
     * <pre>
     * <span style="color: #0000C0">communityBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">communityList</span>, <span style="color: #553000">communityLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">communityLoader</span>.<span style="color: #CC4747">loadUserGrouping</span>(<span style="color: #553000">groupingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">groupingCB</span>.setupSelect...
     *         <span style="color: #553000">groupingCB</span>.query().set...
     *         <span style="color: #553000">groupingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">groupingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    groupingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Community community : <span style="color: #553000">communityList</span>) {
     *     ... = community.<span style="color: #CC4747">getUserGroupingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCommunityId_InScope(pkList);
     * cb.query().addOrderBy_CommunityId_Asc();
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
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Community> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
