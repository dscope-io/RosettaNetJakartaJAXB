
package io.dscope.rosettanet.domain.shared.codelist.interval.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IntervalA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.00", "IntervalA");

    public IntervalA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public IntervalA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
