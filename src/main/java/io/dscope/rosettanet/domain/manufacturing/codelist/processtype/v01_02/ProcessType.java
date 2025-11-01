
package io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessType
    extends JAXBElement<ProcessTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.02", "ProcessType");

    public ProcessType(ProcessTypeType value) {
        super(NAME, ((Class) ProcessTypeType.class), null, value);
    }

    public ProcessType() {
        super(NAME, ((Class) ProcessTypeType.class), null, null);
    }

}
