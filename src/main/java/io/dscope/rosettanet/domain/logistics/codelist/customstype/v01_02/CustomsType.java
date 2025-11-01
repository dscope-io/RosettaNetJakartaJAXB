
package io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomsType
    extends JAXBElement<CustomsTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:CustomsType:xsd:codelist:01.02", "CustomsType");

    public CustomsType(CustomsTypeType value) {
        super(NAME, ((Class) CustomsTypeType.class), null, value);
    }

    public CustomsType() {
        super(NAME, ((Class) CustomsTypeType.class), null, null);
    }

}
