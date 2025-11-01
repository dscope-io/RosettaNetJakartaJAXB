
package io.dscope.rosettanet.domain.procurement.codelist.bookpricequalifier.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BookPriceQualifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:01.02", "BookPriceQualifierA");

    public BookPriceQualifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public BookPriceQualifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
