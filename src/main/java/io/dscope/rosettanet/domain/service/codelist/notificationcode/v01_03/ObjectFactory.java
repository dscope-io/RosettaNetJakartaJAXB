
package io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationCodeType }
     * 
     */
    public NotificationCodeType createNotificationCodeType() {
        return new NotificationCodeType();
    }

    /**
     * Create an instance of {@link NotificationCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NotificationCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", name = "NotificationCodeA")
    public NotificationCodeA createNotificationCodeA(Object value) {
        return new NotificationCodeA(value);
    }

    /**
     * Create an instance of {@link NotificationCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NotificationCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", name = "NotificationCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", substitutionHeadName = "NotificationCodeA")
    public NotificationCode createNotificationCode(NotificationCodeType value) {
        return new NotificationCode(value);
    }

}
