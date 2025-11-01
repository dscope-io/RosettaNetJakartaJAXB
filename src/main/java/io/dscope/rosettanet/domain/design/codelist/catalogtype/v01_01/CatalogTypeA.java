
package io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CatalogTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.01", "CatalogTypeA");

    public CatalogTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CatalogTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
