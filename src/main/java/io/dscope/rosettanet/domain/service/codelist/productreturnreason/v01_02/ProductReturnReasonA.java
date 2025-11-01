
package io.dscope.rosettanet.domain.service.codelist.productreturnreason.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductReturnReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ProductReturnReason:xsd:codelist:01.02", "ProductReturnReasonA");

    public ProductReturnReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductReturnReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
