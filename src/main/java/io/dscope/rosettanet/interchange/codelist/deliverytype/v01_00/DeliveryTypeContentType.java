
package io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeliveryTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="EXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryTypeContentType")
@XmlEnum
public enum DeliveryTypeContentType {

    INT,
    EXT;

    public String value() {
        return name();
    }

    public static DeliveryTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
