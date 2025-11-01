
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderChangeTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseOrderChangeTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CHG"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderChangeTypeContentType")
@XmlEnum
public enum PurchaseOrderChangeTypeContentType {

    CHG,
    RSD;

    public String value() {
        return name();
    }

    public static PurchaseOrderChangeTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
