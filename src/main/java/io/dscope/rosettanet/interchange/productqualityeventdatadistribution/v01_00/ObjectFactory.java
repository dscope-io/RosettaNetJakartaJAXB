
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductQualityEventDataDistributionType }
     * 
     */
    public ProductQualityEventDataDistributionType createProductQualityEventDataDistributionType() {
        return new ProductQualityEventDataDistributionType();
    }

    /**
     * Create an instance of {@link ComponentRepairDataType }
     * 
     */
    public ComponentRepairDataType createComponentRepairDataType() {
        return new ComponentRepairDataType();
    }

    /**
     * Create an instance of {@link IncidentInformationType }
     * 
     */
    public IncidentInformationType createIncidentInformationType() {
        return new IncidentInformationType();
    }

    /**
     * Create an instance of {@link LocationInformationType }
     * 
     */
    public LocationInformationType createLocationInformationType() {
        return new LocationInformationType();
    }

    /**
     * Create an instance of {@link ProductQualityEventDataType }
     * 
     */
    public ProductQualityEventDataType createProductQualityEventDataType() {
        return new ProductQualityEventDataType();
    }

    /**
     * Create an instance of {@link QualityIncidentInformationType }
     * 
     */
    public QualityIncidentInformationType createQualityIncidentInformationType() {
        return new QualityIncidentInformationType();
    }

    /**
     * Create an instance of {@link ReceivedProductReferenceType }
     * 
     */
    public ReceivedProductReferenceType createReceivedProductReferenceType() {
        return new ReceivedProductReferenceType();
    }

    /**
     * Create an instance of {@link RepairAndFailureDataType }
     * 
     */
    public RepairAndFailureDataType createRepairAndFailureDataType() {
        return new RepairAndFailureDataType();
    }

    /**
     * Create an instance of {@link TestInformationType }
     * 
     */
    public TestInformationType createTestInformationType() {
        return new TestInformationType();
    }

    /**
     * Create an instance of {@link ProductQualityEventDataDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductQualityEventDataDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00", name = "ProductQualityEventDataDistribution")
    public ProductQualityEventDataDistribution createProductQualityEventDataDistribution(ProductQualityEventDataDistributionType value) {
        return new ProductQualityEventDataDistribution(value);
    }

}
