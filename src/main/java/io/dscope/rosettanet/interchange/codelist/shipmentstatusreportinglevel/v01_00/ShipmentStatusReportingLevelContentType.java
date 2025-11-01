
package io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentStatusReportingLevelContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentStatusReportingLevelContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="CUR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentStatusReportingLevelContentType")
@XmlEnum
public enum ShipmentStatusReportingLevelContentType {

    ALL,
    CUR;

    public String value() {
        return name();
    }

    public static ShipmentStatusReportingLevelContentType fromValue(String v) {
        return valueOf(v);
    }

}
