
package io.dscope.rosettanet.interchange.codelist.forecasttype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastType
    extends JAXBElement<ForecastTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ForecastType:xsd:codelist:01.01", "ForecastType");

    public ForecastType(ForecastTypeType value) {
        super(NAME, ((Class) ForecastTypeType.class), null, value);
    }

    public ForecastType() {
        super(NAME, ((Class) ForecastTypeType.class), null, null);
    }

}
