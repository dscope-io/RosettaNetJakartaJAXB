
package io.dscope.rosettanet.domain.procurement.procurement.v01_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastIdentifierReference
    extends JAXBElement<ForecastIdentifierReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16", "ForecastIdentifierReference");

    public ForecastIdentifierReference(ForecastIdentifierReferenceType value) {
        super(NAME, ((Class) ForecastIdentifierReferenceType.class), null, value);
    }

    public ForecastIdentifierReference() {
        super(NAME, ((Class) ForecastIdentifierReferenceType.class), null, null);
    }

}
