
package io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MeasurementTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", "MeasurementTypeA");

    public MeasurementTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public MeasurementTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
