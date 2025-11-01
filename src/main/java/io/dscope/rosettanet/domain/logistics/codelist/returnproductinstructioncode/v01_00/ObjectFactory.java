
package io.dscope.rosettanet.domain.logistics.codelist.returnproductinstructioncode.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.returnproductinstructioncode.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.returnproductinstructioncode.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnProductInstructionCodeType }
     * 
     */
    public ReturnProductInstructionCodeType createReturnProductInstructionCodeType() {
        return new ReturnProductInstructionCodeType();
    }

    /**
     * Create an instance of {@link ReturnProductInstructionCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReturnProductInstructionCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ReturnProductInstructionCode:xsd:codelist:01.00", name = "ReturnProductInstructionCodeA")
    public ReturnProductInstructionCodeA createReturnProductInstructionCodeA(Object value) {
        return new ReturnProductInstructionCodeA(value);
    }

    /**
     * Create an instance of {@link ReturnProductInstructionCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReturnProductInstructionCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ReturnProductInstructionCode:xsd:codelist:01.00", name = "ReturnProductInstructionCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ReturnProductInstructionCode:xsd:codelist:01.00", substitutionHeadName = "ReturnProductInstructionCodeA")
    public ReturnProductInstructionCode createReturnProductInstructionCode(ReturnProductInstructionCodeType value) {
        return new ReturnProductInstructionCode(value);
    }

}
