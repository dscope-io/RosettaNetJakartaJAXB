
package io.dscope.rosettanet.system.standarddocumentheader.v01_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class BusinessServiceInformation
    extends JAXBElement<BusinessServiceInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.18", "BusinessServiceInformation");

    public BusinessServiceInformation(BusinessServiceInformationType value) {
        super(NAME, ((Class) BusinessServiceInformationType.class), null, value);
    }

    public BusinessServiceInformation() {
        super(NAME, ((Class) BusinessServiceInformationType.class), null, null);
    }

}
