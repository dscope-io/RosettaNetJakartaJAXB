
package io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RepairTypeType }
     * 
     */
    public RepairTypeType createRepairTypeType() {
        return new RepairTypeType();
    }

    /**
     * Create an instance of {@link RepairTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RepairTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02", name = "RepairTypeA")
    public RepairTypeA createRepairTypeA(Object value) {
        return new RepairTypeA(value);
    }

    /**
     * Create an instance of {@link RepairType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RepairType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02", name = "RepairType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02", substitutionHeadName = "RepairTypeA")
    public RepairType createRepairType(RepairTypeType value) {
        return new RepairType(value);
    }

}
