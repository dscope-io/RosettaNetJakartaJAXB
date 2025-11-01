
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PriceList
    extends JAXBElement<PriceListType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", "PriceList");

    public PriceList(PriceListType value) {
        super(NAME, ((Class) PriceListType.class), null, value);
    }

    public PriceList() {
        super(NAME, ((Class) PriceListType.class), null, null);
    }

}
