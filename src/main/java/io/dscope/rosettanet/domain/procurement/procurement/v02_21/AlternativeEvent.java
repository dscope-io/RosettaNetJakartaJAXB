
package io.dscope.rosettanet.domain.procurement.procurement.v02_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AlternativeEvent
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21", "AlternativeEvent");

    public AlternativeEvent(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public AlternativeEvent() {
        super(NAME, ((Class) String.class), null, null);
    }

}
