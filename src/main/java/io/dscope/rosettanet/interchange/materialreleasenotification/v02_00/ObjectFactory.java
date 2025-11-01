
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.materialreleasenotification.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.materialreleasenotification.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MaterialReleaseNotificationType }
     * 
     */
    public MaterialReleaseNotificationType createMaterialReleaseNotificationType() {
        return new MaterialReleaseNotificationType();
    }

    /**
     * Create an instance of {@link JustInTimeScheduleType }
     * 
     */
    public JustInTimeScheduleType createJustInTimeScheduleType() {
        return new JustInTimeScheduleType();
    }

    /**
     * Create an instance of {@link MaterialReleaseType }
     * 
     */
    public MaterialReleaseType createMaterialReleaseType() {
        return new MaterialReleaseType();
    }

    /**
     * Create an instance of {@link PartnerProductReleaseType }
     * 
     */
    public PartnerProductReleaseType createPartnerProductReleaseType() {
        return new PartnerProductReleaseType();
    }

    /**
     * Create an instance of {@link ProductReleaseScheduleType }
     * 
     */
    public ProductReleaseScheduleType createProductReleaseScheduleType() {
        return new ProductReleaseScheduleType();
    }

    /**
     * Create an instance of {@link ReleaseProductType }
     * 
     */
    public ReleaseProductType createReleaseProductType() {
        return new ReleaseProductType();
    }

    /**
     * Create an instance of {@link MaterialReleaseNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MaterialReleaseNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00", name = "MaterialReleaseNotification")
    public MaterialReleaseNotification createMaterialReleaseNotification(MaterialReleaseNotificationType value) {
        return new MaterialReleaseNotification(value);
    }

}
