
package io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFunctionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MessageFunctionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="INQ"/&gt;
 *     &lt;enumeration value="REM"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunctionContentType")
@XmlEnum
public enum MessageFunctionContentType {

    INQ,
    REM,
    REQ,
    RES;

    public String value() {
        return name();
    }

    public static MessageFunctionContentType fromValue(String v) {
        return valueOf(v);
    }

}
