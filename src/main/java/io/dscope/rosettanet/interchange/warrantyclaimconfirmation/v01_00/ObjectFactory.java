
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WarrantyClaimConfirmationType }
     * 
     */
    public WarrantyClaimConfirmationType createWarrantyClaimConfirmationType() {
        return new WarrantyClaimConfirmationType();
    }

    /**
     * Create an instance of {@link ClaimDataType }
     * 
     */
    public ClaimDataType createClaimDataType() {
        return new ClaimDataType();
    }

    /**
     * Create an instance of {@link ServiceDeliveryType }
     * 
     */
    public ServiceDeliveryType createServiceDeliveryType() {
        return new ServiceDeliveryType();
    }

    /**
     * Create an instance of {@link ServicedUnitType }
     * 
     */
    public ServicedUnitType createServicedUnitType() {
        return new ServicedUnitType();
    }

    /**
     * Create an instance of {@link StatusInformationType }
     * 
     */
    public StatusInformationType createStatusInformationType() {
        return new StatusInformationType();
    }

    /**
     * Create an instance of {@link WarrantyClaimConfirmDataType }
     * 
     */
    public WarrantyClaimConfirmDataType createWarrantyClaimConfirmDataType() {
        return new WarrantyClaimConfirmDataType();
    }

    /**
     * Create an instance of {@link WarrantyClaimConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WarrantyClaimConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:WarrantyClaimConfirmationNotification:xsd:schema:01.00", name = "WarrantyClaimConfirmation")
    public WarrantyClaimConfirmation createWarrantyClaimConfirmation(WarrantyClaimConfirmationType value) {
        return new WarrantyClaimConfirmation(value);
    }

}
