
package io.dscope.rosettanet.universal.codelist.weighttype.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WeightTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:WeightType:xsd:codelist:01.02", "WeightTypeA");

    public WeightTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public WeightTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
