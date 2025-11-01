
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsFinalForecast
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", "IsFinalForecast");

    public IsFinalForecast(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsFinalForecast() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
