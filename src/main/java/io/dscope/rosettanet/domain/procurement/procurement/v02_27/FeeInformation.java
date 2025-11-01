
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FeeInformation
    extends JAXBElement<FeeInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", "FeeInformation");

    public FeeInformation(FeeInformationType value) {
        super(NAME, ((Class) FeeInformationType.class), null, value);
    }

    public FeeInformation() {
        super(NAME, ((Class) FeeInformationType.class), null, null);
    }

}
