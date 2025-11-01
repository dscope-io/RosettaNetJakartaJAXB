
package io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategicForecastNotificationType }
     * 
     */
    public StrategicForecastNotificationType createStrategicForecastNotificationType() {
        return new StrategicForecastNotificationType();
    }

    /**
     * Create an instance of {@link PartnerProductForecastType }
     * 
     */
    public PartnerProductForecastType createPartnerProductForecastType() {
        return new PartnerProductForecastType();
    }

    /**
     * Create an instance of {@link ProductScheduleType }
     * 
     */
    public ProductScheduleType createProductScheduleType() {
        return new ProductScheduleType();
    }

    /**
     * Create an instance of {@link StrategicForecastType }
     * 
     */
    public StrategicForecastType createStrategicForecastType() {
        return new StrategicForecastType();
    }

    /**
     * Create an instance of {@link StrategicProductForecastType }
     * 
     */
    public StrategicProductForecastType createStrategicProductForecastType() {
        return new StrategicProductForecastType();
    }

    /**
     * Create an instance of {@link StrategicForecastNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link StrategicForecastNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:StrategicForecastNotification:xsd:schema:02.00", name = "StrategicForecastNotification")
    public StrategicForecastNotification createStrategicForecastNotification(StrategicForecastNotificationType value) {
        return new StrategicForecastNotification(value);
    }

}
