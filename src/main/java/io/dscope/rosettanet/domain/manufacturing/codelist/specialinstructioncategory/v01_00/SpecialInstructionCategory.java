
package io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialInstructionCategory
    extends JAXBElement<SpecialInstructionCategoryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:1.0", "SpecialInstructionCategory");

    public SpecialInstructionCategory(SpecialInstructionCategoryType value) {
        super(NAME, ((Class) SpecialInstructionCategoryType.class), null, value);
    }

    public SpecialInstructionCategory() {
        super(NAME, ((Class) SpecialInstructionCategoryType.class), null, null);
    }

}
