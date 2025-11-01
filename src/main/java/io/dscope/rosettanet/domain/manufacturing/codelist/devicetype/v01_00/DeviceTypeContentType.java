
package io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeviceTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="FG"/&gt;
 *     &lt;enumeration value="RS"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceTypeContentType")
@XmlEnum
public enum DeviceTypeContentType {

    D,
    FG,
    RS,
    W;

    public String value() {
        return name();
    }

    public static DeviceTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
