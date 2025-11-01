
package io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PackageTypeCode
    extends JAXBElement<PackageTypeCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.00", "PackageTypeCode");

    public PackageTypeCode(PackageTypeCodeType value) {
        super(NAME, ((Class) PackageTypeCodeType.class), null, value);
    }

    public PackageTypeCode() {
        super(NAME, ((Class) PackageTypeCodeType.class), null, null);
    }

}
