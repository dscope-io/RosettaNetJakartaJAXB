
package io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastQuantityType
    extends JAXBElement<ForecastQuantityTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.03", "ForecastQuantityType");

    public ForecastQuantityType(ForecastQuantityTypeType value) {
        super(NAME, ((Class) ForecastQuantityTypeType.class), null, value);
    }

    public ForecastQuantityType() {
        super(NAME, ((Class) ForecastQuantityTypeType.class), null, null);
    }

}
