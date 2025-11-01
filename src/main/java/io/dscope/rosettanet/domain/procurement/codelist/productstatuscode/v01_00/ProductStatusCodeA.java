
package io.dscope.rosettanet.domain.procurement.codelist.productstatuscode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductStatusCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductStatusCode:xsd:codelist:1.0", "ProductStatusCodeA");

    public ProductStatusCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductStatusCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
