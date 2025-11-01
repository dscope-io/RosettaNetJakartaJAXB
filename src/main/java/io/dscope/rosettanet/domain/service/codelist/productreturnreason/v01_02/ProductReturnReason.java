
package io.dscope.rosettanet.domain.service.codelist.productreturnreason.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductReturnReason
    extends JAXBElement<ProductReturnReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ProductReturnReason:xsd:codelist:01.02", "ProductReturnReason");

    public ProductReturnReason(ProductReturnReasonType value) {
        super(NAME, ((Class) ProductReturnReasonType.class), null, value);
    }

    public ProductReturnReason() {
        super(NAME, ((Class) ProductReturnReasonType.class), null, null);
    }

}
