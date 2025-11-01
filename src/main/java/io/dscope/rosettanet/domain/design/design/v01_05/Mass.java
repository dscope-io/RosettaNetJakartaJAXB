
package io.dscope.rosettanet.domain.design.design.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Mass
    extends JAXBElement<MassType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.05", "Mass");

    public Mass(MassType value) {
        super(NAME, ((Class) MassType.class), null, value);
    }

    public Mass() {
        super(NAME, ((Class) MassType.class), null, null);
    }

}
