
package io.dscope.rosettanet.universal.codelist.documenttype.v01_13;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentType
    extends JAXBElement<DocumentTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.13", "DocumentType");

    public DocumentType(DocumentTypeType value) {
        super(NAME, ((Class) DocumentTypeType.class), null, value);
    }

    public DocumentType() {
        super(NAME, ((Class) DocumentTypeType.class), null, null);
    }

}
