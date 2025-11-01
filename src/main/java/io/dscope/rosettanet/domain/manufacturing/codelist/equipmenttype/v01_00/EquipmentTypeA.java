
package io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class EquipmentTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:1.0", "EquipmentTypeA");

    public EquipmentTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public EquipmentTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
