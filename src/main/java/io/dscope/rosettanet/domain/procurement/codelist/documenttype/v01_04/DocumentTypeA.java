
package io.dscope.rosettanet.domain.procurement.codelist.documenttype.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:DocumentType:xsd:codelist:01.04", "DocumentTypeA");

    public DocumentTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DocumentTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
