
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorkInProcessDistributionType }
     * 
     */
    public WorkInProcessDistributionType createWorkInProcessDistributionType() {
        return new WorkInProcessDistributionType();
    }

    /**
     * Create an instance of {@link LotType }
     * 
     */
    public LotType createLotType() {
        return new LotType();
    }

    /**
     * Create an instance of {@link LotShipmentType }
     * 
     */
    public LotShipmentType createLotShipmentType() {
        return new LotShipmentType();
    }

    /**
     * Create an instance of {@link ManufacturingLotType }
     * 
     */
    public ManufacturingLotType createManufacturingLotType() {
        return new ManufacturingLotType();
    }

    /**
     * Create an instance of {@link PartInformationType }
     * 
     */
    public PartInformationType createPartInformationType() {
        return new PartInformationType();
    }

    /**
     * Create an instance of {@link PreviousLotType }
     * 
     */
    public PreviousLotType createPreviousLotType() {
        return new PreviousLotType();
    }

    /**
     * Create an instance of {@link QuantityChangeDescriptionType }
     * 
     */
    public QuantityChangeDescriptionType createQuantityChangeDescriptionType() {
        return new QuantityChangeDescriptionType();
    }

    /**
     * Create an instance of {@link StatusChangeDescriptionType }
     * 
     */
    public StatusChangeDescriptionType createStatusChangeDescriptionType() {
        return new StatusChangeDescriptionType();
    }

    /**
     * Create an instance of {@link SubLotType }
     * 
     */
    public SubLotType createSubLotType() {
        return new SubLotType();
    }

    /**
     * Create an instance of {@link WaferIdentificationType }
     * 
     */
    public WaferIdentificationType createWaferIdentificationType() {
        return new WaferIdentificationType();
    }

    /**
     * Create an instance of {@link WaferInformationType }
     * 
     */
    public WaferInformationType createWaferInformationType() {
        return new WaferInformationType();
    }

    /**
     * Create an instance of {@link WorkInProcessType }
     * 
     */
    public WorkInProcessType createWorkInProcessType() {
        return new WorkInProcessType();
    }

    /**
     * Create an instance of {@link WorkInProcessDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WorkInProcessDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02", name = "WorkInProcessDistribution")
    public WorkInProcessDistribution createWorkInProcessDistribution(WorkInProcessDistributionType value) {
        return new WorkInProcessDistribution(value);
    }

}
