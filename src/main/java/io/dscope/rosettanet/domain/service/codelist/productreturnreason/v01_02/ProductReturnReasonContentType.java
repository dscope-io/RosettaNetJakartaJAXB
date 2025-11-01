
package io.dscope.rosettanet.domain.service.codelist.productreturnreason.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductReturnReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductReturnReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CCO"/&gt;
 *     &lt;enumeration value="DPR"/&gt;
 *     &lt;enumeration value="DPS"/&gt;
 *     &lt;enumeration value="DPA"/&gt;
 *     &lt;enumeration value="IPO"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="OSH"/&gt;
 *     &lt;enumeration value="SAE"/&gt;
 *     &lt;enumeration value="SNT"/&gt;
 *     &lt;enumeration value="SWP"/&gt;
 *     &lt;enumeration value="TPR"/&gt;
 *     &lt;enumeration value="UPA"/&gt;
 *     &lt;enumeration value="WPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductReturnReasonContentType")
@XmlEnum
public enum ProductReturnReasonContentType {

    CCO,
    DPR,
    DPS,
    DPA,
    IPO,
    NIO,
    OSH,
    SAE,
    SNT,
    SWP,
    TPR,
    UPA,
    WPR;

    public String value() {
        return name();
    }

    public static ProductReturnReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
