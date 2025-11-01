
package io.dscope.rosettanet.domain.design.codelist.compliant.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Compliant
    extends JAXBElement<CompliantType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.01", "Compliant");

    public Compliant(CompliantType value) {
        super(NAME, ((Class) CompliantType.class), null, value);
    }

    public Compliant() {
        super(NAME, ((Class) CompliantType.class), null, null);
    }

}
