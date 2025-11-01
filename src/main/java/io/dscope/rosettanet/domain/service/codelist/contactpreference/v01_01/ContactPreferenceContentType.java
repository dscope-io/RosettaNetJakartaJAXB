
package io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactPreferenceContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ContactPreferenceContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="B2B"/&gt;
 *     &lt;enumeration value="EMA"/&gt;
 *     &lt;enumeration value="PHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactPreferenceContentType")
@XmlEnum
public enum ContactPreferenceContentType {

    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    EMA("EMA"),
    PHO("PHO");
    private final String value;

    ContactPreferenceContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactPreferenceContentType fromValue(String v) {
        for (ContactPreferenceContentType c: ContactPreferenceContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
