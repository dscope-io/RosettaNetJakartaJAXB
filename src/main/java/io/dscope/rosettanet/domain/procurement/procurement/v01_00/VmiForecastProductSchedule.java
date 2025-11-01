
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class VmiForecastProductSchedule
    extends JAXBElement<VmiForecastProductScheduleType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "VmiForecastProductSchedule");

    public VmiForecastProductSchedule(VmiForecastProductScheduleType value) {
        super(NAME, ((Class) VmiForecastProductScheduleType.class), null, value);
    }

    public VmiForecastProductSchedule() {
        super(NAME, ((Class) VmiForecastProductScheduleType.class), null, null);
    }

}
