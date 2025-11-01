
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InstallAtPartnerLine
    extends JAXBElement<InstallAtPartnerLineType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "InstallAtPartnerLine");

    public InstallAtPartnerLine(InstallAtPartnerLineType value) {
        super(NAME, ((Class) InstallAtPartnerLineType.class), null, value);
    }

    public InstallAtPartnerLine() {
        super(NAME, ((Class) InstallAtPartnerLineType.class), null, null);
    }

}
