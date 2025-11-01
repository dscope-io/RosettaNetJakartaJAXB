
package io.dscope.rosettanet.domain.manufacturing.codelist.axis.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AxisA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Axis:xsd:codelist:01.03", "AxisA");

    public AxisA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public AxisA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
