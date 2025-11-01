
package io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAuthorizationCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CustomerAuthorizationCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NOL"/&gt;
 *     &lt;enumeration value="NRS"/&gt;
 *     &lt;enumeration value="NSL"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerAuthorizationCodeContentType")
@XmlEnum
public enum CustomerAuthorizationCodeContentType {

    NOL,
    NRS,
    NSL,
    REQ;

    public String value() {
        return name();
    }

    public static CustomerAuthorizationCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
