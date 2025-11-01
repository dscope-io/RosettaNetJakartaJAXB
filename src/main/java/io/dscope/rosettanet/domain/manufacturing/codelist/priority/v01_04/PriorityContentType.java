
package io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
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
 *     &lt;enumeration value="LOW"/&gt;
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

    HIG,
    HIH,
    LOW,
    LOX,
    MED;

    public String value() {
        return name();
    }

    public static PriorityContentType fromValue(String v) {
        return valueOf(v);
    }

}
