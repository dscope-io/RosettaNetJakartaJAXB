
package io.dscope.rosettanet.domain.procurement.codelist.packagetypecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PackageTypeCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:PackageTypeCode:xsd:codelist:1.0", "PackageTypeCodeA");

    public PackageTypeCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PackageTypeCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
