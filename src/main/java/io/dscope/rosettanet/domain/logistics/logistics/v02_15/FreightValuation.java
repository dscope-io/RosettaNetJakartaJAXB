
package io.dscope.rosettanet.domain.logistics.logistics.v02_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreightValuation
    extends JAXBElement<FreightValuationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", "FreightValuation");

    public FreightValuation(FreightValuationType value) {
        super(NAME, ((Class) FreightValuationType.class), null, value);
    }

    public FreightValuation() {
        super(NAME, ((Class) FreightValuationType.class), null, null);
    }

}
