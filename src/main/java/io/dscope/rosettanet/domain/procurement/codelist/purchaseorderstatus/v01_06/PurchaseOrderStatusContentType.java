
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06;

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
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="FCL"/&gt;
 *     &lt;enumeration value="NEW"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderStatusContentType")
@XmlEnum
public enum PurchaseOrderStatusContentType {

    ACC,
    CAN,
    COM,
    FCL,
    NEW,
    PAR,
    PEN,
    REJ,
    UPD;

    public String value() {
        return name();
    }

    public static PurchaseOrderStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
