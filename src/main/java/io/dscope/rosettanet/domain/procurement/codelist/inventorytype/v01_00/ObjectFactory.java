
package io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InventoryTypeType }
     * 
     */
    public InventoryTypeType createInventoryTypeType() {
        return new InventoryTypeType();
    }

    /**
     * Create an instance of {@link InventoryTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InventoryTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:1.0", name = "InventoryTypeA")
    public InventoryTypeA createInventoryTypeA(Object value) {
        return new InventoryTypeA(value);
    }

    /**
     * Create an instance of {@link InventoryType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InventoryType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:1.0", name = "InventoryType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:1.0", substitutionHeadName = "InventoryTypeA")
    public InventoryType createInventoryType(InventoryTypeType value) {
        return new InventoryType(value);
    }

}
