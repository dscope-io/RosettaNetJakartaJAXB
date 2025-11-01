
package io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomerAuthorizationCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.02", "CustomerAuthorizationCodeA");

    public CustomerAuthorizationCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public CustomerAuthorizationCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
