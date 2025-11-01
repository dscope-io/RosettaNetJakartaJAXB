
package io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastReferenceTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.02", "ForecastReferenceTypeA");

    public ForecastReferenceTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ForecastReferenceTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
