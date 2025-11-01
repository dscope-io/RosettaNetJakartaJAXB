
package io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PortTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="POD"/&gt;
 *     &lt;enumeration value="POC"/&gt;
 *     &lt;enumeration value="POE"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="POO"/&gt;
 *     &lt;enumeration value="POT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortTypeContentType")
@XmlEnum
public enum PortTypeContentType {

    POD,
    POC,
    POE,
    POI,
    POL,
    POO,
    POT;

    public String value() {
        return name();
    }

    public static PortTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
