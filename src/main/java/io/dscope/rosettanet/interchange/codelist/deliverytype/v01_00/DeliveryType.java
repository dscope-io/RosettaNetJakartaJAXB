
package io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DeliveryType
    extends JAXBElement<DeliveryTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00", "DeliveryType");

    public DeliveryType(DeliveryTypeType value) {
        super(NAME, ((Class) DeliveryTypeType.class), null, value);
    }

    public DeliveryType() {
        super(NAME, ((Class) DeliveryTypeType.class), null, null);
    }

}
