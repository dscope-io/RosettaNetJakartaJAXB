
package io.dscope.rosettanet.system.standarddocumentheader.v01_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentIdentification
    extends JAXBElement<DocumentIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.22", "DocumentIdentification");

    public DocumentIdentification(DocumentIdentificationType value) {
        super(NAME, ((Class) DocumentIdentificationType.class), null, value);
    }

    public DocumentIdentification() {
        super(NAME, ((Class) DocumentIdentificationType.class), null, null);
    }

}
