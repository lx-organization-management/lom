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
 * The entity of (退会理由)WITHDRAWAL_REASON as TABLE. <br>
 * 会員に選ばせる定型的な退会理由のマスタ。そういえば、これ表示順カラムがないですねぇ...
 * <pre>
 * [primary-key]
 *     WITHDRAWAL_REASON_CODE
 *
 * [column]
 *     WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_TEXT, DISPLAY_ORDER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     MEMBER_WITHDRAWAL
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberWithdrawalList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String withdrawalReasonCode = entity.getWithdrawalReasonCode();
 * String withdrawalReasonText = entity.getWithdrawalReasonText();
 * Integer displayOrder = entity.getDisplayOrder();
 * entity.setWithdrawalReasonCode(withdrawalReasonCode);
 * entity.setWithdrawalReasonText(withdrawalReasonText);
 * entity.setDisplayOrder(displayOrder);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWithdrawalReason extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} */
    protected String _withdrawalReasonCode;

    /** (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, TEXT(65535)} */
    protected String _withdrawalReasonText;

    /** (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)} */
    protected Integer _displayOrder;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "withdrawal_reason";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_withdrawalReasonCode == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param displayOrder (表示順): UQ, NotNull, INT(10). (NotNull)
     */
    public void uniqueBy(Integer displayOrder) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("displayOrder");
        setDisplayOrder(displayOrder);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'. */
    protected List<MemberWithdrawal> _memberWithdrawalList;

    /**
     * [get] (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @return The entity list of referrer property 'memberWithdrawalList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MemberWithdrawal> getMemberWithdrawalList() {
        if (_memberWithdrawalList == null) { _memberWithdrawalList = newReferrerList(); }
        return _memberWithdrawalList;
    }

    /**
     * [set] (会員退会情報)MEMBER_WITHDRAWAL by WITHDRAWAL_REASON_CODE, named 'memberWithdrawalList'.
     * @param memberWithdrawalList The entity list of referrer property 'memberWithdrawalList'. (NullAllowed)
     */
    public void setMemberWithdrawalList(List<MemberWithdrawal> memberWithdrawalList) {
        _memberWithdrawalList = memberWithdrawalList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWithdrawalReason) {
            BsWithdrawalReason other = (BsWithdrawalReason)obj;
            if (!xSV(_withdrawalReasonCode, other._withdrawalReasonCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _withdrawalReasonCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_memberWithdrawalList != null) { for (MemberWithdrawal et : _memberWithdrawalList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "memberWithdrawalList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_withdrawalReasonCode));
        sb.append(dm).append(xfND(_withdrawalReasonText));
        sb.append(dm).append(xfND(_displayOrder));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_memberWithdrawalList != null && !_memberWithdrawalList.isEmpty())
        { sb.append(dm).append("memberWithdrawalList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WithdrawalReason clone() {
        return (WithdrawalReason)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} <br>
     * @return The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getWithdrawalReasonCode() {
        checkSpecifiedProperty("withdrawalReasonCode");
        return convertEmptyToNull(_withdrawalReasonCode);
    }

    /**
     * [set] (退会理由コード)WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)} <br>
     * @param withdrawalReasonCode The value of the column 'WITHDRAWAL_REASON_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonCode(String withdrawalReasonCode) {
        registerModifiedProperty("withdrawalReasonCode");
        _withdrawalReasonCode = withdrawalReasonCode;
    }

    /**
     * [get] (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, TEXT(65535)} <br>
     * 退会理由の内容。<br>
     * テキスト形式なので目いっぱい書けるが、そうするとUI側できれいに見せるのが大変でしょうね。
     * @return The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if selected: for the constraint)
     */
    public String getWithdrawalReasonText() {
        checkSpecifiedProperty("withdrawalReasonText");
        return convertEmptyToNull(_withdrawalReasonText);
    }

    /**
     * [set] (退会理由テキスト)WITHDRAWAL_REASON_TEXT: {NotNull, TEXT(65535)} <br>
     * 退会理由の内容。<br>
     * テキスト形式なので目いっぱい書けるが、そうするとUI側できれいに見せるのが大変でしょうね。
     * @param withdrawalReasonText The value of the column 'WITHDRAWAL_REASON_TEXT'. (basically NotNull if update: for the constraint)
     */
    public void setWithdrawalReasonText(String withdrawalReasonText) {
        registerModifiedProperty("withdrawalReasonText");
        _withdrawalReasonText = withdrawalReasonText;
    }

    /**
     * [get] (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)} <br>
     * もう、ご想像の通りです。
     * @return The value of the column 'DISPLAY_ORDER'. (basically NotNull if selected: for the constraint)
     */
    public Integer getDisplayOrder() {
        checkSpecifiedProperty("displayOrder");
        return _displayOrder;
    }

    /**
     * [set] (表示順)DISPLAY_ORDER: {UQ, NotNull, INT(10)} <br>
     * もう、ご想像の通りです。
     * @param displayOrder The value of the column 'DISPLAY_ORDER'. (basically NotNull if update: for the constraint)
     */
    public void setDisplayOrder(Integer displayOrder) {
        registerModifiedProperty("displayOrder");
        _displayOrder = displayOrder;
    }
}
