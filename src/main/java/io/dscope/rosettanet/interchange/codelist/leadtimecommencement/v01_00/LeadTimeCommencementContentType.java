
package io.dscope.rosettanet.interchange.codelist.leadtimecommencement.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeadTimeCommencementContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LeadTimeCommencementContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACO"/&gt;
 *     &lt;enumeration value="ARO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LeadTimeCommencementContentType")
@XmlEnum
public enum LeadTimeCommencementContentType {

    ACO,
    ARO;

    public String value() {
        return name();
    }

    public static LeadTimeCommencementContentType fromValue(String v) {
        return valueOf(v);
    }

}
