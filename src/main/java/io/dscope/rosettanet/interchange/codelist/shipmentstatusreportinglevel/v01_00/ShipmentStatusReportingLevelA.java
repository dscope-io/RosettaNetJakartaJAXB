
package io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentStatusReportingLevelA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.00", "ShipmentStatusReportingLevelA");

    public ShipmentStatusReportingLevelA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ShipmentStatusReportingLevelA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
