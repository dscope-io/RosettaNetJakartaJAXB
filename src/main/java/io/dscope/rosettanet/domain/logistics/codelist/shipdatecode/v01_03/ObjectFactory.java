
package io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipDateCodeType }
     * 
     */
    public ShipDateCodeType createShipDateCodeType() {
        return new ShipDateCodeType();
    }

    /**
     * Create an instance of {@link ShipDateCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipDateCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:01.03", name = "ShipDateCodeA")
    public ShipDateCodeA createShipDateCodeA(Object value) {
        return new ShipDateCodeA(value);
    }

    /**
     * Create an instance of {@link ShipDateCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipDateCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:01.03", name = "ShipDateCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:01.03", substitutionHeadName = "ShipDateCodeA")
    public ShipDateCode createShipDateCode(ShipDateCodeType value) {
        return new ShipDateCode(value);
    }

}
