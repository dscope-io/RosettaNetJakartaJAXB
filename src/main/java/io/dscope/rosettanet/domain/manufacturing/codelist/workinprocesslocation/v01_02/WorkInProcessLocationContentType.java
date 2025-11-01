
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
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
 *     &lt;enumeration value="FAB"/&gt;
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

    ASS,
    BUM,
    FAB,
    MAP,
    MAS,
    PRO,
    SOR,
    STA,
    TES;

    public String value() {
        return name();
    }

    public static WorkInProcessLocationContentType fromValue(String v) {
        return valueOf(v);
    }

}
