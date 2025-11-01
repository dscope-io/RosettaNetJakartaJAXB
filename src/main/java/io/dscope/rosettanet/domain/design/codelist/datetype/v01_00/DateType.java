
package io.dscope.rosettanet.domain.design.codelist.datetype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateType
    extends JAXBElement<DateTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:DateType:xsd:codelist:01.00", "DateType");

    public DateType(DateTypeType value) {
        super(NAME, ((Class) DateTypeType.class), null, value);
    }

    public DateType() {
        super(NAME, ((Class) DateTypeType.class), null, null);
    }

}
