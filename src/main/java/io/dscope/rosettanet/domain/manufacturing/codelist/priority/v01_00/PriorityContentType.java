
package io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PriorityContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="HIG"/&gt;
 *     &lt;enumeration value="HIH"/&gt;
 *     &lt;enumeration value="Low"/&gt;
 *     &lt;enumeration value="LOX"/&gt;
 *     &lt;enumeration value="MED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriorityContentType")
@XmlEnum
public enum PriorityContentType {

    HIG("HIG"),
    HIH("HIH"),
    @XmlEnumValue("Low")
    LOW("Low"),
    LOX("LOX"),
    MED("MED");
    private final String value;

    PriorityContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriorityContentType fromValue(String v) {
        for (PriorityContentType c: PriorityContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
