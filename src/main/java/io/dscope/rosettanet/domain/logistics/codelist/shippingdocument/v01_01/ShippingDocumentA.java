
package io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingDocumentA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.01", "ShippingDocumentA");

    public ShippingDocumentA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShippingDocumentA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
