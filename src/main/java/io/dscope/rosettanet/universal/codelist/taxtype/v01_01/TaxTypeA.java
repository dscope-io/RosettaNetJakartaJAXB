
package io.dscope.rosettanet.universal.codelist.taxtype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.01", "TaxTypeA");

    public TaxTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TaxTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
