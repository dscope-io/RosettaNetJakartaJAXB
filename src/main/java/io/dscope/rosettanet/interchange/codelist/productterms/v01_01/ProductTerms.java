
package io.dscope.rosettanet.interchange.codelist.productterms.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductTerms
    extends JAXBElement<ProductTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.01", "ProductTerms");

    public ProductTerms(ProductTermsType value) {
        super(NAME, ((Class) ProductTermsType.class), null, value);
    }

    public ProductTerms() {
        super(NAME, ((Class) ProductTermsType.class), null, null);
    }

}
