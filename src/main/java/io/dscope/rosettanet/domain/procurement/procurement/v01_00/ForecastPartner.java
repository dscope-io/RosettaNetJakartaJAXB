
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastPartner
    extends JAXBElement<ForecastPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ForecastPartner");

    public ForecastPartner(ForecastPartnerType value) {
        super(NAME, ((Class) ForecastPartnerType.class), null, value);
    }

    public ForecastPartner() {
        super(NAME, ((Class) ForecastPartnerType.class), null, null);
    }

}
