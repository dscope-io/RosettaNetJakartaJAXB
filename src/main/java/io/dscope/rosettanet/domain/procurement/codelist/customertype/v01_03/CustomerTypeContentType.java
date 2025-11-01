
package io.dscope.rosettanet.domain.procurement.codelist.customertype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ENC"/&gt;
 *     &lt;enumeration value="ULC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerTypeContentType")
@XmlEnum
public enum CustomerTypeContentType {

    ENC,
    ULC;

    public String value() {
        return name();
    }

    public static CustomerTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
