
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignWinStatusReasonCodeExplanation
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", "DesignWinStatusReasonCodeExplanation");

    public DesignWinStatusReasonCodeExplanation(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public DesignWinStatusReasonCodeExplanation() {
        super(NAME, ((Class) String.class), null, null);
    }

}
