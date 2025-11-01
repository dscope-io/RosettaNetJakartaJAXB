
package io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationComplexityLevelContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RegistrationComplexityLevelContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AAV"/&gt;
 *     &lt;enumeration value="AVE"/&gt;
 *     &lt;enumeration value="MAX"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="SOM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegistrationComplexityLevelContentType")
@XmlEnum
public enum RegistrationComplexityLevelContentType {

    AAV,
    AVE,
    MAX,
    MIN,
    NON,
    SOM;

    public String value() {
        return name();
    }

    public static RegistrationComplexityLevelContentType fromValue(String v) {
        return valueOf(v);
    }

}
