
package io.dscope.rosettanet.interchange.returnproductconfirmation.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ReturnProductConfirmation", namespace = "urn:rosettanet:specification:interchange:ReturnProductConfirmationNotification:xsd:schema:01.00")
public class ReturnProductConfirmation
    extends JAXBElement<ReturnProductConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ReturnProductConfirmationNotification:xsd:schema:01.00", "ReturnProductConfirmation");

    public ReturnProductConfirmation(ReturnProductConfirmationType value) {
        super(NAME, ((Class) ReturnProductConfirmationType.class), null, value);
    }

    public ReturnProductConfirmation() {
        super(NAME, ((Class) ReturnProductConfirmationType.class), null, null);
    }

}
