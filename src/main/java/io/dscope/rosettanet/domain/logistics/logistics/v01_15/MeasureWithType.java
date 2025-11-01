
package io.dscope.rosettanet.domain.logistics.logistics.v01_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MeasureWithType
    extends JAXBElement<MeasureWithTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.15", "MeasureWithType");

    public MeasureWithType(MeasureWithTypeType value) {
        super(NAME, ((Class) MeasureWithTypeType.class), null, value);
    }

    public MeasureWithType() {
        super(NAME, ((Class) MeasureWithTypeType.class), null, null);
    }

}
