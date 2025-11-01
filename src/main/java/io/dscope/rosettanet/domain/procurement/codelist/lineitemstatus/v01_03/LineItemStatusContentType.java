
package io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LineItemStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="CLO"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="REJ"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LineItemStatusContentType")
@XmlEnum
public enum LineItemStatusContentType {

    ACC,
    ACT,
    CAN,
    CLO,
    PEN,
    REJ,
    UPD;

    public String value() {
        return name();
    }

    public static LineItemStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
