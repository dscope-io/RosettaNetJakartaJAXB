
package io.dscope.rosettanet.domain.design.design.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Tolerance
    extends JAXBElement<ToleranceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.01", "Tolerance");

    public Tolerance(ToleranceType value) {
        super(NAME, ((Class) ToleranceType.class), null, value);
    }

    public Tolerance() {
        super(NAME, ((Class) ToleranceType.class), null, null);
    }

}
