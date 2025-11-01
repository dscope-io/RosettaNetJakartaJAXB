
package io.dscope.rosettanet.interchange.engineeringinformationinquirydistribution.v01_02;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "EngineeringInformationInquiryDistribution", namespace = "urn:rosettanet:specification:interchange:EngineeringInformationInquiryDistribution:xsd:schema:01.02")
public class EngineeringInformationInquiryDistribution
    extends JAXBElement<EngineeringInformationInquiryDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:EngineeringInformationInquiryDistribution:xsd:schema:01.02", "EngineeringInformationInquiryDistribution");

    public EngineeringInformationInquiryDistribution(EngineeringInformationInquiryDistributionType value) {
        super(NAME, ((Class) EngineeringInformationInquiryDistributionType.class), null, value);
    }

    public EngineeringInformationInquiryDistribution() {
        super(NAME, ((Class) EngineeringInformationInquiryDistributionType.class), null, null);
    }

}
