
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastPeriod
    extends JAXBElement<ForecastPeriodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "ForecastPeriod");

    public ForecastPeriod(ForecastPeriodType value) {
        super(NAME, ((Class) ForecastPeriodType.class), null, value);
    }

    public ForecastPeriod() {
        super(NAME, ((Class) ForecastPeriodType.class), null, null);
    }

}
