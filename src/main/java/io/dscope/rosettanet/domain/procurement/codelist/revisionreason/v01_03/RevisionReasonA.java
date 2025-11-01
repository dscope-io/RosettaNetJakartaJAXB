
package io.dscope.rosettanet.domain.procurement.codelist.revisionreason.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RevisionReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:RevisionReason:xsd:codelist:01.03", "RevisionReasonA");

    public RevisionReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public RevisionReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
