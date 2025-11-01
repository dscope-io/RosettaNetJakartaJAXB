
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkInProcessLocationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WorkInProcessLocationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ASS"/&gt;
 *     &lt;enumeration value="BUM"/&gt;
 *     &lt;enumeration value="Fab"/&gt;
 *     &lt;enumeration value="MAP"/&gt;
 *     &lt;enumeration value="MAS"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="SOR"/&gt;
 *     &lt;enumeration value="STA"/&gt;
 *     &lt;enumeration value="TES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkInProcessLocationContentType")
@XmlEnum
public enum WorkInProcessLocationContentType {

    ASS("ASS"),
    BUM("BUM"),
    @XmlEnumValue("Fab")
    FAB("Fab"),
    MAP("MAP"),
    MAS("MAS"),
    PRO("PRO"),
    SOR("SOR"),
    STA("STA"),
    TES("TES");
    private final String value;

    WorkInProcessLocationContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkInProcessLocationContentType fromValue(String v) {
        for (WorkInProcessLocationContentType c: WorkInProcessLocationContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
