
package io.dscope.rosettanet.domain.marketing.codelist.geographicregioncode.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.geographicregioncode.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.geographicregioncode.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeographicRegionCodeType }
     * 
     */
    public GeographicRegionCodeType createGeographicRegionCodeType() {
        return new GeographicRegionCodeType();
    }

    /**
     * Create an instance of {@link GeographicRegionCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GeographicRegionCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:GeographicRegionCode:xsd:codelist:01.02", name = "GeographicRegionCodeA")
    public GeographicRegionCodeA createGeographicRegionCodeA(Object value) {
        return new GeographicRegionCodeA(value);
    }

    /**
     * Create an instance of {@link GeographicRegionCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GeographicRegionCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:GeographicRegionCode:xsd:codelist:01.02", name = "GeographicRegionCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:GeographicRegionCode:xsd:codelist:01.02", substitutionHeadName = "GeographicRegionCodeA")
    public GeographicRegionCode createGeographicRegionCode(GeographicRegionCodeType value) {
        return new GeographicRegionCode(value);
    }

}
