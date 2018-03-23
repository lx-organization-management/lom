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
 * The referrer loader of (勤務地)LOCATION as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLocation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Location> _selectedList;
    protected BehaviorSelector _selector;
    protected LocationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLocation ready(List<Location> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LocationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LocationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Location> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
