
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BillTo
    extends JAXBElement<BillToType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "BillTo");

    public BillTo(BillToType value) {
        super(NAME, ((Class) BillToType.class), null, value);
    }

    public BillTo() {
        super(NAME, ((Class) BillToType.class), null, null);
    }

}
