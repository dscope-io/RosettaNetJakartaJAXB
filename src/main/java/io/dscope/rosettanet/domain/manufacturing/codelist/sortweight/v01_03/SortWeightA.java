
package io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SortWeightA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.03", "SortWeightA");

    public SortWeightA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SortWeightA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
