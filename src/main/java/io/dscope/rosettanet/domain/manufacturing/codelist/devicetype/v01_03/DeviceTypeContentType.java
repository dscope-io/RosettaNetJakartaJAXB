
package io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeviceTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DIE"/&gt;
 *     &lt;enumeration value="FGO"/&gt;
 *     &lt;enumeration value="RST"/&gt;
 *     &lt;enumeration value="WAF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceTypeContentType")
@XmlEnum
public enum DeviceTypeContentType {

    DIE,
    FGO,
    RST,
    WAF;

    public String value() {
        return name();
    }

    public static DeviceTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
