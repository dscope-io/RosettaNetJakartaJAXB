
package io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentTermsA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:1.0", "ShipmentTermsA");

    public ShipmentTermsA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipmentTermsA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
