
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BillFrom
    extends JAXBElement<BillFromType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "BillFrom");

    public BillFrom(BillFromType value) {
        super(NAME, ((Class) BillFromType.class), null, value);
    }

    public BillFrom() {
        super(NAME, ((Class) BillFromType.class), null, null);
    }

}
