
package io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastEventContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForecastEventContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="APA"/&gt;
 *     &lt;enumeration value="ADV"/&gt;
 *     &lt;enumeration value="DIP"/&gt;
 *     &lt;enumeration value="FOB"/&gt;
 *     &lt;enumeration value="IPC"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="MRP"/&gt;
 *     &lt;enumeration value="NLO"/&gt;
 *     &lt;enumeration value="NPO"/&gt;
 *     &lt;enumeration value="OPC"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PCO"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *     &lt;enumeration value="QUC"/&gt;
 *     &lt;enumeration value="RPS"/&gt;
 *     &lt;enumeration value="SCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastEventContentType")
@XmlEnum
public enum ForecastEventContentType {

    APA,
    ADV,
    DIP,
    FOB,
    IPC,
    LOC,
    MRP,
    NLO,
    NPO,
    OPC,
    PRC,
    PCO,
    PRO,
    QUC,
    RPS,
    SCC;

    public String value() {
        return name();
    }

    public static ForecastEventContentType fromValue(String v) {
        return valueOf(v);
    }

}
