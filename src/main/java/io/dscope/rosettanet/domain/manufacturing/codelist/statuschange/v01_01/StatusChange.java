
package io.dscope.rosettanet.domain.manufacturing.codelist.statuschange.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StatusChange
    extends JAXBElement<StatusChangeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.01", "StatusChange");

    public StatusChange(StatusChangeType value) {
        super(NAME, ((Class) StatusChangeType.class), null, value);
    }

    public StatusChange() {
        super(NAME, ((Class) StatusChangeType.class), null, null);
    }

}
