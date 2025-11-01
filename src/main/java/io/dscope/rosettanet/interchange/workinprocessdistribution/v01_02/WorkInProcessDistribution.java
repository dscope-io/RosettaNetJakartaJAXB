
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "WorkInProcessDistribution", namespace = "urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02")
public class WorkInProcessDistribution
    extends JAXBElement<WorkInProcessDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02", "WorkInProcessDistribution");

    public WorkInProcessDistribution(WorkInProcessDistributionType value) {
        super(NAME, ((Class) WorkInProcessDistributionType.class), null, value);
    }

    public WorkInProcessDistribution() {
        super(NAME, ((Class) WorkInProcessDistributionType.class), null, null);
    }

}
