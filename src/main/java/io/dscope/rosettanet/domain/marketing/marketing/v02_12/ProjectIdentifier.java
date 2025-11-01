
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProjectIdentifier
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "ProjectIdentifier");

    public ProjectIdentifier(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public ProjectIdentifier() {
        super(NAME, ((Class) String.class), null, null);
    }

}
