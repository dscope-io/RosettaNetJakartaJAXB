
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarketingInstruction
    extends JAXBElement<MarketingInstructionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "MarketingInstruction");

    public MarketingInstruction(MarketingInstructionType value) {
        super(NAME, ((Class) MarketingInstructionType.class), null, value);
    }

    public MarketingInstruction() {
        super(NAME, ((Class) MarketingInstructionType.class), null, null);
    }

}
