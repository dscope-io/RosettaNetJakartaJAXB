
package io.dscope.rosettanet.interchange.codelist.planningreleaseforecasttransportevent.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_03.TransportEventContentType;


/**
 * <p>Java class for PlanningReleaseForecastTransportEventContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PlanningReleaseForecastTransportEventContentType"&gt;
 *   &lt;restriction base="{urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03}TransportEventContentType"&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlanningReleaseForecastTransportEventContentType")
@XmlEnum(TransportEventContentType.class)
public enum PlanningReleaseForecastTransportEventContentType {

    DOC,
    SHP;

    public String value() {
        return name();
    }

    public static PlanningReleaseForecastTransportEventContentType fromValue(String v) {
        return valueOf(v);
    }

}
