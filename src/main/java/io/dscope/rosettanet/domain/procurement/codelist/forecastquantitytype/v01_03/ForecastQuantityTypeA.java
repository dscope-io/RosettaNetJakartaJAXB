
package io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastQuantityTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.03", "ForecastQuantityTypeA");

    public ForecastQuantityTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ForecastQuantityTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
