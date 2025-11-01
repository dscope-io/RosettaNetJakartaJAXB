
package io.dscope.rosettanet.interchange.codelist.forecasttype.v01_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForecastTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAP"/&gt;
 *     &lt;enumeration value="MAS"/&gt;
 *     &lt;enumeration value="PLA"/&gt;
 *     &lt;enumeration value="SAL"/&gt;
 *     &lt;enumeration value="SIM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastTypeContentType")
@XmlEnum
public enum ForecastTypeContentType {

    CAP,
    MAS,
    PLA,
    SAL,
    SIM;

    public String value() {
        return name();
    }

    public static ForecastTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
