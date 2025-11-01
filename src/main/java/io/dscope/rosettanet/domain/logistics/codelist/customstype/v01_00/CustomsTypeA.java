
package io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomsTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:CustomsType:xsd:codelist:1.0", "CustomsTypeA");

    public CustomsTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CustomsTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
