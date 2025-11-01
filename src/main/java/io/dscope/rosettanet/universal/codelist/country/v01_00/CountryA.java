
package io.dscope.rosettanet.universal.codelist.country.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CountryA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Country:xsd:codelist:1.0", "CountryA");

    public CountryA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CountryA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
