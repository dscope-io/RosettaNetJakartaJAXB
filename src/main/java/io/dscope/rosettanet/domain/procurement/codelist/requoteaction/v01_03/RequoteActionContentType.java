
package io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequoteActionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequoteActionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="CHA"/&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="NAC"/&gt;
 *     &lt;enumeration value="REI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequoteActionContentType")
@XmlEnum
public enum RequoteActionContentType {

    ADD,
    CHA,
    DEL,
    NAC,
    REI;

    public String value() {
        return name();
    }

    public static RequoteActionContentType fromValue(String v) {
        return valueOf(v);
    }

}
