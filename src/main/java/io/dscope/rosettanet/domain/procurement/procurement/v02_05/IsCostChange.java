
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsCostChange
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", "IsCostChange");

    public IsCostChange(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsCostChange() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
