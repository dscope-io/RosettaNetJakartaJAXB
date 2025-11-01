
package io.dscope.rosettanet.domain.logistics.codelist.portidentifierauthoritycode.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortIdentifierAuthorityCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PortIdentifierAuthorityCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="IATA"/&gt;
 *     &lt;enumeration value="ICAO"/&gt;
 *     &lt;enumeration value="IMO"/&gt;
 *     &lt;enumeration value="ISO"/&gt;
 *     &lt;enumeration value="NVOCC"/&gt;
 *     &lt;enumeration value="VOCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PortIdentifierAuthorityCodeContentType")
@XmlEnum
public enum PortIdentifierAuthorityCodeContentType {

    IATA,
    ICAO,
    IMO,
    ISO,
    NVOCC,
    VOCC;

    public String value() {
        return name();
    }

    public static PortIdentifierAuthorityCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
