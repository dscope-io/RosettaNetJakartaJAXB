
package io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DeliveryTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00", "DeliveryTypeA");

    public DeliveryTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DeliveryTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
