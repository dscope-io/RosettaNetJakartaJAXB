
package io.dscope.rosettanet.domain.logistics.logistics.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductLicenseRequired
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.14", "ProductLicenseRequired");

    public ProductLicenseRequired(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public ProductLicenseRequired() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
