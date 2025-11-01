
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignProjectDescription
    extends JAXBElement<DesignProjectDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "DesignProjectDescription");

    public DesignProjectDescription(DesignProjectDescriptionType value) {
        super(NAME, ((Class) DesignProjectDescriptionType.class), null, value);
    }

    public DesignProjectDescription() {
        super(NAME, ((Class) DesignProjectDescriptionType.class), null, null);
    }

}
