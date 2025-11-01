
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessInformation
    extends JAXBElement<ProcessInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", "ProcessInformation");

    public ProcessInformation(ProcessInformationType value) {
        super(NAME, ((Class) ProcessInformationType.class), null, value);
    }

    public ProcessInformation() {
        super(NAME, ((Class) ProcessInformationType.class), null, null);
    }

}
