
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AncillaryDocument
    extends JAXBElement<AncillaryDocumentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", "AncillaryDocument");

    public AncillaryDocument(AncillaryDocumentType value) {
        super(NAME, ((Class) AncillaryDocumentType.class), null, value);
    }

    public AncillaryDocument() {
        super(NAME, ((Class) AncillaryDocumentType.class), null, null);
    }

}
