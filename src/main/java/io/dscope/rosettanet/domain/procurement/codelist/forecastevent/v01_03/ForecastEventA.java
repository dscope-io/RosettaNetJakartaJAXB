
package io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastEventA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", "ForecastEventA");

    public ForecastEventA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ForecastEventA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
