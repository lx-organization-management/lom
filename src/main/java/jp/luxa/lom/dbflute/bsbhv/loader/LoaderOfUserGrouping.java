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
import jp.luxa.lom.dbflute.exbhv.*;
import jp.luxa.lom.dbflute.exentity.*;

/**
 * The referrer loader of (コミュニティ所属)USER_GROUPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_GROUPING_ID
 *
 * [column]
 *     USER_GROUPING_ID, ACCOUNT_ID, COMMUNITY_ID, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_GROUPING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ACCOUNT, COMMUNITY
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     account, community
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserGrouping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserGrouping> _selectedList;
    protected BehaviorSelector _selector;
    protected UserGroupingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserGrouping ready(List<UserGrouping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserGroupingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserGroupingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfAccount _foreignAccountLoader;
    public LoaderOfAccount pulloutAccount() {
        if (_foreignAccountLoader == null)
        { _foreignAccountLoader = new LoaderOfAccount().ready(myBhv().pulloutAccount(_selectedList), _selector); }
        return _foreignAccountLoader;
    }

    protected LoaderOfCommunity _foreignCommunityLoader;
    public LoaderOfCommunity pulloutCommunity() {
        if (_foreignCommunityLoader == null)
        { _foreignCommunityLoader = new LoaderOfCommunity().ready(myBhv().pulloutCommunity(_selectedList), _selector); }
        return _foreignCommunityLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserGrouping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
