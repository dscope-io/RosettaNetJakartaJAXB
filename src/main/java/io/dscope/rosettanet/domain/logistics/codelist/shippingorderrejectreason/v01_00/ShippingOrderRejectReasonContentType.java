
package io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOrderRejectReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShippingOrderRejectReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="CNA"/&gt;
 *     &lt;enumeration value="DSO"/&gt;
 *     &lt;enumeration value="EPR"/&gt;
 *     &lt;enumeration value="HMR"/&gt;
 *     &lt;enumeration value="ICD"/&gt;
 *     &lt;enumeration value="ICL"/&gt;
 *     &lt;enumeration value="IDA"/&gt;
 *     &lt;enumeration value="IDI"/&gt;
 *     &lt;enumeration value="IEL"/&gt;
 *     &lt;enumeration value="INA"/&gt;
 *     &lt;enumeration value="INC"/&gt;
 *     &lt;enumeration value="ISD"/&gt;
 *     &lt;enumeration value="ISO"/&gt;
 *     &lt;enumeration value="IVM"/&gt;
 *     &lt;enumeration value="IVQ"/&gt;
 *     &lt;enumeration value="SSL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShippingOrderRejectReasonContentType")
@XmlEnum
public enum ShippingOrderRejectReasonContentType {

    ADP,
    CNA,
    DSO,
    EPR,
    HMR,
    ICD,
    ICL,
    IDA,
    IDI,
    IEL,
    INA,
    INC,
    ISD,
    ISO,
    IVM,
    IVQ,
    SSL;

    public String value() {
        return name();
    }

    public static ShippingOrderRejectReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
