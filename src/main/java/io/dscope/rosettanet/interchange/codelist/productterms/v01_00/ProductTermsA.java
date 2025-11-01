
package io.dscope.rosettanet.interchange.codelist.productterms.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductTermsA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.00", "ProductTermsA");

    public ProductTermsA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductTermsA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
