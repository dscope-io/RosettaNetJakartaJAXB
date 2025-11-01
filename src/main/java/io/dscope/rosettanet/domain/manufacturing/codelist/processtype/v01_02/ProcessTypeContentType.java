
package io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_02;

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
 *     &lt;enumeration value="CPR"/&gt;
 *     &lt;enumeration value="FTE"/&gt;
 *     &lt;enumeration value="OCL"/&gt;
 *     &lt;enumeration value="OPO"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="SOR"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
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
    CPR,
    FTE,
    OCL,
    OPO,
    PRO,
    SOR,
    SPR;

    public String value() {
        return name();
    }

    public static ProcessTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
