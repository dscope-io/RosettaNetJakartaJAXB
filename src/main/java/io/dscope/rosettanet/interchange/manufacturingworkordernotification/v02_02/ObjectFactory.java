
package io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManufacturingWorkOrderNotificationType }
     * 
     */
    public ManufacturingWorkOrderNotificationType createManufacturingWorkOrderNotificationType() {
        return new ManufacturingWorkOrderNotificationType();
    }

    /**
     * Create an instance of {@link CustomerProfileType }
     * 
     */
    public CustomerProfileType createCustomerProfileType() {
        return new CustomerProfileType();
    }

    /**
     * Create an instance of {@link SublineItemsType }
     * 
     */
    public SublineItemsType createSublineItemsType() {
        return new SublineItemsType();
    }

    /**
     * Create an instance of {@link TargetDeviceType }
     * 
     */
    public TargetDeviceType createTargetDeviceType() {
        return new TargetDeviceType();
    }

    /**
     * Create an instance of {@link WorkOrderType }
     * 
     */
    public WorkOrderType createWorkOrderType() {
        return new WorkOrderType();
    }

    /**
     * Create an instance of {@link WorkOrderLineItemsType }
     * 
     */
    public WorkOrderLineItemsType createWorkOrderLineItemsType() {
        return new WorkOrderLineItemsType();
    }

    /**
     * Create an instance of {@link ManufacturingWorkOrderNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ManufacturingWorkOrderNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.02", name = "ManufacturingWorkOrderNotification")
    public ManufacturingWorkOrderNotification createManufacturingWorkOrderNotification(ManufacturingWorkOrderNotificationType value) {
        return new ManufacturingWorkOrderNotification(value);
    }

}
