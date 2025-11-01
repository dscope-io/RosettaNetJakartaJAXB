
package io.dscope.rosettanet.domain.service.service.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IncidentDetail
    extends JAXBElement<IncidentDetailType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "IncidentDetail");

    public IncidentDetail(IncidentDetailType value) {
        super(NAME, ((Class) IncidentDetailType.class), null, value);
    }

    public IncidentDetail() {
        super(NAME, ((Class) IncidentDetailType.class), null, null);
    }

}
