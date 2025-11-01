
package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOrderCancellationStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingOrderCancellationStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingOrderCancellationStatusContentType")
@XmlEnum
public enum ShippingOrderCancellationStatusContentType {

    ACC,
    REJ;

    public String value() {
        return name();
    }

    public static ShippingOrderCancellationStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
