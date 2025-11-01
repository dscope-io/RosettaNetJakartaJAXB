
package io.dscope.rosettanet.interchange.consumptionnotification.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.consumptionnotification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.consumptionnotification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumptionNotificationType }
     * 
     */
    public ConsumptionNotificationType createConsumptionNotificationType() {
        return new ConsumptionNotificationType();
    }

    /**
     * Create an instance of {@link ConsumptionLineItemType }
     * 
     */
    public ConsumptionLineItemType createConsumptionLineItemType() {
        return new ConsumptionLineItemType();
    }

    /**
     * Create an instance of {@link ConsumptionNoticeType }
     * 
     */
    public ConsumptionNoticeType createConsumptionNoticeType() {
        return new ConsumptionNoticeType();
    }

    /**
     * Create an instance of {@link InventoryProductQuantityType }
     * 
     */
    public InventoryProductQuantityType createInventoryProductQuantityType() {
        return new InventoryProductQuantityType();
    }

    /**
     * Create an instance of {@link LotSizeType }
     * 
     */
    public LotSizeType createLotSizeType() {
        return new LotSizeType();
    }

    /**
     * Create an instance of {@link MaterialType }
     * 
     */
    public MaterialType createMaterialType() {
        return new MaterialType();
    }

    /**
     * Create an instance of {@link MaterialConsumptionType }
     * 
     */
    public MaterialConsumptionType createMaterialConsumptionType() {
        return new MaterialConsumptionType();
    }

    /**
     * Create an instance of {@link PartnerType }
     * 
     */
    public PartnerType createPartnerType() {
        return new PartnerType();
    }

    /**
     * Create an instance of {@link ConsumptionNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ConsumptionNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ConsumptionNotification:xsd:schema:01.00", name = "ConsumptionNotification")
    public ConsumptionNotification createConsumptionNotification(ConsumptionNotificationType value) {
        return new ConsumptionNotification(value);
    }

}
