
package io.dscope.rosettanet.domain.procurement.codelist.datetype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DateTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="FCT"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateTypeContentType")
@XmlEnum
public enum DateTypeContentType {

    ACT,
    FCT,
    PLN;

    public String value() {
        return name();
    }

    public static DateTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
