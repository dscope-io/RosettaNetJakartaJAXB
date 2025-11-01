
package io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessRoleIdentifier
    extends JAXBElement<ProcessRoleIdentifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.05", "ProcessRoleIdentifier");

    public ProcessRoleIdentifier(ProcessRoleIdentifierType value) {
        super(NAME, ((Class) ProcessRoleIdentifierType.class), null, value);
    }

    public ProcessRoleIdentifier() {
        super(NAME, ((Class) ProcessRoleIdentifierType.class), null, null);
    }

}
