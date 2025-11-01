
package io.dscope.rosettanet.domain.design.codelist.productlifecyclestatuscode.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductLifeCycleStatusCode
    extends JAXBElement<ProductLifeCycleStatusCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.03", "ProductLifeCycleStatusCode");

    public ProductLifeCycleStatusCode(ProductLifeCycleStatusCodeType value) {
        super(NAME, ((Class) ProductLifeCycleStatusCodeType.class), null, value);
    }

    public ProductLifeCycleStatusCode() {
        super(NAME, ((Class) ProductLifeCycleStatusCodeType.class), null, null);
    }

}
