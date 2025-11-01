
package io.dscope.rosettanet.domain.marketing.codelist.designwinclassification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignWinClassificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:DesignWinClassification:xsd:codelist:01.00", "DesignWinClassificationA");

    public DesignWinClassificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DesignWinClassificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
