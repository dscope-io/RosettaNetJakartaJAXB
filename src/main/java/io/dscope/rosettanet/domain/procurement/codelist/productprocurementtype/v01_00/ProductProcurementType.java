
package io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductProcurementType
    extends JAXBElement<ProductProcurementTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:1.0", "ProductProcurementType");

    public ProductProcurementType(ProductProcurementTypeType value) {
        super(NAME, ((Class) ProductProcurementTypeType.class), null, value);
    }

    public ProductProcurementType() {
        super(NAME, ((Class) ProductProcurementTypeType.class), null, null);
    }

}
