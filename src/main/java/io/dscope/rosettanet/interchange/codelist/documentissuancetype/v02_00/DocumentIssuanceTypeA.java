
package io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentIssuanceTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00", "DocumentIssuanceTypeA");

    public DocumentIssuanceTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DocumentIssuanceTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
