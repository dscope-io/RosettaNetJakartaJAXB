
package io.dscope.rosettanet.domain.design.design.v02_17;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DependentCondition
    extends JAXBElement<DependentConditionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.17", "DependentCondition");

    public DependentCondition(DependentConditionType value) {
        super(NAME, ((Class) DependentConditionType.class), null, value);
    }

    public DependentCondition() {
        super(NAME, ((Class) DependentConditionType.class), null, null);
    }

}
