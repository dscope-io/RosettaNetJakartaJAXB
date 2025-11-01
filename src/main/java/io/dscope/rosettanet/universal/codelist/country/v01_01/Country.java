
package io.dscope.rosettanet.universal.codelist.country.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Country
    extends JAXBElement<CountryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Country:xsd:codelist:01.01", "Country");

    public Country(CountryType value) {
        super(NAME, ((Class) CountryType.class), null, value);
    }

    public Country() {
        super(NAME, ((Class) CountryType.class), null, null);
    }

}
