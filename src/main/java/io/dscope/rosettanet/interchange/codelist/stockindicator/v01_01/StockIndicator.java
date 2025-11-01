
package io.dscope.rosettanet.interchange.codelist.stockindicator.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StockIndicator
    extends JAXBElement<StockIndicatorType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01", "StockIndicator");

    public StockIndicator(StockIndicatorType value) {
        super(NAME, ((Class) StockIndicatorType.class), null, value);
    }

    public StockIndicator() {
        super(NAME, ((Class) StockIndicatorType.class), null, null);
    }

}
