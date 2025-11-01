
package io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentChangeDispositionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentChangeDispositionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="SFN"/&gt;
 *     &lt;enumeration value="RTS"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *     &lt;enumeration value="ROC"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="CAS"/&gt;
 *     &lt;enumeration value="ABS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentChangeDispositionContentType")
@XmlEnum
public enum ShipmentChangeDispositionContentType {

    SFN,
    RTS,
    RES,
    ROC,
    DES,
    CAS,
    ABS;

    public String value() {
        return name();
    }

    public static ShipmentChangeDispositionContentType fromValue(String v) {
        return valueOf(v);
    }

}
