
package io.dscope.rosettanet.domain.procurement.codelist.totalqualifier.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TotalQualifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TotalQualifier:xsd:codelist:01.02", "TotalQualifierA");

    public TotalQualifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TotalQualifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
