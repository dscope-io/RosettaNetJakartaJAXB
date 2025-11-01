
package io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentTerms
    extends JAXBElement<ShipmentTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.02", "ShipmentTerms");

    public ShipmentTerms(ShipmentTermsType value) {
        super(NAME, ((Class) ShipmentTermsType.class), null, value);
    }

    public ShipmentTerms() {
        super(NAME, ((Class) ShipmentTermsType.class), null, null);
    }

}
