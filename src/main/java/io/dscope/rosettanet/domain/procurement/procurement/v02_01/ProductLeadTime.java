
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductLeadTime
    extends JAXBElement<ProductLeadTimeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", "ProductLeadTime");

    public ProductLeadTime(ProductLeadTimeType value) {
        super(NAME, ((Class) ProductLeadTimeType.class), null, value);
    }

    public ProductLeadTime() {
        super(NAME, ((Class) ProductLeadTimeType.class), null, null);
    }

}
