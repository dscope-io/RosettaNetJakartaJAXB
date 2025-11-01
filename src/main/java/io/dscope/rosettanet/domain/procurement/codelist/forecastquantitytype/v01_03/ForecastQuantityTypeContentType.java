
package io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastQuantityTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForecastQuantityTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CGD"/&gt;
 *     &lt;enumeration value="CND"/&gt;
 *     &lt;enumeration value="DGD"/&gt;
 *     &lt;enumeration value="DND"/&gt;
 *     &lt;enumeration value="DOD"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastQuantityTypeContentType")
@XmlEnum
public enum ForecastQuantityTypeContentType {

    CGD,
    CND,
    DGD,
    DND,
    DOD,
    UPD;

    public String value() {
        return name();
    }

    public static ForecastQuantityTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
