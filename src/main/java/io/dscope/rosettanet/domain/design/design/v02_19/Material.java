
package io.dscope.rosettanet.domain.design.design.v02_19;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Material
    extends JAXBElement<MaterialType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.19", "Material");

    public Material(MaterialType value) {
        super(NAME, ((Class) MaterialType.class), null, value);
    }

    public Material() {
        super(NAME, ((Class) MaterialType.class), null, null);
    }

}
