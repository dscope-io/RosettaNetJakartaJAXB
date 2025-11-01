
package io.dscope.rosettanet.universal.dates.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DateTimePeriod
    extends JAXBElement<DateTimePeriodType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Dates:xsd:schema:01.02", "DateTimePeriod");

    public DateTimePeriod(DateTimePeriodType value) {
        super(NAME, ((Class) DateTimePeriodType.class), null, value);
    }

    public DateTimePeriod() {
        super(NAME, ((Class) DateTimePeriodType.class), null, null);
    }

}
