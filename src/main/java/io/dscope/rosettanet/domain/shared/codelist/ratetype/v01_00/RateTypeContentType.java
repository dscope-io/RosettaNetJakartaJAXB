
package io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RateTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="MIS"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="TAX"/&gt;
 *     &lt;enumeration value="FRE"/&gt;
 *     &lt;enumeration value="ANC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateTypeContentType")
@XmlEnum
public enum RateTypeContentType {

    DIS,
    MIS,
    INS,
    TAX,
    FRE,
    ANC;

    public String value() {
        return name();
    }

    public static RateTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
