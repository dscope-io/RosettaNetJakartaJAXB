
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BookPrice
    extends JAXBElement<BookPriceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "BookPrice");

    public BookPrice(BookPriceType value) {
        super(NAME, ((Class) BookPriceType.class), null, value);
    }

    public BookPrice() {
        super(NAME, ((Class) BookPriceType.class), null, null);
    }

}
