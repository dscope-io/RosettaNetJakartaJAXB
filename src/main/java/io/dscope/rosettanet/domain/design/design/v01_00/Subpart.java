
package io.dscope.rosettanet.domain.design.design.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Subpart
    extends JAXBElement<SubpartType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.01", "Subpart");

    public Subpart(SubpartType value) {
        super(NAME, ((Class) SubpartType.class), null, value);
    }

    public Subpart() {
        super(NAME, ((Class) SubpartType.class), null, null);
    }

}
