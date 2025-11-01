
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxInformation
    extends JAXBElement<TaxInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", "TaxInformation");

    public TaxInformation(TaxInformationType value) {
        super(NAME, ((Class) TaxInformationType.class), null, value);
    }

    public TaxInformation() {
        super(NAME, ((Class) TaxInformationType.class), null, null);
    }

}
