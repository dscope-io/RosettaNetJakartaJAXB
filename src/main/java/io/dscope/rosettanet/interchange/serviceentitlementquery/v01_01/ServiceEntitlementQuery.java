
package io.dscope.rosettanet.interchange.serviceentitlementquery.v01_01;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ServiceEntitlementQuery", namespace = "urn:rosettanet:specification:interchange:ServiceEntitlementQuery:xsd:schema:01.01")
public class ServiceEntitlementQuery
    extends JAXBElement<ServiceEntitlementQueryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ServiceEntitlementQuery:xsd:schema:01.01", "ServiceEntitlementQuery");

    public ServiceEntitlementQuery(ServiceEntitlementQueryType value) {
        super(NAME, ((Class) ServiceEntitlementQueryType.class), null, value);
    }

    public ServiceEntitlementQuery() {
        super(NAME, ((Class) ServiceEntitlementQueryType.class), null, null);
    }

}
