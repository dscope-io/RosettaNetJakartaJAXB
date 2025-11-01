
package io.dscope.rosettanet.domain.logistics.codelist.responsecode.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResponseCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="APP"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseCodeContentType")
@XmlEnum
public enum ResponseCodeContentType {

    APP,
    PEN,
    REJ;

    public String value() {
        return name();
    }

    public static ResponseCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
