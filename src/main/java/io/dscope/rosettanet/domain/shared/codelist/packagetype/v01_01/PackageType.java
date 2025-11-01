
package io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PackageType
    extends JAXBElement<PackageTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", "PackageType");

    public PackageType(PackageTypeType value) {
        super(NAME, ((Class) PackageTypeType.class), null, value);
    }

    public PackageType() {
        super(NAME, ((Class) PackageTypeType.class), null, null);
    }

}
