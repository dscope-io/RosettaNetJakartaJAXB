
package io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductProcurementType
    extends JAXBElement<ProductProcurementTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.02", "ProductProcurementType");

    public ProductProcurementType(ProductProcurementTypeType value) {
        super(NAME, ((Class) ProductProcurementTypeType.class), null, value);
    }

    public ProductProcurementType() {
        super(NAME, ((Class) ProductProcurementTypeType.class), null, null);
    }

}
