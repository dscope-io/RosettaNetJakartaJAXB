
package io.dscope.rosettanet.universal.locations.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.locations.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.locations.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlternativeIdentifierType }
     * 
     */
    public AlternativeIdentifierType createAlternativeIdentifierType() {
        return new AlternativeIdentifierType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link PhysicalAddressType }
     * 
     */
    public PhysicalAddressType createPhysicalAddressType() {
        return new PhysicalAddressType();
    }

    /**
     * Create an instance of {@link AlternativeIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AlternativeIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.03", name = "AlternativeIdentifier")
    public AlternativeIdentifier createAlternativeIdentifier(AlternativeIdentifierType value) {
        return new AlternativeIdentifier(value);
    }

    /**
     * Create an instance of {@link Location }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Location }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.03", name = "Location")
    public Location createLocation(LocationType value) {
        return new Location(value);
    }

    /**
     * Create an instance of {@link PhysicalAddress }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PhysicalAddress }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.03", name = "PhysicalAddress")
    public PhysicalAddress createPhysicalAddress(PhysicalAddressType value) {
        return new PhysicalAddress(value);
    }

}
