
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InstallAtPartner
    extends JAXBElement<InstallAtPartnerType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "InstallAtPartner");

    public InstallAtPartner(InstallAtPartnerType value) {
        super(NAME, ((Class) InstallAtPartnerType.class), null, value);
    }

    public InstallAtPartner() {
        super(NAME, ((Class) InstallAtPartnerType.class), null, null);
    }

}
