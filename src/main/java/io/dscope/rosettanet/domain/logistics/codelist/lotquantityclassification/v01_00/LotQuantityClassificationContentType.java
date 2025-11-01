
package io.dscope.rosettanet.domain.logistics.codelist.lotquantityclassification.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LotQuantityClassificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LotQuantityClassificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NET"/&gt;
 *     &lt;enumeration value="MEQ"/&gt;
 *     &lt;enumeration value="LOP"/&gt;
 *     &lt;enumeration value="GRO"/&gt;
 *     &lt;enumeration value="CUQ"/&gt;
 *     &lt;enumeration value="CHQ"/&gt;
 *     &lt;enumeration value="BON"/&gt;
 *     &lt;enumeration value="BTQ"/&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="PRL"/&gt;
 *     &lt;enumeration value="PRF"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SHI"/&gt;
 *     &lt;enumeration value="SPQ"/&gt;
 *     &lt;enumeration value="STQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LotQuantityClassificationContentType")
@XmlEnum
public enum LotQuantityClassificationContentType {

    NET,
    MEQ,
    LOP,
    GRO,
    CUQ,
    CHQ,
    BON,
    BTQ,
    ACC,
    PRL,
    PRF,
    REC,
    REJ,
    SCH,
    SCR,
    SHI,
    SPQ,
    STQ;

    public String value() {
        return name();
    }

    public static LotQuantityClassificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
