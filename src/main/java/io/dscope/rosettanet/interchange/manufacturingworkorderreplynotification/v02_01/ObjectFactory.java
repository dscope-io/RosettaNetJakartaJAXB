
package io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManufacturingWorkOrderReplyNotificationType }
     * 
     */
    public ManufacturingWorkOrderReplyNotificationType createManufacturingWorkOrderReplyNotificationType() {
        return new ManufacturingWorkOrderReplyNotificationType();
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
     * Create an instance of {@link WorkOrderReplyType }
     * 
     */
    public WorkOrderReplyType createWorkOrderReplyType() {
        return new WorkOrderReplyType();
    }

    /**
     * Create an instance of {@link WorkOrderReplyLineItemType }
     * 
     */
    public WorkOrderReplyLineItemType createWorkOrderReplyLineItemType() {
        return new WorkOrderReplyLineItemType();
    }

    /**
     * Create an instance of {@link ManufacturingWorkOrderReplyNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ManufacturingWorkOrderReplyNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.01", name = "ManufacturingWorkOrderReplyNotification")
    public ManufacturingWorkOrderReplyNotification createManufacturingWorkOrderReplyNotification(ManufacturingWorkOrderReplyNotificationType value) {
        return new ManufacturingWorkOrderReplyNotification(value);
    }

}
