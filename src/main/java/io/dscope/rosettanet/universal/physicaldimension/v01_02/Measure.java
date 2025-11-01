
package io.dscope.rosettanet.universal.physicaldimension.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Measure
    extends JAXBElement<MeasureType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.02", "Measure");

    public Measure(MeasureType value) {
        super(NAME, ((Class) MeasureType.class), null, value);
    }

    public Measure() {
        super(NAME, ((Class) MeasureType.class), null, null);
    }

}
