
package io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnLabelCodeType }
     * 
     */
    public ReturnLabelCodeType createReturnLabelCodeType() {
        return new ReturnLabelCodeType();
    }

    /**
     * Create an instance of {@link ReturnLabelCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReturnLabelCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:1.0", name = "ReturnLabelCodeA")
    public ReturnLabelCodeA createReturnLabelCodeA(Object value) {
        return new ReturnLabelCodeA(value);
    }

    /**
     * Create an instance of {@link ReturnLabelCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReturnLabelCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:1.0", name = "ReturnLabelCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:1.0", substitutionHeadName = "ReturnLabelCodeA")
    public ReturnLabelCode createReturnLabelCode(ReturnLabelCodeType value) {
        return new ReturnLabelCode(value);
    }

}
