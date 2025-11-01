
package io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SaleTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CRD"/&gt;
 *     &lt;enumeration value="CSG"/&gt;
 *     &lt;enumeration value="CSH"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="LSE"/&gt;
 *     &lt;enumeration value="PUR"/&gt;
 *     &lt;enumeration value="RMK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaleTypeContentType")
@XmlEnum
public enum SaleTypeContentType {

    CRD,
    CSG,
    CSH,
    INS,
    LSE,
    PUR,
    RMK;

    public String value() {
        return name();
    }

    public static SaleTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
