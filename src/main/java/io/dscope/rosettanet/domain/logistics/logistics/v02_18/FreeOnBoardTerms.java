
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreeOnBoardTerms
    extends JAXBElement<FreeOnBoardTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", "FreeOnBoardTerms");

    public FreeOnBoardTerms(FreeOnBoardTermsType value) {
        super(NAME, ((Class) FreeOnBoardTermsType.class), null, value);
    }

    public FreeOnBoardTerms() {
        super(NAME, ((Class) FreeOnBoardTermsType.class), null, null);
    }

}
