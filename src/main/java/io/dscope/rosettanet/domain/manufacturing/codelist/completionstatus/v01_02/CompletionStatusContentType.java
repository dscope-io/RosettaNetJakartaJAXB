
package io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletionStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CompletionStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ABO"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="SUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompletionStatusContentType")
@XmlEnum
public enum CompletionStatusContentType {

    ABO,
    COM,
    SUS;

    public String value() {
        return name();
    }

    public static CompletionStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
