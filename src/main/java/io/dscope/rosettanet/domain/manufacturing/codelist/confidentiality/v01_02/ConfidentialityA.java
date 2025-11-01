
package io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ConfidentialityA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.02", "ConfidentialityA");

    public ConfidentialityA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ConfidentialityA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
