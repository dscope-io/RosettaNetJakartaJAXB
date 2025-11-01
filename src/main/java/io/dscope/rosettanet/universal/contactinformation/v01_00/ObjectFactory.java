
package io.dscope.rosettanet.universal.contactinformation.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.contactinformation.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.contactinformation.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactAndPhoneType }
     * 
     */
    public ContactAndPhoneType createContactAndPhoneType() {
        return new ContactAndPhoneType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link ContactAndPhone }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContactAndPhone }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0", name = "ContactAndPhone")
    public ContactAndPhone createContactAndPhone(ContactAndPhoneType value) {
        return new ContactAndPhone(value);
    }

    /**
     * Create an instance of {@link ContactInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContactInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0", name = "ContactInformation")
    public ContactInformation createContactInformation(ContactInformationType value) {
        return new ContactInformation(value);
    }

}
