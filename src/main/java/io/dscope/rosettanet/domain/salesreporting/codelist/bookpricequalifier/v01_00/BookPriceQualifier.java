
package io.dscope.rosettanet.domain.salesreporting.codelist.bookpricequalifier.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BookPriceQualifier
    extends JAXBElement<BookPriceQualifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:BookPriceQualifier:xsd:codelist:1.0", "BookPriceQualifier");

    public BookPriceQualifier(BookPriceQualifierType value) {
        super(NAME, ((Class) BookPriceQualifierType.class), null, value);
    }

    public BookPriceQualifier() {
        super(NAME, ((Class) BookPriceQualifierType.class), null, null);
    }

}
