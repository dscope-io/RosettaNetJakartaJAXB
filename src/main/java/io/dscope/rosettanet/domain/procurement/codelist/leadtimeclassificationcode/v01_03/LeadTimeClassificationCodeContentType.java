
package io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadTimeClassificationCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LeadTimeClassificationCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ASA"/&gt;
 *     &lt;enumeration value="ASS"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="DTS"/&gt;
 *     &lt;enumeration value="EOL"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="NOS"/&gt;
 *     &lt;enumeration value="ODP"/&gt;
 *     &lt;enumeration value="PLA"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PRD"/&gt;
 *     &lt;enumeration value="SUP"/&gt;
 *     &lt;enumeration value="TRN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LeadTimeClassificationCodeContentType")
@XmlEnum
public enum LeadTimeClassificationCodeContentType {

    ASA,
    ASS,
    CLF,
    DTS,
    EOL,
    INS,
    MAR,
    NOS,
    ODP,
    PLA,
    PRC,
    PRD,
    SUP,
    TRN;

    public String value() {
        return name();
    }

    public static LeadTimeClassificationCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
