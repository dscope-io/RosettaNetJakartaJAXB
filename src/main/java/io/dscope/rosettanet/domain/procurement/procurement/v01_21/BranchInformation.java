
package io.dscope.rosettanet.domain.procurement.procurement.v01_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BranchInformation
    extends JAXBElement<BranchInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.21", "BranchInformation");

    public BranchInformation(BranchInformationType value) {
        super(NAME, ((Class) BranchInformationType.class), null, value);
    }

    public BranchInformation() {
        super(NAME, ((Class) BranchInformationType.class), null, null);
    }

}
