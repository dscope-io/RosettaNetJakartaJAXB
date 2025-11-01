
package io.dscope.rosettanet.universal.dates.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StartAndEndDateTime
    extends JAXBElement<StartAndEndDateTimeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Dates:xsd:schema:01.02", "StartAndEndDateTime");

    public StartAndEndDateTime(StartAndEndDateTimeType value) {
        super(NAME, ((Class) StartAndEndDateTimeType.class), null, value);
    }

    public StartAndEndDateTime() {
        super(NAME, ((Class) StartAndEndDateTimeType.class), null, null);
    }

}
