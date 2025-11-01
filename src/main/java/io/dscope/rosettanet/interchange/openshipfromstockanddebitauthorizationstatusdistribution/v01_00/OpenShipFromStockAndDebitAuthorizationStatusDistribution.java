
package io.dscope.rosettanet.interchange.openshipfromstockanddebitauthorizationstatusdistribution.v01_00;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "OpenShipFromStockAndDebitAuthorizationStatusDistribution", namespace = "urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.00")
public class OpenShipFromStockAndDebitAuthorizationStatusDistribution
    extends JAXBElement<OpenShipFromStockAndDebitAuthorizationStatusDistributionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.00", "OpenShipFromStockAndDebitAuthorizationStatusDistribution");

    public OpenShipFromStockAndDebitAuthorizationStatusDistribution(OpenShipFromStockAndDebitAuthorizationStatusDistributionType value) {
        super(NAME, ((Class) OpenShipFromStockAndDebitAuthorizationStatusDistributionType.class), null, value);
    }

    public OpenShipFromStockAndDebitAuthorizationStatusDistribution() {
        super(NAME, ((Class) OpenShipFromStockAndDebitAuthorizationStatusDistributionType.class), null, null);
    }

}
