
package io.dscope.rosettanet.domain.design.codelist.compliant.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompliantContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CompliantContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CEX"/&gt;
 *     &lt;enumeration value="CLE"/&gt;
 *     &lt;enumeration value="CMP"/&gt;
 *     &lt;enumeration value="NCP"/&gt;
 *     &lt;enumeration value="OBP"/&gt;
 *     &lt;enumeration value="UNK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompliantContentType")
@XmlEnum
public enum CompliantContentType {

    CEX,
    CLE,
    CMP,
    NCP,
    OBP,
    UNK;

    public String value() {
        return name();
    }

    public static CompliantContentType fromValue(String v) {
        return valueOf(v);
    }

}
