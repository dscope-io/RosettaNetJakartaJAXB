
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ServiceInformation
    extends JAXBElement<ServiceInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "ServiceInformation");

    public ServiceInformation(ServiceInformationType value) {
        super(NAME, ((Class) ServiceInformationType.class), null, value);
    }

    public ServiceInformation() {
        super(NAME, ((Class) ServiceInformationType.class), null, null);
    }

}
