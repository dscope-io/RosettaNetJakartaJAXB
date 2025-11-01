
package io.dscope.rosettanet.universal.document.v01_09;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BusinessDocumentReference
    extends JAXBElement<BusinessDocumentReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Document:xsd:schema:01.09", "BusinessDocumentReference");

    public BusinessDocumentReference(BusinessDocumentReferenceType value) {
        super(NAME, ((Class) BusinessDocumentReferenceType.class), null, value);
    }

    public BusinessDocumentReference() {
        super(NAME, ((Class) BusinessDocumentReferenceType.class), null, null);
    }

}
