
package io.dscope.rosettanet.domain.marketing.codelist.designregistrationnotification.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DesignRegistrationNotificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DesignRegistrationNotificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="CHA"/&gt;
 *     &lt;enumeration value="INI"/&gt;
 *     &lt;enumeration value="NRE"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DesignRegistrationNotificationContentType")
@XmlEnum
public enum DesignRegistrationNotificationContentType {

    CAN,
    CHA,
    INI,
    NRE,
    UPD;

    public String value() {
        return name();
    }

    public static DesignRegistrationNotificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
