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
 * The referrer loader of ACCOUNT_PROFILE as TABLE. <br>
 * <pre>
 * [primary key]
 *     ACCOUNT_PROFILE_ID
 *
 * [column]
 *     ACCOUNT_PROFILE_ID, ACCOUNT_ID, ACCOUNT_NAME, REGISTER_DATETIME, UPDATE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ACCOUNT_PROFILE_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     ACCOUNT
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     account
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfAccountProfile {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<AccountProfile> _selectedList;
    protected BehaviorSelector _selector;
    protected AccountProfileBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfAccountProfile ready(List<AccountProfile> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected AccountProfileBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(AccountProfileBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfAccount _foreignAccountLoader;
    public LoaderOfAccount pulloutAccount() {
        if (_foreignAccountLoader == null)
        { _foreignAccountLoader = new LoaderOfAccount().ready(myBhv().pulloutAccount(_selectedList), _selector); }
        return _foreignAccountLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<AccountProfile> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
