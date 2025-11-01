
package io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProcessTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ASS"/&gt;
 *     &lt;enumeration value="BUR"/&gt;
 *     &lt;enumeration value="CP"/&gt;
 *     &lt;enumeration value="FTE"/&gt;
 *     &lt;enumeration value="OC"/&gt;
 *     &lt;enumeration value="OP"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="SOR"/&gt;
 *     &lt;enumeration value="SP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessTypeContentType")
@XmlEnum
public enum ProcessTypeContentType {

    ASS,
    BUR,
    CP,
    FTE,
    OC,
    OP,
    PRO,
    SOR,
    SP;

    public String value() {
        return name();
    }

    public static ProcessTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
