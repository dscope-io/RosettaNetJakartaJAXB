
package io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationreasontype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOrderCancellationReasonTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingOrderCancellationReasonTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="APR"/&gt;
 *     &lt;enumeration value="ACA"/&gt;
 *     &lt;enumeration value="APF"/&gt;
 *     &lt;enumeration value="APS"/&gt;
 *     &lt;enumeration value="ASH"/&gt;
 *     &lt;enumeration value="ISO"/&gt;
 *     &lt;enumeration value="ISP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingOrderCancellationReasonTypeContentType")
@XmlEnum
public enum ShippingOrderCancellationReasonTypeContentType {

    APR,
    ACA,
    APF,
    APS,
    ASH,
    ISO,
    ISP;

    public String value() {
        return name();
    }

    public static ShippingOrderCancellationReasonTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
