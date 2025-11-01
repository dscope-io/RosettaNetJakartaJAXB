
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.forecastreplynotification.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.forecastreplynotification.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForecastReplyNotificationType }
     * 
     */
    public ForecastReplyNotificationType createForecastReplyNotificationType() {
        return new ForecastReplyNotificationType();
    }

    /**
     * Create an instance of {@link ForecastProductScheduleResponseType }
     * 
     */
    public ForecastProductScheduleResponseType createForecastProductScheduleResponseType() {
        return new ForecastProductScheduleResponseType();
    }

    /**
     * Create an instance of {@link ForecastReplyType }
     * 
     */
    public ForecastReplyType createForecastReplyType() {
        return new ForecastReplyType();
    }

    /**
     * Create an instance of {@link PartnerProductForecastType }
     * 
     */
    public PartnerProductForecastType createPartnerProductForecastType() {
        return new PartnerProductForecastType();
    }

    /**
     * Create an instance of {@link ProductForecastInventoryFamilyType }
     * 
     */
    public ProductForecastInventoryFamilyType createProductForecastInventoryFamilyType() {
        return new ProductForecastInventoryFamilyType();
    }

    /**
     * Create an instance of {@link ProductScheduleType }
     * 
     */
    public ProductScheduleType createProductScheduleType() {
        return new ProductScheduleType();
    }

    /**
     * Create an instance of {@link ForecastReplyNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ForecastReplyNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ForecastReplyNotification:xsd:schema:02.01", name = "ForecastReplyNotification")
    public ForecastReplyNotification createForecastReplyNotification(ForecastReplyNotificationType value) {
        return new ForecastReplyNotification(value);
    }

}
