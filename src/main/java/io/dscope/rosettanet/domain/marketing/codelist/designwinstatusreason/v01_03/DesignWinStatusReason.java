
package io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DesignWinStatusReason
    extends JAXBElement<DesignWinStatusReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03", "DesignWinStatusReason");

    public DesignWinStatusReason(DesignWinStatusReasonType value) {
        super(NAME, ((Class) DesignWinStatusReasonType.class), null, value);
    }

    public DesignWinStatusReason() {
        super(NAME, ((Class) DesignWinStatusReasonType.class), null, null);
    }

}
