
package io.dscope.rosettanet.universal.codelist.currency.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Currency
    extends JAXBElement<CurrencyType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Currency:xsd:codelist:1.0", "Currency");

    public Currency(CurrencyType value) {
        super(NAME, ((Class) CurrencyType.class), null, value);
    }

    public Currency() {
        super(NAME, ((Class) CurrencyType.class), null, null);
    }

}
