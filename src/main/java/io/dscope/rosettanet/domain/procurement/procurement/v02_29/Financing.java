
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Financing
    extends JAXBElement<FinancingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", "Financing");

    public Financing(FinancingType value) {
        super(NAME, ((Class) FinancingType.class), null, value);
    }

    public Financing() {
        super(NAME, ((Class) FinancingType.class), null, null);
    }

}
