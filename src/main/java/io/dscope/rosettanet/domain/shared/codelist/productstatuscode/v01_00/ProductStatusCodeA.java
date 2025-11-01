
package io.dscope.rosettanet.domain.shared.codelist.productstatuscode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductStatusCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.00", "ProductStatusCodeA");

    public ProductStatusCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductStatusCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
