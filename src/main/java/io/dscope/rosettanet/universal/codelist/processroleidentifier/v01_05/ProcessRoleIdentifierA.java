
package io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProcessRoleIdentifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.05", "ProcessRoleIdentifierA");

    public ProcessRoleIdentifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProcessRoleIdentifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
