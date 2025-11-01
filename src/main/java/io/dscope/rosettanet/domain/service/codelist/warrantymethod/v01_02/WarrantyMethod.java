
package io.dscope.rosettanet.domain.service.codelist.warrantymethod.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarrantyMethod
    extends JAXBElement<WarrantyMethodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:WarrantyMethod:xsd:codelist:01.02", "WarrantyMethod");

    public WarrantyMethod(WarrantyMethodType value) {
        super(NAME, ((Class) WarrantyMethodType.class), null, value);
    }

    public WarrantyMethod() {
        super(NAME, ((Class) WarrantyMethodType.class), null, null);
    }

}
