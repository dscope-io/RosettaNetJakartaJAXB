
package io.dscope.rosettanet.universal.codelist.countrysubdivision.v01_01;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CountrySubdivision
    extends JAXBElement<CountrySubdivisionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:01.01", "CountrySubdivision");

    public CountrySubdivision(CountrySubdivisionType value) {
        super(NAME, ((Class) CountrySubdivisionType.class), null, value);
    }

    public CountrySubdivision() {
        super(NAME, ((Class) CountrySubdivisionType.class), null, null);
    }

}
