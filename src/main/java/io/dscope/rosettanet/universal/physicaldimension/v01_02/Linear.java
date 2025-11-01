
package io.dscope.rosettanet.universal.physicaldimension.v01_02;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Linear
    extends JAXBElement<LinearType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.02", "Linear");

    public Linear(LinearType value) {
        super(NAME, ((Class) LinearType.class), null, value);
    }

    public Linear() {
        super(NAME, ((Class) LinearType.class), null, null);
    }

}
