
package io.dscope.rosettanet.domain.logistics.logistics.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsHazardousMaterial
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", "IsHazardousMaterial");

    public IsHazardousMaterial(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsHazardousMaterial() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
