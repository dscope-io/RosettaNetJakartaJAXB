
package io.dscope.rosettanet.domain.procurement.procurement.v01_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductForecast
    extends JAXBElement<ProductForecastType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", "ProductForecast");

    public ProductForecast(ProductForecastType value) {
        super(NAME, ((Class) ProductForecastType.class), null, value);
    }

    public ProductForecast() {
        super(NAME, ((Class) ProductForecastType.class), null, null);
    }

}
