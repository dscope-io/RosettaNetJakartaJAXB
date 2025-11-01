
package io.dscope.rosettanet.domain.logistics.codelist.markuptype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkUpType
    extends JAXBElement<MarkUpTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:MarkUpType:xsd:codelist:01.00", "MarkUpType");

    public MarkUpType(MarkUpTypeType value) {
        super(NAME, ((Class) MarkUpTypeType.class), null, value);
    }

    public MarkUpType() {
        super(NAME, ((Class) MarkUpTypeType.class), null, null);
    }

}
