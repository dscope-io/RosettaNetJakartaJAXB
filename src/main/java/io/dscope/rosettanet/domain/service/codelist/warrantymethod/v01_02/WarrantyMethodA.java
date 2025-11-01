
package io.dscope.rosettanet.domain.service.codelist.warrantymethod.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WarrantyMethodA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:WarrantyMethod:xsd:codelist:01.02", "WarrantyMethodA");

    public WarrantyMethodA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WarrantyMethodA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
