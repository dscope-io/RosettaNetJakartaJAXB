
package io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SupplierPartStatus
    extends JAXBElement<SupplierPartStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:1.0", "SupplierPartStatus");

    public SupplierPartStatus(SupplierPartStatusType value) {
        super(NAME, ((Class) SupplierPartStatusType.class), null, value);
    }

    public SupplierPartStatus() {
        super(NAME, ((Class) SupplierPartStatusType.class), null, null);
    }

}
