
package io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastReferenceTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForecastReferenceTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BPO"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="DPO"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PRN"/&gt;
 *     &lt;enumeration value="REN"/&gt;
 *     &lt;enumeration value="SAN"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastReferenceTypeContentType")
@XmlEnum
public enum ForecastReferenceTypeContentType {

    BPO,
    CON,
    DPO,
    PLN,
    PRN,
    REN,
    SAN,
    SEN;

    public String value() {
        return name();
    }

    public static ForecastReferenceTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
