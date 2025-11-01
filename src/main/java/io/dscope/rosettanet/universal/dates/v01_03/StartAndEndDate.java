
package io.dscope.rosettanet.universal.dates.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StartAndEndDate
    extends JAXBElement<StartAndEndDateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", "StartAndEndDate");

    public StartAndEndDate(StartAndEndDateType value) {
        super(NAME, ((Class) StartAndEndDateType.class), null, value);
    }

    public StartAndEndDate() {
        super(NAME, ((Class) StartAndEndDateType.class), null, null);
    }

}
