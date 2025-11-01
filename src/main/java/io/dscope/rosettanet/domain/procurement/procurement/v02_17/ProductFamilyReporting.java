
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductFamilyReporting
    extends JAXBElement<ProductFamilyReportingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", "ProductFamilyReporting");

    public ProductFamilyReporting(ProductFamilyReportingType value) {
        super(NAME, ((Class) ProductFamilyReportingType.class), null, value);
    }

    public ProductFamilyReporting() {
        super(NAME, ((Class) ProductFamilyReportingType.class), null, null);
    }

}
