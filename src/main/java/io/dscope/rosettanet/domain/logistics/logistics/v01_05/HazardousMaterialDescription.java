
package io.dscope.rosettanet.domain.logistics.logistics.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class HazardousMaterialDescription
    extends JAXBElement<HazardousMaterialDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.05", "HazardousMaterialDescription");

    public HazardousMaterialDescription(HazardousMaterialDescriptionType value) {
        super(NAME, ((Class) HazardousMaterialDescriptionType.class), null, value);
    }

    public HazardousMaterialDescription() {
        super(NAME, ((Class) HazardousMaterialDescriptionType.class), null, null);
    }

}
