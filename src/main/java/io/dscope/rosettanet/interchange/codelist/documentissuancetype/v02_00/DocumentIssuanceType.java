
package io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DocumentIssuanceType
    extends JAXBElement<DocumentIssuanceTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00", "DocumentIssuanceType");

    public DocumentIssuanceType(DocumentIssuanceTypeType value) {
        super(NAME, ((Class) DocumentIssuanceTypeType.class), null, value);
    }

    public DocumentIssuanceType() {
        super(NAME, ((Class) DocumentIssuanceTypeType.class), null, null);
    }

}
