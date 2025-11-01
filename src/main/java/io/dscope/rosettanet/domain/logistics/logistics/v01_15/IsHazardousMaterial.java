
package io.dscope.rosettanet.domain.logistics.logistics.v01_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsHazardousMaterial
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.15", "IsHazardousMaterial");

    public IsHazardousMaterial(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsHazardousMaterial() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
