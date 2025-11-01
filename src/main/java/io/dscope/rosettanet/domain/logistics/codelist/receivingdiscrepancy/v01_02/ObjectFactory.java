
package io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceivingDiscrepancyType }
     * 
     */
    public ReceivingDiscrepancyType createReceivingDiscrepancyType() {
        return new ReceivingDiscrepancyType();
    }

    /**
     * Create an instance of {@link ReceivingDiscrepancyA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReceivingDiscrepancyA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.02", name = "ReceivingDiscrepancyA")
    public ReceivingDiscrepancyA createReceivingDiscrepancyA(Object value) {
        return new ReceivingDiscrepancyA(value);
    }

    /**
     * Create an instance of {@link ReceivingDiscrepancy }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReceivingDiscrepancy }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.02", name = "ReceivingDiscrepancy", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.02", substitutionHeadName = "ReceivingDiscrepancyA")
    public ReceivingDiscrepancy createReceivingDiscrepancy(ReceivingDiscrepancyType value) {
        return new ReceivingDiscrepancy(value);
    }

}
