
package io.dscope.rosettanet.domain.logistics.logistics.v02_21;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class HarmonizedTariffScheduleInformation
    extends JAXBElement<HarmonizedTariffScheduleInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.21", "HarmonizedTariffScheduleInformation");

    public HarmonizedTariffScheduleInformation(HarmonizedTariffScheduleInformationType value) {
        super(NAME, ((Class) HarmonizedTariffScheduleInformationType.class), null, value);
    }

    public HarmonizedTariffScheduleInformation() {
        super(NAME, ((Class) HarmonizedTariffScheduleInformationType.class), null, null);
    }

}
