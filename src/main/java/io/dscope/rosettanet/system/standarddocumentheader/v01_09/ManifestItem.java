
package io.dscope.rosettanet.system.standarddocumentheader.v01_09;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ManifestItem
    extends JAXBElement<ManifestItemType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09", "ManifestItem");

    public ManifestItem(ManifestItemType value) {
        super(NAME, ((Class) ManifestItemType.class), null, value);
    }

    public ManifestItem() {
        super(NAME, ((Class) ManifestItemType.class), null, null);
    }

}
