
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TesterFEH
    extends JAXBElement<TesterFEHType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "TesterFEH");

    public TesterFEH(TesterFEHType value) {
        super(NAME, ((Class) TesterFEHType.class), null, value);
    }

    public TesterFEH() {
        super(NAME, ((Class) TesterFEHType.class), null, null);
    }

}
