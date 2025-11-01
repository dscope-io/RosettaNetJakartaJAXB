
package io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentModeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentModeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AIR"/&gt;
 *     &lt;enumeration value="AIE"/&gt;
 *     &lt;enumeration value="AIF"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="COC"/&gt;
 *     &lt;enumeration value="CPI"/&gt;
 *     &lt;enumeration value="EXT"/&gt;
 *     &lt;enumeration value="INM"/&gt;
 *     &lt;enumeration value="MOT"/&gt;
 *     &lt;enumeration value="OCE"/&gt;
 *     &lt;enumeration value="RAI"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentModeContentType")
@XmlEnum
public enum ShipmentModeContentType {

    AIR,
    AIE,
    AIF,
    COO,
    COC,
    CPI,
    EXT,
    INM,
    MOT,
    OCE,
    RAI,
    PRC;

    public String value() {
        return name();
    }

    public static ShipmentModeContentType fromValue(String v) {
        return valueOf(v);
    }

}
