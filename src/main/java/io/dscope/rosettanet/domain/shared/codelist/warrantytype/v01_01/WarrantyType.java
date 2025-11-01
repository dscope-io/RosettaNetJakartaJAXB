
package io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarrantyType
    extends JAXBElement<WarrantyTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", "WarrantyType");

    public WarrantyType(WarrantyTypeType value) {
        super(NAME, ((Class) WarrantyTypeType.class), null, value);
    }

    public WarrantyType() {
        super(NAME, ((Class) WarrantyTypeType.class), null, null);
    }

}
