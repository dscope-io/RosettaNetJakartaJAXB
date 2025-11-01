
package io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReturnLabelCode
    extends JAXBElement<ReturnLabelCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.02", "ReturnLabelCode");

    public ReturnLabelCode(ReturnLabelCodeType value) {
        super(NAME, ((Class) ReturnLabelCodeType.class), null, value);
    }

    public ReturnLabelCode() {
        super(NAME, ((Class) ReturnLabelCodeType.class), null, null);
    }

}
