
package io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarrantyTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.00", "WarrantyTypeA");

    public WarrantyTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WarrantyTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
