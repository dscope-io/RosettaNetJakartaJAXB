
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Scac
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "Scac");

    public Scac(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public Scac() {
        super(NAME, ((Class) String.class), null, null);
    }

}
