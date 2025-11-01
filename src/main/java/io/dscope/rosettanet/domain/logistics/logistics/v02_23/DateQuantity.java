
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateQuantity
    extends JAXBElement<DateQuantityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", "DateQuantity");

    public DateQuantity(DateQuantityType value) {
        super(NAME, ((Class) DateQuantityType.class), null, value);
    }

    public DateQuantity() {
        super(NAME, ((Class) DateQuantityType.class), null, null);
    }

}
