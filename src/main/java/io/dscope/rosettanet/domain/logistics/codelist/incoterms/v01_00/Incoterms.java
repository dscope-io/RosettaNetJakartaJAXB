
package io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Incoterms
    extends JAXBElement<IncotermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:1.0", "Incoterms");

    public Incoterms(IncotermsType value) {
        super(NAME, ((Class) IncotermsType.class), null, value);
    }

    public Incoterms() {
        super(NAME, ((Class) IncotermsType.class), null, null);
    }

}
