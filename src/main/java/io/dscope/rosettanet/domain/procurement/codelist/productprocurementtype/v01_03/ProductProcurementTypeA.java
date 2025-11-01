
package io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductProcurementTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03", "ProductProcurementTypeA");

    public ProductProcurementTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductProcurementTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
