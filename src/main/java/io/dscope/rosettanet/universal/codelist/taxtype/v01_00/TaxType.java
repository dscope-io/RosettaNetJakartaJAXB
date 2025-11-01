
package io.dscope.rosettanet.universal.codelist.taxtype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxType
    extends JAXBElement<TaxTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:TaxType:xsd:codelist:1.0", "TaxType");

    public TaxType(TaxTypeType value) {
        super(NAME, ((Class) TaxTypeType.class), null, value);
    }

    public TaxType() {
        super(NAME, ((Class) TaxTypeType.class), null, null);
    }

}
