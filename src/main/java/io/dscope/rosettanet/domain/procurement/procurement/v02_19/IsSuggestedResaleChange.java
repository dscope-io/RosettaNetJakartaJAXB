
package io.dscope.rosettanet.domain.procurement.procurement.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsSuggestedResaleChange
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", "IsSuggestedResaleChange");

    public IsSuggestedResaleChange(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsSuggestedResaleChange() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
