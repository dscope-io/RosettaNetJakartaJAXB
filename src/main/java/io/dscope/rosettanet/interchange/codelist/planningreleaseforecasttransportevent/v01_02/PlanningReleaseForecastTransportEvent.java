
package io.dscope.rosettanet.interchange.codelist.planningreleaseforecasttransportevent.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PlanningReleaseForecastTransportEvent
    extends JAXBElement<PlanningReleaseForecastTransportEventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PlanningReleaseForecastTransportEvent:xsd:codelist:01.02", "PlanningReleaseForecastTransportEvent");

    public PlanningReleaseForecastTransportEvent(PlanningReleaseForecastTransportEventType value) {
        super(NAME, ((Class) PlanningReleaseForecastTransportEventType.class), null, value);
    }

    public PlanningReleaseForecastTransportEvent() {
        super(NAME, ((Class) PlanningReleaseForecastTransportEventType.class), null, null);
    }

}
