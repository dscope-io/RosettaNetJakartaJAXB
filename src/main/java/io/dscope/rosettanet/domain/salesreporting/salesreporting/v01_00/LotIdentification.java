
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LotIdentification
    extends JAXBElement<LotIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", "LotIdentification");

    public LotIdentification(LotIdentificationType value) {
        super(NAME, ((Class) LotIdentificationType.class), null, value);
    }

    public LotIdentification() {
        super(NAME, ((Class) LotIdentificationType.class), null, null);
    }

}
