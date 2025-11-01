
package io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlanningReleaseForecastNotificationType }
     * 
     */
    public PlanningReleaseForecastNotificationType createPlanningReleaseForecastNotificationType() {
        return new PlanningReleaseForecastNotificationType();
    }

    /**
     * Create an instance of {@link PartnerProductForecastType }
     * 
     */
    public PartnerProductForecastType createPartnerProductForecastType() {
        return new PartnerProductForecastType();
    }

    /**
     * Create an instance of {@link PlanningReleaseForecastType }
     * 
     */
    public PlanningReleaseForecastType createPlanningReleaseForecastType() {
        return new PlanningReleaseForecastType();
    }

    /**
     * Create an instance of {@link ProductForecastInformationType }
     * 
     */
    public ProductForecastInformationType createProductForecastInformationType() {
        return new ProductForecastInformationType();
    }

    /**
     * Create an instance of {@link ProductScheduleType }
     * 
     */
    public ProductScheduleType createProductScheduleType() {
        return new ProductScheduleType();
    }

    /**
     * Create an instance of {@link PlanningReleaseForecastNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PlanningReleaseForecastNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PlanningReleaseForecastNotification:xsd:schema:02.01", name = "PlanningReleaseForecastNotification")
    public PlanningReleaseForecastNotification createPlanningReleaseForecastNotification(PlanningReleaseForecastNotificationType value) {
        return new PlanningReleaseForecastNotification(value);
    }

}
