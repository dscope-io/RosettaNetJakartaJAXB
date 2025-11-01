
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BillOfLading
    extends JAXBElement<BillOfLadingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", "BillOfLading");

    public BillOfLading(BillOfLadingType value) {
        super(NAME, ((Class) BillOfLadingType.class), null, value);
    }

    public BillOfLading() {
        super(NAME, ((Class) BillOfLadingType.class), null, null);
    }

}
