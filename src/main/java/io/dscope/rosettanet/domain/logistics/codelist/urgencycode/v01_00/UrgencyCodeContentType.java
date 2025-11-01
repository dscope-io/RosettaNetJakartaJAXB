
package io.dscope.rosettanet.domain.logistics.codelist.urgencycode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UrgencyCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="UrgencyCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="HIG"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="MED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UrgencyCodeContentType")
@XmlEnum
public enum UrgencyCodeContentType {

    HIG("HIG"),
    @XmlEnumValue("Low")
    LOW("Low"),
    MED("MED");
    private final String value;

    UrgencyCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UrgencyCodeContentType fromValue(String v) {
        for (UrgencyCodeContentType c: UrgencyCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
