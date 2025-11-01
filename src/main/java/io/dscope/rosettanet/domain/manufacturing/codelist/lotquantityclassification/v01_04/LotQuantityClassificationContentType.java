
package io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotQuantityClassificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LotQuantityClassificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="BON"/&gt;
 *     &lt;enumeration value="BTE"/&gt;
 *     &lt;enumeration value="CQU"/&gt;
 *     &lt;enumeration value="CUR"/&gt;
 *     &lt;enumeration value="GRO"/&gt;
 *     &lt;enumeration value="LPR"/&gt;
 *     &lt;enumeration value="MER"/&gt;
 *     &lt;enumeration value="NET"/&gt;
 *     &lt;enumeration value="PFI"/&gt;
 *     &lt;enumeration value="PLO"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SHI"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotQuantityClassificationContentType")
@XmlEnum
public enum LotQuantityClassificationContentType {

    ACC,
    BON,
    BTE,
    CQU,
    CUR,
    GRO,
    LPR,
    MER,
    NET,
    PFI,
    PLO,
    REC,
    REJ,
    SCH,
    SCR,
    SHI,
    SPL,
    STA;

    public String value() {
        return name();
    }

    public static LotQuantityClassificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
