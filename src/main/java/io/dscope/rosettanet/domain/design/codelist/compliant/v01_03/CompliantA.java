
package io.dscope.rosettanet.domain.design.codelist.compliant.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CompliantA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.03", "CompliantA");

    public CompliantA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CompliantA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
