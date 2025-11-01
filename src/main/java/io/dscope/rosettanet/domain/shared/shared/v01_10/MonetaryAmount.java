
package io.dscope.rosettanet.domain.shared.shared.v01_10;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MonetaryAmount
    extends JAXBElement<MonetaryAmountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", "MonetaryAmount");

    public MonetaryAmount(MonetaryAmountType value) {
        super(NAME, ((Class) MonetaryAmountType.class), null, value);
    }

    public MonetaryAmount() {
        super(NAME, ((Class) MonetaryAmountType.class), null, null);
    }

}
