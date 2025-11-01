
package io.dscope.rosettanet.domain.procurement.codelist.datetype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:DateType:xsd:codelist:01.00", "DateTypeA");

    public DateTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DateTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
