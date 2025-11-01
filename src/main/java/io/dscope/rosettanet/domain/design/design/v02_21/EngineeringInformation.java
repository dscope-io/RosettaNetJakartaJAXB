
package io.dscope.rosettanet.domain.design.design.v02_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class EngineeringInformation
    extends JAXBElement<EngineeringInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.21", "EngineeringInformation");

    public EngineeringInformation(EngineeringInformationType value) {
        super(NAME, ((Class) EngineeringInformationType.class), null, value);
    }

    public EngineeringInformation() {
        super(NAME, ((Class) EngineeringInformationType.class), null, null);
    }

}
