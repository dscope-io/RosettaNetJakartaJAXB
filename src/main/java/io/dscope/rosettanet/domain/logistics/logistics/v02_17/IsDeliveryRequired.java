
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsDeliveryRequired
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", "IsDeliveryRequired");

    public IsDeliveryRequired(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsDeliveryRequired() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
