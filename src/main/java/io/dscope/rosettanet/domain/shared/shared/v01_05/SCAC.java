
package io.dscope.rosettanet.domain.shared.shared.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SCAC
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", "SCAC");

    public SCAC(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public SCAC() {
        super(NAME, ((Class) String.class), null, null);
    }

}
