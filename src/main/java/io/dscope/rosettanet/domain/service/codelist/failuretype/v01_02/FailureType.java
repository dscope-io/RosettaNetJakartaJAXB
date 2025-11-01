
package io.dscope.rosettanet.domain.service.codelist.failuretype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FailureType
    extends JAXBElement<FailureTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:FailureType:xsd:codelist:01.02", "FailureType");

    public FailureType(FailureTypeType value) {
        super(NAME, ((Class) FailureTypeType.class), null, value);
    }

    public FailureType() {
        super(NAME, ((Class) FailureTypeType.class), null, null);
    }

}
