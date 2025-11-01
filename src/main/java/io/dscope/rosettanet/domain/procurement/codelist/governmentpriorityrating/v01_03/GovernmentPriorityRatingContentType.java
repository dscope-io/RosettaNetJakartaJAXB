
package io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovernmentPriorityRatingContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GovernmentPriorityRatingContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ATE"/&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="DOE"/&gt;
 *     &lt;enumeration value="ENP"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GovernmentPriorityRatingContentType")
@XmlEnum
public enum GovernmentPriorityRatingContentType {

    ATE,
    DEF,
    DOE,
    ENP,
    OTH;

    public String value() {
        return name();
    }

    public static GovernmentPriorityRatingContentType fromValue(String v) {
        return valueOf(v);
    }

}
