
package io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestOptionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequestOptionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="WQO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestOptionContentType")
@XmlEnum
public enum RequestOptionContentType {

    PRO,
    CON,
    SIT,
    WQO;

    public String value() {
        return name();
    }

    public static RequestOptionContentType fromValue(String v) {
        return valueOf(v);
    }

}
