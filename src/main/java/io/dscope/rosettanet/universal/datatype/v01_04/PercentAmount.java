
package io.dscope.rosettanet.universal.datatype.v01_04;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PercentAmount
    extends JAXBElement<BigDecimal>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", "PercentAmount");

    public PercentAmount(BigDecimal value) {
        super(NAME, ((Class) BigDecimal.class), null, value);
    }

    public PercentAmount() {
        super(NAME, ((Class) BigDecimal.class), null, null);
    }

}
