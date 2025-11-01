
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxPhrase
    extends JAXBElement<TaxPhraseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", "TaxPhrase");

    public TaxPhrase(TaxPhraseType value) {
        super(NAME, ((Class) TaxPhraseType.class), null, value);
    }

    public TaxPhrase() {
        super(NAME, ((Class) TaxPhraseType.class), null, null);
    }

}
