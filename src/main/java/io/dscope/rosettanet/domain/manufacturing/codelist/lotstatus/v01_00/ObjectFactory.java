
package io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_00 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LotStatusType }
     * 
     */
    public LotStatusType createLotStatusType() {
        return new LotStatusType();
    }

    /**
     * Create an instance of {@link LotStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:1.0", name = "LotStatusA")
    public LotStatusA createLotStatusA(Object value) {
        return new LotStatusA(value);
    }

    /**
     * Create an instance of {@link LotStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:1.0", name = "LotStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:1.0", substitutionHeadName = "LotStatusA")
    public LotStatus createLotStatus(LotStatusType value) {
        return new LotStatus(value);
    }

}
