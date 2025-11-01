
package io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SupplierPartStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:1.0", "SupplierPartStatusA");

    public SupplierPartStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SupplierPartStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
