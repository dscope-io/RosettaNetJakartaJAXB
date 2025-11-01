
package io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InventoryOwnershipType }
     * 
     */
    public InventoryOwnershipType createInventoryOwnershipType() {
        return new InventoryOwnershipType();
    }

    /**
     * Create an instance of {@link InventoryOwnershipA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InventoryOwnershipA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.00", name = "InventoryOwnershipA")
    public InventoryOwnershipA createInventoryOwnershipA(Object value) {
        return new InventoryOwnershipA(value);
    }

    /**
     * Create an instance of {@link InventoryOwnership }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InventoryOwnership }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.00", name = "InventoryOwnership", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.00", substitutionHeadName = "InventoryOwnershipA")
    public InventoryOwnership createInventoryOwnership(InventoryOwnershipType value) {
        return new InventoryOwnership(value);
    }

}
