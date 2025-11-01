
package io.dscope.rosettanet.interchange.codelist.plan.v02_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PlanContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *     &lt;enumeration value="BAS"/&gt;
 *     &lt;enumeration value="CCS"/&gt;
 *     &lt;enumeration value="GRT"/&gt;
 *     &lt;enumeration value="IAZ"/&gt;
 *     &lt;enumeration value="SRC"/&gt;
 *     &lt;enumeration value="UAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlanContentType")
@XmlEnum
public enum PlanContentType {

    BAM,
    BAS,
    CCS,
    GRT,
    IAZ,
    SRC,
    UAV;

    public String value() {
        return name();
    }

    public static PlanContentType fromValue(String v) {
        return valueOf(v);
    }

}
