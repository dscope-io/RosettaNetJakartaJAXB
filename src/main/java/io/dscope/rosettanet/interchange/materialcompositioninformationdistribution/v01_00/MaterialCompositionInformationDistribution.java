
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "MaterialCompositionInformationDistribution", namespace = "urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:1.0")
public class MaterialCompositionInformationDistribution
    extends JAXBElement<MaterialCompositionInformationDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:1.0", "MaterialCompositionInformationDistribution");

    public MaterialCompositionInformationDistribution(MaterialCompositionInformationDistributionType value) {
        super(NAME, ((Class) MaterialCompositionInformationDistributionType.class), null, value);
    }

    public MaterialCompositionInformationDistribution() {
        super(NAME, ((Class) MaterialCompositionInformationDistributionType.class), null, null);
    }

}
