
package io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LotDiscrepancyReasonType }
     * 
     */
    public LotDiscrepancyReasonType createLotDiscrepancyReasonType() {
        return new LotDiscrepancyReasonType();
    }

    /**
     * Create an instance of {@link LotDiscrepancyReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotDiscrepancyReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.02", name = "LotDiscrepancyReasonA")
    public LotDiscrepancyReasonA createLotDiscrepancyReasonA(Object value) {
        return new LotDiscrepancyReasonA(value);
    }

    /**
     * Create an instance of {@link LotDiscrepancyReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotDiscrepancyReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.02", name = "LotDiscrepancyReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.02", substitutionHeadName = "LotDiscrepancyReasonA")
    public LotDiscrepancyReason createLotDiscrepancyReason(LotDiscrepancyReasonType value) {
        return new LotDiscrepancyReason(value);
    }

}
