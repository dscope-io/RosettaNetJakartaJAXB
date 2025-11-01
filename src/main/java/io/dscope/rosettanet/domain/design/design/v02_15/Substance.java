
package io.dscope.rosettanet.domain.design.design.v02_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Substance
    extends JAXBElement<SubstanceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.15", "Substance");

    public Substance(SubstanceType value) {
        super(NAME, ((Class) SubstanceType.class), null, value);
    }

    public Substance() {
        super(NAME, ((Class) SubstanceType.class), null, null);
    }

}
