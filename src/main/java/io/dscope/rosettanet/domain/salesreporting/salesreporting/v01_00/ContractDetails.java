
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ContractDetails
    extends JAXBElement<ContractDetailsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", "ContractDetails");

    public ContractDetails(ContractDetailsType value) {
        super(NAME, ((Class) ContractDetailsType.class), null, value);
    }

    public ContractDetails() {
        super(NAME, ((Class) ContractDetailsType.class), null, null);
    }

}
