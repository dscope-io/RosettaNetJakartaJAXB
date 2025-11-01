
package io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCMParmTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PCMParmTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CSP"/&gt;
 *     &lt;enumeration value="WAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PCMParmTypeContentType")
@XmlEnum
public enum PCMParmTypeContentType {

    CSP,
    WAT;

    public String value() {
        return name();
    }

    public static PCMParmTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
