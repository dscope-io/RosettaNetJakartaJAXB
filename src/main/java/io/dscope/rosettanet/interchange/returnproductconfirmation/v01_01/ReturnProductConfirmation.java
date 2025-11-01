
package io.dscope.rosettanet.interchange.returnproductconfirmation.v01_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ReturnProductConfirmation", namespace = "urn:rosettanet:specification:interchange:ReturnProductConfirmation:xsd:schema:01.01")
public class ReturnProductConfirmation
    extends JAXBElement<ReturnProductConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ReturnProductConfirmation:xsd:schema:01.01", "ReturnProductConfirmation");

    public ReturnProductConfirmation(ReturnProductConfirmationType value) {
        super(NAME, ((Class) ReturnProductConfirmationType.class), null, value);
    }

    public ReturnProductConfirmation() {
        super(NAME, ((Class) ReturnProductConfirmationType.class), null, null);
    }

}
