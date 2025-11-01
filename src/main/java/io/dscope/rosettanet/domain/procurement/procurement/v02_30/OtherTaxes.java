
package io.dscope.rosettanet.domain.procurement.procurement.v02_30;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class OtherTaxes
    extends JAXBElement<OtherTaxesType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", "OtherTaxes");

    public OtherTaxes(OtherTaxesType value) {
        super(NAME, ((Class) OtherTaxesType.class), null, value);
    }

    public OtherTaxes() {
        super(NAME, ((Class) OtherTaxesType.class), null, null);
    }

}
