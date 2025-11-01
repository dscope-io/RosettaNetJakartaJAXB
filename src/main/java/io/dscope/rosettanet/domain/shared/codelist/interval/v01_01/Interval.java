
package io.dscope.rosettanet.domain.shared.codelist.interval.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Interval
    extends JAXBElement<IntervalType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01", "Interval");

    public Interval(IntervalType value) {
        super(NAME, ((Class) IntervalType.class), null, value);
    }

    public Interval() {
        super(NAME, ((Class) IntervalType.class), null, null);
    }

}
