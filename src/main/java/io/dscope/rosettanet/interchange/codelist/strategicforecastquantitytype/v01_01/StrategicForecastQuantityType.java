
package io.dscope.rosettanet.interchange.codelist.strategicforecastquantitytype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StrategicForecastQuantityType
    extends JAXBElement<StrategicForecastQuantityTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:StrategicForecastQuantityType:xsd:codelist:01.01", "StrategicForecastQuantityType");

    public StrategicForecastQuantityType(StrategicForecastQuantityTypeType value) {
        super(NAME, ((Class) StrategicForecastQuantityTypeType.class), null, value);
    }

    public StrategicForecastQuantityType() {
        super(NAME, ((Class) StrategicForecastQuantityTypeType.class), null, null);
    }

}
