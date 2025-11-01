
package io.dscope.rosettanet.domain.procurement.codelist.response.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResponseContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="APC"/&gt;
 *     &lt;enumeration value="ATP"/&gt;
 *     &lt;enumeration value="AWC"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="RBM"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseContentType")
@XmlEnum
public enum ResponseContentType {

    ACC,
    APC,
    ATP,
    AWC,
    PEN,
    RBM,
    REJ;

    public String value() {
        return name();
    }

    public static ResponseContentType fromValue(String v) {
        return valueOf(v);
    }

}
