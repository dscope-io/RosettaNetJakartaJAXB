
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FamilyIdentification
    extends JAXBElement<FamilyIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", "FamilyIdentification");

    public FamilyIdentification(FamilyIdentificationType value) {
        super(NAME, ((Class) FamilyIdentificationType.class), null, value);
    }

    public FamilyIdentification() {
        super(NAME, ((Class) FamilyIdentificationType.class), null, null);
    }

}
