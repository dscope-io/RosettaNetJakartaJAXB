
package io.dscope.rosettanet.domain.service.codelist.requesttype.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RequestTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CLO"/&gt;
 *     &lt;enumeration value="OPN"/&gt;
 *     &lt;enumeration value="ROP"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestTypeContentType")
@XmlEnum
public enum RequestTypeContentType {

    CLO,
    OPN,
    ROP,
    UPD;

    public String value() {
        return name();
    }

    public static RequestTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
