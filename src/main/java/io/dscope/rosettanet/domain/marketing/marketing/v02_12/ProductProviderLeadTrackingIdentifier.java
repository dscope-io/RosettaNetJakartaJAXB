
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductProviderLeadTrackingIdentifier
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "ProductProviderLeadTrackingIdentifier");

    public ProductProviderLeadTrackingIdentifier(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public ProductProviderLeadTrackingIdentifier() {
        super(NAME, ((Class) String.class), null, null);
    }

}
