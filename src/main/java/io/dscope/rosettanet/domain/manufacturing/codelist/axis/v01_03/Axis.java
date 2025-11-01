
package io.dscope.rosettanet.domain.manufacturing.codelist.axis.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Axis
    extends JAXBElement<AxisType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Axis:xsd:codelist:01.03", "Axis");

    public Axis(AxisType value) {
        super(NAME, ((Class) AxisType.class), null, value);
    }

    public Axis() {
        super(NAME, ((Class) AxisType.class), null, null);
    }

}
