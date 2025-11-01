
package io.dscope.rosettanet.domain.design.codelist.compliant.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CompliantA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.02", "CompliantA");

    public CompliantA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CompliantA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
