
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ExportLicense
    extends JAXBElement<ExportLicenseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", "ExportLicense");

    public ExportLicense(ExportLicenseType value) {
        super(NAME, ((Class) ExportLicenseType.class), null, value);
    }

    public ExportLicense() {
        super(NAME, ((Class) ExportLicenseType.class), null, null);
    }

}
