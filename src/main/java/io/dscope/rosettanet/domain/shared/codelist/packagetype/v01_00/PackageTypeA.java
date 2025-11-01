
package io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PackageTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.00", "PackageTypeA");

    public PackageTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public PackageTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
