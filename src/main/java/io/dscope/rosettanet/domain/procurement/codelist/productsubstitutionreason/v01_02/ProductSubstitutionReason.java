
package io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductSubstitutionReason
    extends JAXBElement<ProductSubstitutionReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.02", "ProductSubstitutionReason");

    public ProductSubstitutionReason(ProductSubstitutionReasonType value) {
        super(NAME, ((Class) ProductSubstitutionReasonType.class), null, value);
    }

    public ProductSubstitutionReason() {
        super(NAME, ((Class) ProductSubstitutionReasonType.class), null, null);
    }

}
