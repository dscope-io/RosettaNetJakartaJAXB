
package io.dscope.rosettanet.system.codelist.tpirfiletype.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TPIRFileTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:TPIRFileType:xsd:codelist:01.01", "TPIRFileTypeA");

    public TPIRFileTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TPIRFileTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
