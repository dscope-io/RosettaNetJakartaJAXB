
package io.dscope.rosettanet.domain.design.codelist.level.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.codelist.level.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.codelist.level.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LevelType }
     * 
     */
    public LevelType createLevelType() {
        return new LevelType();
    }

    /**
     * Create an instance of {@link LevelA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LevelA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01", name = "LevelA")
    public LevelA createLevelA(Object value) {
        return new LevelA(value);
    }

    /**
     * Create an instance of {@link Level }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Level }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01", name = "Level", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01", substitutionHeadName = "LevelA")
    public Level createLevel(LevelType value) {
        return new Level(value);
    }

}
