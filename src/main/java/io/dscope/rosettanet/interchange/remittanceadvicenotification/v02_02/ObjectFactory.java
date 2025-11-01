
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemittanceAdviceNotificationType }
     * 
     */
    public RemittanceAdviceNotificationType createRemittanceAdviceNotificationType() {
        return new RemittanceAdviceNotificationType();
    }

    /**
     * Create an instance of {@link PaymentOrderType }
     * 
     */
    public PaymentOrderType createPaymentOrderType() {
        return new PaymentOrderType();
    }

    /**
     * Create an instance of {@link RemittanceAdviceType }
     * 
     */
    public RemittanceAdviceType createRemittanceAdviceType() {
        return new RemittanceAdviceType();
    }

    /**
     * Create an instance of {@link RemittanceLineItemType }
     * 
     */
    public RemittanceLineItemType createRemittanceLineItemType() {
        return new RemittanceLineItemType();
    }

    /**
     * Create an instance of {@link RemittanceAdviceNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RemittanceAdviceNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.02", name = "RemittanceAdviceNotification")
    public RemittanceAdviceNotification createRemittanceAdviceNotification(RemittanceAdviceNotificationType value) {
        return new RemittanceAdviceNotification(value);
    }

}
