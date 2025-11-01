
package io.dscope.rosettanet.universal.codelist.documenttype.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.05", "DocumentTypeA");

    public DocumentTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DocumentTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
