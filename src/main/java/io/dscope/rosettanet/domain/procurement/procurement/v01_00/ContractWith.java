
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContractWith
    extends JAXBElement<ContractWithType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "ContractWith");

    public ContractWith(ContractWithType value) {
        super(NAME, ((Class) ContractWithType.class), null, value);
    }

    public ContractWith() {
        super(NAME, ((Class) ContractWithType.class), null, null);
    }

}
