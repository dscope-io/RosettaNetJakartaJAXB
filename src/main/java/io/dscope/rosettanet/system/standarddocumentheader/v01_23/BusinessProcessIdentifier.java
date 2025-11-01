
package io.dscope.rosettanet.system.standarddocumentheader.v01_23;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BusinessProcessIdentifier
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23", "BusinessProcessIdentifier");

    public BusinessProcessIdentifier(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public BusinessProcessIdentifier() {
        super(NAME, ((Class) String.class), null, null);
    }

}
