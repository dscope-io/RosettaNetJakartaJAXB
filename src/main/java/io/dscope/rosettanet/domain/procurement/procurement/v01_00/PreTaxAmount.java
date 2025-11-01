
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PreTaxAmount
    extends JAXBElement<PreTaxAmountType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "PreTaxAmount");

    public PreTaxAmount(PreTaxAmountType value) {
        super(NAME, ((Class) PreTaxAmountType.class), null, value);
    }

    public PreTaxAmount() {
        super(NAME, ((Class) PreTaxAmountType.class), null, null);
    }

}
