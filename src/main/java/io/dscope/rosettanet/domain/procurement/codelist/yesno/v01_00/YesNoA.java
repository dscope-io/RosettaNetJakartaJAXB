
package io.dscope.rosettanet.domain.procurement.codelist.yesno.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class YesNoA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:YesNo:xsd:codelist:1.0", "YesNoA");

    public YesNoA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public YesNoA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
