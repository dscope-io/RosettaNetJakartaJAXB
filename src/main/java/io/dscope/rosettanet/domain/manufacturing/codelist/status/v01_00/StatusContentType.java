
package io.dscope.rosettanet.domain.manufacturing.codelist.status.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="StatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ATH"/&gt;
 *     &lt;enumeration value="EHD"/&gt;
 *     &lt;enumeration value="ELB"/&gt;
 *     &lt;enumeration value="ELE"/&gt;
 *     &lt;enumeration value="EHF"/&gt;
 *     &lt;enumeration value="EUA"/&gt;
 *     &lt;enumeration value="EUL"/&gt;
 *     &lt;enumeration value="EUZ"/&gt;
 *     &lt;enumeration value="EZC"/&gt;
 *     &lt;enumeration value="EZZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusContentType")
@XmlEnum
public enum StatusContentType {

    ATH,
    EHD,
    ELB,
    ELE,
    EHF,
    EUA,
    EUL,
    EUZ,
    EZC,
    EZZ;

    public String value() {
        return name();
    }

    public static StatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
