
package io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WarrantyTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WarrantyTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CRI"/&gt;
 *     &lt;enumeration value="DEP"/&gt;
 *     &lt;enumeration value="EVN"/&gt;
 *     &lt;enumeration value="FCL"/&gt;
 *     &lt;enumeration value="FLL"/&gt;
 *     &lt;enumeration value="LTD"/&gt;
 *     &lt;enumeration value="OEM"/&gt;
 *     &lt;enumeration value="ONS"/&gt;
 *     &lt;enumeration value="PRT"/&gt;
 *     &lt;enumeration value="PLA"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="PCI"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="PCK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WarrantyTypeContentType")
@XmlEnum
public enum WarrantyTypeContentType {

    CRI,
    DEP,
    EVN,
    FCL,
    FLL,
    LTD,
    OEM,
    ONS,
    PRT,
    PLA,
    PRO,
    PCI,
    STD,
    PCK;

    public String value() {
        return name();
    }

    public static WarrantyTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
