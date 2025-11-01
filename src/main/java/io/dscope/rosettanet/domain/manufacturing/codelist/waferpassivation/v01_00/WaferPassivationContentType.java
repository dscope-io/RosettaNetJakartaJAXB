
package io.dscope.rosettanet.domain.manufacturing.codelist.waferpassivation.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaferPassivationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WaferPassivationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SI3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WaferPassivationContentType")
@XmlEnum
public enum WaferPassivationContentType {

    @XmlEnumValue("SI3")
    SI_3("SI3");
    private final String value;

    WaferPassivationContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WaferPassivationContentType fromValue(String v) {
        for (WaferPassivationContentType c: WaferPassivationContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
