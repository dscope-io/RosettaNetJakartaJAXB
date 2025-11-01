
package io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessType
    extends JAXBElement<ProcessTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:1.0", "ProcessType");

    public ProcessType(ProcessTypeType value) {
        super(NAME, ((Class) ProcessTypeType.class), null, value);
    }

    public ProcessType() {
        super(NAME, ((Class) ProcessTypeType.class), null, null);
    }

}
