
package io.dscope.rosettanet.interchange.codelist.stockindicator.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StockIndicatorA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01", "StockIndicatorA");

    public StockIndicatorA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public StockIndicatorA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
