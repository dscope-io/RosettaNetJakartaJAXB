
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "MaterialReleaseNotification", namespace = "urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00")
public class MaterialReleaseNotification
    extends JAXBElement<MaterialReleaseNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00", "MaterialReleaseNotification");

    public MaterialReleaseNotification(MaterialReleaseNotificationType value) {
        super(NAME, ((Class) MaterialReleaseNotificationType.class), null, value);
    }

    public MaterialReleaseNotification() {
        super(NAME, ((Class) MaterialReleaseNotificationType.class), null, null);
    }

}
