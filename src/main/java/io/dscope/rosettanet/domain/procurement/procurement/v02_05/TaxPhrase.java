
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxPhrase
    extends JAXBElement<TaxPhraseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", "TaxPhrase");

    public TaxPhrase(TaxPhraseType value) {
        super(NAME, ((Class) TaxPhraseType.class), null, value);
    }

    public TaxPhrase() {
        super(NAME, ((Class) TaxPhraseType.class), null, null);
    }

}
