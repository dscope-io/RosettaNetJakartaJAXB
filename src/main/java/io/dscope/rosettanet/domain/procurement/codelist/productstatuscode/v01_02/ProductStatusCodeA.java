
package io.dscope.rosettanet.domain.procurement.codelist.productstatuscode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductStatusCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductStatusCode:xsd:codelist:01.02", "ProductStatusCodeA");

    public ProductStatusCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductStatusCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
