
package io.dscope.rosettanet.domain.service.service.v02_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class ExpiryDate
    extends JAXBElement<XMLGregorianCalendar>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.14", "ExpiryDate");

    public ExpiryDate(XMLGregorianCalendar value) {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, value);
    }

    public ExpiryDate() {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, null);
    }

}
