
package io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CatalogType
    extends JAXBElement<CatalogTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.01", "CatalogType");

    public CatalogType(CatalogTypeType value) {
        super(NAME, ((Class) CatalogTypeType.class), null, value);
    }

    public CatalogType() {
        super(NAME, ((Class) CatalogTypeType.class), null, null);
    }

}
