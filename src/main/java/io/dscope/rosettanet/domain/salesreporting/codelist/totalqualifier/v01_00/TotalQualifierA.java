
package io.dscope.rosettanet.domain.salesreporting.codelist.totalqualifier.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TotalQualifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:TotalQualifier:xsd:codelist:1.0", "TotalQualifierA");

    public TotalQualifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TotalQualifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
