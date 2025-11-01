
package io.dscope.rosettanet.domain.procurement.codelist.ordertype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OrderTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BAC"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="CLO"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="SCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderTypeContentType")
@XmlEnum
public enum OrderTypeContentType {

    BAC,
    CAN,
    CLO,
    REQ,
    SCH;

    public String value() {
        return name();
    }

    public static OrderTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
