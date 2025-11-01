
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "RegistrationStatusDistribution", namespace = "urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00")
public class RegistrationStatusDistribution
    extends JAXBElement<RegistrationStatusDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00", "RegistrationStatusDistribution");

    public RegistrationStatusDistribution(RegistrationStatusDistributionType value) {
        super(NAME, ((Class) RegistrationStatusDistributionType.class), null, value);
    }

    public RegistrationStatusDistribution() {
        super(NAME, ((Class) RegistrationStatusDistributionType.class), null, null);
    }

}
