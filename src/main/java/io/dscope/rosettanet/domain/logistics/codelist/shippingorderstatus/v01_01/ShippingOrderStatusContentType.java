
package io.dscope.rosettanet.domain.logistics.codelist.shippingorderstatus.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOrderStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingOrderStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingOrderStatusContentType")
@XmlEnum
public enum ShippingOrderStatusContentType {

    ACC,
    REJ;

    public String value() {
        return name();
    }

    public static ShippingOrderStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
