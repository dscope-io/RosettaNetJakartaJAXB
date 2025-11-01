
package io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TaxExemptionCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:1.0", "TaxExemptionCodeA");

    public TaxExemptionCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TaxExemptionCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
