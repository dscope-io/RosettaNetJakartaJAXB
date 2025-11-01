
package io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PreferredStatus
    extends JAXBElement<PreferredStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:1.0", "PreferredStatus");

    public PreferredStatus(PreferredStatusType value) {
        super(NAME, ((Class) PreferredStatusType.class), null, value);
    }

    public PreferredStatus() {
        super(NAME, ((Class) PreferredStatusType.class), null, null);
    }

}
