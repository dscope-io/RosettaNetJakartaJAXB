
package io.dscope.rosettanet.domain.procurement.codelist.event.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.event.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.event.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link EventA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link EventA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00", name = "EventA")
    public EventA createEventA(Object value) {
        return new EventA(value);
    }

    /**
     * Create an instance of {@link Event }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Event }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00", name = "Event", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00", substitutionHeadName = "EventA")
    public Event createEvent(EventType value) {
        return new Event(value);
    }

}
