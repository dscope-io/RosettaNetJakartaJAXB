
package io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignWinStatusReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03", "DesignWinStatusReasonA");

    public DesignWinStatusReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public DesignWinStatusReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
