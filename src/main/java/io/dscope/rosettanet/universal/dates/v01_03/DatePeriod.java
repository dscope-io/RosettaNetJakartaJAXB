
package io.dscope.rosettanet.universal.dates.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DatePeriod
    extends JAXBElement<DatePeriodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", "DatePeriod");

    public DatePeriod(DatePeriodType value) {
        super(NAME, ((Class) DatePeriodType.class), null, value);
    }

    public DatePeriod() {
        super(NAME, ((Class) DatePeriodType.class), null, null);
    }

}
