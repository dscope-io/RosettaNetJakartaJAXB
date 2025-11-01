
package io.dscope.rosettanet.universal.codelist.language.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LanguageA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Language:xsd:codelist:01.02", "LanguageA");

    public LanguageA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LanguageA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
