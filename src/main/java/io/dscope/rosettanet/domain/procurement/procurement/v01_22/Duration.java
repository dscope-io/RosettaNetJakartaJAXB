
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Duration
    extends JAXBElement<DurationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "Duration");

    public Duration(DurationType value) {
        super(NAME, ((Class) DurationType.class), null, value);
    }

    public Duration() {
        super(NAME, ((Class) DurationType.class), null, null);
    }

}
