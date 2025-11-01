
package io.dscope.rosettanet.domain.procurement.codelist.interval.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IntervalA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Interval:xsd:codelist:1.0", "IntervalA");

    public IntervalA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public IntervalA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
