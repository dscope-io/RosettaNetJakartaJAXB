
package io.dscope.rosettanet.domain.marketing.codelist.disposition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DispositionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:Disposition:xsd:codelist:01.02", "DispositionA");

    public DispositionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DispositionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
