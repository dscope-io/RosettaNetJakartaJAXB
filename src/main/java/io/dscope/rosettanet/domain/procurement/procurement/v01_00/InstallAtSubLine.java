
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class InstallAtSubLine
    extends JAXBElement<InstallAtSubLineType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "InstallAtSubLine");

    public InstallAtSubLine(InstallAtSubLineType value) {
        super(NAME, ((Class) InstallAtSubLineType.class), null, value);
    }

    public InstallAtSubLine() {
        super(NAME, ((Class) InstallAtSubLineType.class), null, null);
    }

}
