
package io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Confidentiality
    extends JAXBElement<ConfidentialityType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.02", "Confidentiality");

    public Confidentiality(ConfidentialityType value) {
        super(NAME, ((Class) ConfidentialityType.class), null, value);
    }

    public Confidentiality() {
        super(NAME, ((Class) ConfidentialityType.class), null, null);
    }

}
