
package io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfidentialityContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfidentialityContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfidentialityContentType")
@XmlEnum
public enum ConfidentialityContentType {

    CON,
    NON,
    RES;

    public String value() {
        return name();
    }

    public static ConfidentialityContentType fromValue(String v) {
        return valueOf(v);
    }

}
