
package io.dscope.rosettanet.domain.design.design.v02_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LifeCycleStatus
    extends JAXBElement<LifeCycleStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.05", "LifeCycleStatus");

    public LifeCycleStatus(LifeCycleStatusType value) {
        super(NAME, ((Class) LifeCycleStatusType.class), null, value);
    }

    public LifeCycleStatus() {
        super(NAME, ((Class) LifeCycleStatusType.class), null, null);
    }

}
