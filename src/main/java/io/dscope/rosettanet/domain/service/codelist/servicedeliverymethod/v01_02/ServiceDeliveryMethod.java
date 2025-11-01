
package io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ServiceDeliveryMethod
    extends JAXBElement<ServiceDeliveryMethodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02", "ServiceDeliveryMethod");

    public ServiceDeliveryMethod(ServiceDeliveryMethodType value) {
        super(NAME, ((Class) ServiceDeliveryMethodType.class), null, value);
    }

    public ServiceDeliveryMethod() {
        super(NAME, ((Class) ServiceDeliveryMethodType.class), null, null);
    }

}
