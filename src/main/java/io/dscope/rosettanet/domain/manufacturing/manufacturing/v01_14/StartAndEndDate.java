
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class StartAndEndDate
    extends JAXBElement<StartAndEndDateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", "StartAndEndDate");

    public StartAndEndDate(StartAndEndDateType value) {
        super(NAME, ((Class) StartAndEndDateType.class), null, value);
    }

    public StartAndEndDate() {
        super(NAME, ((Class) StartAndEndDateType.class), null, null);
    }

}
