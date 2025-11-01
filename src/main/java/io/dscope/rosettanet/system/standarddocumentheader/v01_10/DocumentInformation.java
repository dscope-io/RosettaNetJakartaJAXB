
package io.dscope.rosettanet.system.standarddocumentheader.v01_10;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentInformation
    extends JAXBElement<DocumentInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", "DocumentInformation");

    public DocumentInformation(DocumentInformationType value) {
        super(NAME, ((Class) DocumentInformationType.class), null, value);
    }

    public DocumentInformation() {
        super(NAME, ((Class) DocumentInformationType.class), null, null);
    }

}
