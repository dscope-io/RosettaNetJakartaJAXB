
package io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NotificationTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAC"/&gt;
 *     &lt;enumeration value="DAC"/&gt;
 *     &lt;enumeration value="IAC"/&gt;
 *     &lt;enumeration value="OAC"/&gt;
 *     &lt;enumeration value="PAC"/&gt;
 *     &lt;enumeration value="PSU"/&gt;
 *     &lt;enumeration value="SAC"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *     &lt;enumeration value="SCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationTypeContentType")
@XmlEnum
public enum NotificationTypeContentType {

    CAC,
    DAC,
    IAC,
    OAC,
    PAC,
    PSU,
    SAC,
    SCC,
    SCO;

    public String value() {
        return name();
    }

    public static NotificationTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
