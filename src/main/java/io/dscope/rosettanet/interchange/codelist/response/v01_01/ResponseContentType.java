
package io.dscope.rosettanet.interchange.codelist.response.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResponseContentType"&gt;
 *   &lt;restriction base="{urn:rosettanet:specification:domain:Procurement:Response:xsd:codelist:01.04}ResponseContentType"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseContentType")
@XmlEnum(io.dscope.rosettanet.domain.procurement.codelist.response.v01_04.ResponseContentType.class)
public enum ResponseContentType {

    ACC,
    REJ;

    public String value() {
        return name();
    }

    public static ResponseContentType fromValue(String v) {
        return valueOf(v);
    }

}
