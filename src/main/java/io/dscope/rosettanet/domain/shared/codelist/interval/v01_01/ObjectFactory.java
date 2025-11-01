
package io.dscope.rosettanet.domain.shared.codelist.interval.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.interval.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.interval.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntervalType }
     * 
     */
    public IntervalType createIntervalType() {
        return new IntervalType();
    }

    /**
     * Create an instance of {@link IntervalA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IntervalA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01", name = "IntervalA")
    public IntervalA createIntervalA(Object value) {
        return new IntervalA(value);
    }

    /**
     * Create an instance of {@link Interval }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Interval }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01", name = "Interval", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01", substitutionHeadName = "IntervalA")
    public Interval createInterval(IntervalType value) {
        return new Interval(value);
    }

}
