
package io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAS"/&gt;
 *     &lt;enumeration value="CRE"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseTypeContentType")
@XmlEnum
public enum PurchaseTypeContentType {

    CAS,
    CRE,
    INS;

    public String value() {
        return name();
    }

    public static PurchaseTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
