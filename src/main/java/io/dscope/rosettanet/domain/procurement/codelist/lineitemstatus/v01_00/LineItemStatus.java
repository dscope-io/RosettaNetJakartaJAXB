
package io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LineItemStatus
    extends JAXBElement<LineItemStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:1.0", "LineItemStatus");

    public LineItemStatus(LineItemStatusType value) {
        super(NAME, ((Class) LineItemStatusType.class), null, value);
    }

    public LineItemStatus() {
        super(NAME, ((Class) LineItemStatusType.class), null, null);
    }

}
