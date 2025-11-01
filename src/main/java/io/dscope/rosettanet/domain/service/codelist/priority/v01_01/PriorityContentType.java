
package io.dscope.rosettanet.domain.service.codelist.priority.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriorityContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PriorityContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="URG"/&gt;
 *     &lt;enumeration value="HIG"/&gt;
 *     &lt;enumeration value="MED"/&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriorityContentType")
@XmlEnum
public enum PriorityContentType {

    URG,
    HIG,
    MED,
    LOW;

    public String value() {
        return name();
    }

    public static PriorityContentType fromValue(String v) {
        return valueOf(v);
    }

}
