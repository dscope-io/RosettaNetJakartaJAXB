
package io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CatalogTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.00", "CatalogTypeA");

    public CatalogTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CatalogTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
