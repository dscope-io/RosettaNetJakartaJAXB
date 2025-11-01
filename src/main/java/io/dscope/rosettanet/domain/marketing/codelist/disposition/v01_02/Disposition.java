
package io.dscope.rosettanet.domain.marketing.codelist.disposition.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Disposition
    extends JAXBElement<DispositionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:Disposition:xsd:codelist:01.02", "Disposition");

    public Disposition(DispositionType value) {
        super(NAME, ((Class) DispositionType.class), null, value);
    }

    public Disposition() {
        super(NAME, ((Class) DispositionType.class), null, null);
    }

}
