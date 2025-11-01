
package io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CustomerAuthorizationCode
    extends JAXBElement<CustomerAuthorizationCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.02", "CustomerAuthorizationCode");

    public CustomerAuthorizationCode(CustomerAuthorizationCodeType value) {
        super(NAME, ((Class) CustomerAuthorizationCodeType.class), null, value);
    }

    public CustomerAuthorizationCode() {
        super(NAME, ((Class) CustomerAuthorizationCodeType.class), null, null);
    }

}
