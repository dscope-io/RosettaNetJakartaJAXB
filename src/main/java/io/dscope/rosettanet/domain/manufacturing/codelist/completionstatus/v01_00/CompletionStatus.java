
package io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CompletionStatus
    extends JAXBElement<CompletionStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:1.0", "CompletionStatus");

    public CompletionStatus(CompletionStatusType value) {
        super(NAME, ((Class) CompletionStatusType.class), null, value);
    }

    public CompletionStatus() {
        super(NAME, ((Class) CompletionStatusType.class), null, null);
    }

}
