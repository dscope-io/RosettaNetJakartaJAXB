
package io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupplierPartStatusType }
     * 
     */
    public SupplierPartStatusType createSupplierPartStatusType() {
        return new SupplierPartStatusType();
    }

    /**
     * Create an instance of {@link SupplierPartStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SupplierPartStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:1.0", name = "SupplierPartStatusA")
    public SupplierPartStatusA createSupplierPartStatusA(Object value) {
        return new SupplierPartStatusA(value);
    }

    /**
     * Create an instance of {@link SupplierPartStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SupplierPartStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:1.0", name = "SupplierPartStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:1.0", substitutionHeadName = "SupplierPartStatusA")
    public SupplierPartStatus createSupplierPartStatus(SupplierPartStatusType value) {
        return new SupplierPartStatus(value);
    }

}
