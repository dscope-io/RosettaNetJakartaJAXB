
package io.dscope.rosettanet.domain.logistics.codelist.urgencycode.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class UrgencyCode
    extends JAXBElement<UrgencyCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:UrgencyCode:xsd:codelist:01.00", "UrgencyCode");

    public UrgencyCode(UrgencyCodeType value) {
        super(NAME, ((Class) UrgencyCodeType.class), null, value);
    }

    public UrgencyCode() {
        super(NAME, ((Class) UrgencyCodeType.class), null, null);
    }

}
