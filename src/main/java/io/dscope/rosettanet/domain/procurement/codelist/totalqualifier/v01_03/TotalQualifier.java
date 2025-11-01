
package io.dscope.rosettanet.domain.procurement.codelist.totalqualifier.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TotalQualifier
    extends JAXBElement<TotalQualifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:TotalQualifier:xsd:codelist:01.03", "TotalQualifier");

    public TotalQualifier(TotalQualifierType value) {
        super(NAME, ((Class) TotalQualifierType.class), null, value);
    }

    public TotalQualifier() {
        super(NAME, ((Class) TotalQualifierType.class), null, null);
    }

}
