
package io.dscope.rosettanet.domain.logistics.logistics.v02_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Customs
    extends JAXBElement<CustomsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.05", "Customs");

    public Customs(CustomsType value) {
        super(NAME, ((Class) CustomsType.class), null, value);
    }

    public Customs() {
        super(NAME, ((Class) CustomsType.class), null, null);
    }

}
