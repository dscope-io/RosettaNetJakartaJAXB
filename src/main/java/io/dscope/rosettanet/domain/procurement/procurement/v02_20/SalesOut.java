
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SalesOut
    extends JAXBElement<SalesOutType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", "SalesOut");

    public SalesOut(SalesOutType value) {
        super(NAME, ((Class) SalesOutType.class), null, value);
    }

    public SalesOut() {
        super(NAME, ((Class) SalesOutType.class), null, null);
    }

}
