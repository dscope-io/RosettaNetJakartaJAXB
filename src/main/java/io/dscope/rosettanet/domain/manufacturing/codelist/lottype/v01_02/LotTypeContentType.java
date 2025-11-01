
package io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LotTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DEV"/&gt;
 *     &lt;enumeration value="ENG"/&gt;
 *     &lt;enumeration value="EUH"/&gt;
 *     &lt;enumeration value="MFG"/&gt;
 *     &lt;enumeration value="PLT"/&gt;
 *     &lt;enumeration value="PPD"/&gt;
 *     &lt;enumeration value="PQC"/&gt;
 *     &lt;enumeration value="PRD"/&gt;
 *     &lt;enumeration value="RND"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="TST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotTypeContentType")
@XmlEnum
public enum LotTypeContentType {

    DEV,
    ENG,
    EUH,
    MFG,
    PLT,
    PPD,
    PQC,
    PRD,
    RND,
    SVC,
    TST;

    public String value() {
        return name();
    }

    public static LotTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
