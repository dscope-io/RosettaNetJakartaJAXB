
package io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WaferBackSideFinishType }
     * 
     */
    public WaferBackSideFinishType createWaferBackSideFinishType() {
        return new WaferBackSideFinishType();
    }

    /**
     * Create an instance of {@link WaferBackSideFinishA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WaferBackSideFinishA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.02", name = "WaferBackSideFinishA")
    public WaferBackSideFinishA createWaferBackSideFinishA(Object value) {
        return new WaferBackSideFinishA(value);
    }

    /**
     * Create an instance of {@link WaferBackSideFinish }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WaferBackSideFinish }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.02", name = "WaferBackSideFinish", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.02", substitutionHeadName = "WaferBackSideFinishA")
    public WaferBackSideFinish createWaferBackSideFinish(WaferBackSideFinishType value) {
        return new WaferBackSideFinish(value);
    }

}
