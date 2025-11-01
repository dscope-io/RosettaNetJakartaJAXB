
package io.dscope.rosettanet.domain.procurement.codelist.interval.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Interval
    extends JAXBElement<IntervalType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:Interval:xsd:codelist:01.02", "Interval");

    public Interval(IntervalType value) {
        super(NAME, ((Class) IntervalType.class), null, value);
    }

    public Interval() {
        super(NAME, ((Class) IntervalType.class), null, null);
    }

}
