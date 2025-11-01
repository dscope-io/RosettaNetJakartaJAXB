
package io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ServiceDeliveryMethodA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02", "ServiceDeliveryMethodA");

    public ServiceDeliveryMethodA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ServiceDeliveryMethodA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
