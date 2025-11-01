
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class DayOfMonth
    extends JAXBElement<BigInteger>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", "DayOfMonth");

    public DayOfMonth(BigInteger value) {
        super(NAME, ((Class) BigInteger.class), null, value);
    }

    public DayOfMonth() {
        super(NAME, ((Class) BigInteger.class), null, null);
    }

}
