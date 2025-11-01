
package io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastEvent
    extends JAXBElement<ForecastEventType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:1.0", "ForecastEvent");

    public ForecastEvent(ForecastEventType value) {
        super(NAME, ((Class) ForecastEventType.class), null, value);
    }

    public ForecastEvent() {
        super(NAME, ((Class) ForecastEventType.class), null, null);
    }

}
