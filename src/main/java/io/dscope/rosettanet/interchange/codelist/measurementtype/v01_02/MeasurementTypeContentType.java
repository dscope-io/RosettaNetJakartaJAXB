
package io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MeasurementTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CDM"/&gt;
 *     &lt;enumeration value="FLT"/&gt;
 *     &lt;enumeration value="OLY"/&gt;
 *     &lt;enumeration value="DPH"/&gt;
 *     &lt;enumeration value="RSY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeasurementTypeContentType")
@XmlEnum
public enum MeasurementTypeContentType {

    CDM,
    FLT,
    OLY,
    DPH,
    RSY;

    public String value() {
        return name();
    }

    public static MeasurementTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
