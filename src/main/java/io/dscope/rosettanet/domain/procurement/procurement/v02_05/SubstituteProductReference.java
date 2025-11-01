
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SubstituteProductReference
    extends JAXBElement<SubstituteProductReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", "SubstituteProductReference");

    public SubstituteProductReference(SubstituteProductReferenceType value) {
        super(NAME, ((Class) SubstituteProductReferenceType.class), null, value);
    }

    public SubstituteProductReference() {
        super(NAME, ((Class) SubstituteProductReferenceType.class), null, null);
    }

}
