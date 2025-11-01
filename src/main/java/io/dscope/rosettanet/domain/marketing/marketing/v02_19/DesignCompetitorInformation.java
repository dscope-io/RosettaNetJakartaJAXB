
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignCompetitorInformation
    extends JAXBElement<DesignCompetitorInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "DesignCompetitorInformation");

    public DesignCompetitorInformation(DesignCompetitorInformationType value) {
        super(NAME, ((Class) DesignCompetitorInformationType.class), null, value);
    }

    public DesignCompetitorInformation() {
        super(NAME, ((Class) DesignCompetitorInformationType.class), null, null);
    }

}
