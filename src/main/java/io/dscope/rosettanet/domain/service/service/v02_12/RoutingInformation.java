
package io.dscope.rosettanet.domain.service.service.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RoutingInformation
    extends JAXBElement<RoutingInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "RoutingInformation");

    public RoutingInformation(RoutingInformationType value) {
        super(NAME, ((Class) RoutingInformationType.class), null, value);
    }

    public RoutingInformation() {
        super(NAME, ((Class) RoutingInformationType.class), null, null);
    }

}
