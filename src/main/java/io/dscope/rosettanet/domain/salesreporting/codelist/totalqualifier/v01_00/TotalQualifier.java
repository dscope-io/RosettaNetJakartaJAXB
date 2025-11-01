
package io.dscope.rosettanet.domain.salesreporting.codelist.totalqualifier.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TotalQualifier
    extends JAXBElement<TotalQualifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:TotalQualifier:xsd:codelist:1.0", "TotalQualifier");

    public TotalQualifier(TotalQualifierType value) {
        super(NAME, ((Class) TotalQualifierType.class), null, value);
    }

    public TotalQualifier() {
        super(NAME, ((Class) TotalQualifierType.class), null, null);
    }

}
