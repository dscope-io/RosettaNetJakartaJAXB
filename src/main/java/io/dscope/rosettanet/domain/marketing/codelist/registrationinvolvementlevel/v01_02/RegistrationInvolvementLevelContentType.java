
package io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationInvolvementLevelContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegistrationInvolvementLevelContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AAV"/&gt;
 *     &lt;enumeration value="AVE"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="SOM"/&gt;
 *     &lt;enumeration value="TOT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistrationInvolvementLevelContentType")
@XmlEnum
public enum RegistrationInvolvementLevelContentType {

    AAV,
    AVE,
    MIN,
    NON,
    SOM,
    TOT;

    public String value() {
        return name();
    }

    public static RegistrationInvolvementLevelContentType fromValue(String v) {
        return valueOf(v);
    }

}
