
package io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SaleType
    extends JAXBElement<SaleTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.03", "SaleType");

    public SaleType(SaleTypeType value) {
        super(NAME, ((Class) SaleTypeType.class), null, value);
    }

    public SaleType() {
        super(NAME, ((Class) SaleTypeType.class), null, null);
    }

}
