
package io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PortTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="POC"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="POE"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="POO"/&gt;
 *     &lt;enumeration value="POH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortTypeContentType")
@XmlEnum
public enum PortTypeContentType {

    POC,
    PON,
    POE,
    POI,
    POL,
    POO,
    POH;

    public String value() {
        return name();
    }

    public static PortTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
