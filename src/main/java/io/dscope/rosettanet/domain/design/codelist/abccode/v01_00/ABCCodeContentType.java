
package io.dscope.rosettanet.domain.design.codelist.abccode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ABCCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ABCCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CDA"/&gt;
 *     &lt;enumeration value="CDB"/&gt;
 *     &lt;enumeration value="CDC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ABCCodeContentType")
@XmlEnum
public enum ABCCodeContentType {

    CDA,
    CDB,
    CDC;

    public String value() {
        return name();
    }

    public static ABCCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
