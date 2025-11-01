
package io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuoteStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CLO"/&gt;
 *     &lt;enumeration value="CWO"/&gt;
 *     &lt;enumeration value="UND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteStatusContentType")
@XmlEnum
public enum QuoteStatusContentType {

    CLO,
    CWO,
    UND;

    public String value() {
        return name();
    }

    public static QuoteStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
