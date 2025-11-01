
package io.dscope.rosettanet.domain.logistics.logistics.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LabelServiceContent
    extends JAXBElement<LabelServiceContentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.20", "LabelServiceContent");

    public LabelServiceContent(LabelServiceContentType value) {
        super(NAME, ((Class) LabelServiceContentType.class), null, value);
    }

    public LabelServiceContent() {
        super(NAME, ((Class) LabelServiceContentType.class), null, null);
    }

}
