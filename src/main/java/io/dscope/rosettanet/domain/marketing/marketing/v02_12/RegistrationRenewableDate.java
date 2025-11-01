
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

public class RegistrationRenewableDate
    extends JAXBElement<XMLGregorianCalendar>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "RegistrationRenewableDate");

    public RegistrationRenewableDate(XMLGregorianCalendar value) {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, value);
    }

    public RegistrationRenewableDate() {
        super(NAME, ((Class) XMLGregorianCalendar.class), null, null);
    }

}
