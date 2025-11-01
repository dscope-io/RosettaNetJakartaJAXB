
package io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessRoleIdentifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.04", "ProcessRoleIdentifierA");

    public ProcessRoleIdentifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProcessRoleIdentifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
