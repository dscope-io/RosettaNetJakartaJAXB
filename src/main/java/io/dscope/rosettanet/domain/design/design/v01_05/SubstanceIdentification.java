
package io.dscope.rosettanet.domain.design.design.v01_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SubstanceIdentification
    extends JAXBElement<SubstanceIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.05", "SubstanceIdentification");

    public SubstanceIdentification(SubstanceIdentificationType value) {
        super(NAME, ((Class) SubstanceIdentificationType.class), null, value);
    }

    public SubstanceIdentification() {
        super(NAME, ((Class) SubstanceIdentificationType.class), null, null);
    }

}
