
package io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MeasurementType
    extends JAXBElement<MeasurementTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", "MeasurementType");

    public MeasurementType(MeasurementTypeType value) {
        super(NAME, ((Class) MeasurementTypeType.class), null, value);
    }

    public MeasurementType() {
        super(NAME, ((Class) MeasurementTypeType.class), null, null);
    }

}
