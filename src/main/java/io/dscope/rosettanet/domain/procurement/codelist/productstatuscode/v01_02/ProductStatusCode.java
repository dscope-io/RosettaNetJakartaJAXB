
package io.dscope.rosettanet.domain.procurement.codelist.productstatuscode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductStatusCode
    extends JAXBElement<ProductStatusCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductStatusCode:xsd:codelist:01.02", "ProductStatusCode");

    public ProductStatusCode(ProductStatusCodeType value) {
        super(NAME, ((Class) ProductStatusCodeType.class), null, value);
    }

    public ProductStatusCode() {
        super(NAME, ((Class) ProductStatusCodeType.class), null, null);
    }

}
