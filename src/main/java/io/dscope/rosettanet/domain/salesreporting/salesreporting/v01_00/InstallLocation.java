
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InstallLocation
    extends JAXBElement<InstallLocationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", "InstallLocation");

    public InstallLocation(InstallLocationType value) {
        super(NAME, ((Class) InstallLocationType.class), null, value);
    }

    public InstallLocation() {
        super(NAME, ((Class) InstallLocationType.class), null, null);
    }

}
