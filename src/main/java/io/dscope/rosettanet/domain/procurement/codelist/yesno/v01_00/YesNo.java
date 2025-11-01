
package io.dscope.rosettanet.domain.procurement.codelist.yesno.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class YesNo
    extends JAXBElement<YesNoType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:YesNo:xsd:codelist:1.0", "YesNo");

    public YesNo(YesNoType value) {
        super(NAME, ((Class) YesNoType.class), null, value);
    }

    public YesNo() {
        super(NAME, ((Class) YesNoType.class), null, null);
    }

}
