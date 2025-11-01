
package io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DYM"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="OCD"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="RVS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentTypeContentType")
@XmlEnum
public enum ShipmentTypeContentType {

    DYM,
    MTL,
    OCD,
    OTH,
    RVS;

    public String value() {
        return name();
    }

    public static ShipmentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
