
package io.dscope.rosettanet.universal.codelist.language.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Language
    extends JAXBElement<LanguageType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Language:xsd:codelist:1.0", "Language");

    public Language(LanguageType value) {
        super(NAME, ((Class) LanguageType.class), null, value);
    }

    public Language() {
        super(NAME, ((Class) LanguageType.class), null, null);
    }

}
