
package io.dscope.rosettanet.domain.procurement.codelist.businessaction.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BusinessActionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:BusinessAction:xsd:codelist:01.02", "BusinessActionA");

    public BusinessActionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public BusinessActionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
