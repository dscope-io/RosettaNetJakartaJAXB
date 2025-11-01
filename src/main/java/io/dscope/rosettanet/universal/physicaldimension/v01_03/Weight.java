
package io.dscope.rosettanet.universal.physicaldimension.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Weight
    extends JAXBElement<WeightType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.03", "Weight");

    public Weight(WeightType value) {
        super(NAME, ((Class) WeightType.class), null, value);
    }

    public Weight() {
        super(NAME, ((Class) WeightType.class), null, null);
    }

}
