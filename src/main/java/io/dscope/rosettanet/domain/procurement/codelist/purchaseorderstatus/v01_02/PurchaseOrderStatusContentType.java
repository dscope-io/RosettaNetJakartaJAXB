
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseOrderStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderStatusContentType")
@XmlEnum
public enum PurchaseOrderStatusContentType {

    ACC,
    PEN,
    REJ;

    public String value() {
        return name();
    }

    public static PurchaseOrderStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
