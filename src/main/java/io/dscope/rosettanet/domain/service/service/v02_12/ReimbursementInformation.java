
package io.dscope.rosettanet.domain.service.service.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReimbursementInformation
    extends JAXBElement<ReimbursementInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "ReimbursementInformation");

    public ReimbursementInformation(ReimbursementInformationType value) {
        super(NAME, ((Class) ReimbursementInformationType.class), null, value);
    }

    public ReimbursementInformation() {
        super(NAME, ((Class) ReimbursementInformationType.class), null, null);
    }

}
