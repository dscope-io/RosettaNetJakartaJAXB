
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DayOfMonth
    extends JAXBElement<BigInteger>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", "DayOfMonth");

    public DayOfMonth(BigInteger value) {
        super(NAME, ((Class) BigInteger.class), null, value);
    }

    public DayOfMonth() {
        super(NAME, ((Class) BigInteger.class), null, null);
    }

}
