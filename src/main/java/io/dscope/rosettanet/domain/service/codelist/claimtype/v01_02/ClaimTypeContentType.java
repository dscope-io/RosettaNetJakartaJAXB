
package io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ClaimTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="OPT"/&gt;
 *     &lt;enumeration value="OOW"/&gt;
 *     &lt;enumeration value="SPA"/&gt;
 *     &lt;enumeration value="UNI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClaimTypeContentType")
@XmlEnum
public enum ClaimTypeContentType {

    OPT,
    OOW,
    SPA,
    UNI;

    public String value() {
        return name();
    }

    public static ClaimTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
