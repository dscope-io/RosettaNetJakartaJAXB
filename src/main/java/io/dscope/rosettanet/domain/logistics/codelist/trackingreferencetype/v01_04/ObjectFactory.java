
package io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_04;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackingReferenceTypeType }
     * 
     */
    public TrackingReferenceTypeType createTrackingReferenceTypeType() {
        return new TrackingReferenceTypeType();
    }

    /**
     * Create an instance of {@link TrackingReferenceTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TrackingReferenceTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.04", name = "TrackingReferenceTypeA")
    public TrackingReferenceTypeA createTrackingReferenceTypeA(Object value) {
        return new TrackingReferenceTypeA(value);
    }

    /**
     * Create an instance of {@link TrackingReferenceType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TrackingReferenceType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.04", name = "TrackingReferenceType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.04", substitutionHeadName = "TrackingReferenceTypeA")
    public TrackingReferenceType createTrackingReferenceType(TrackingReferenceTypeType value) {
        return new TrackingReferenceType(value);
    }

}
