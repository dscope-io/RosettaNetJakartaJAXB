
package io.dscope.rosettanet.interchange.codelist.forecasttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ForecastType:xsd:codelist:01.01", "ForecastTypeA");

    public ForecastTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ForecastTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
