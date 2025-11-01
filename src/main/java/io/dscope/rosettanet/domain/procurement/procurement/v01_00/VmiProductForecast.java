
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class VmiProductForecast
    extends JAXBElement<VmiProductForecastType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "VmiProductForecast");

    public VmiProductForecast(VmiProductForecastType value) {
        super(NAME, ((Class) VmiProductForecastType.class), null, value);
    }

    public VmiProductForecast() {
        super(NAME, ((Class) VmiProductForecastType.class), null, null);
    }

}
