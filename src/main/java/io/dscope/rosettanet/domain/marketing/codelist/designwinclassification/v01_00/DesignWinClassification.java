
package io.dscope.rosettanet.domain.marketing.codelist.designwinclassification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignWinClassification
    extends JAXBElement<DesignWinClassificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:DesignWinClassification:xsd:codelist:01.00", "DesignWinClassification");

    public DesignWinClassification(DesignWinClassificationType value) {
        super(NAME, ((Class) DesignWinClassificationType.class), null, value);
    }

    public DesignWinClassification() {
        super(NAME, ((Class) DesignWinClassificationType.class), null, null);
    }

}
