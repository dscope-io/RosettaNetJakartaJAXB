
package io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CaseConfirmationNotificationType }
     * 
     */
    public CaseConfirmationNotificationType createCaseConfirmationNotificationType() {
        return new CaseConfirmationNotificationType();
    }

    /**
     * Create an instance of {@link AcceptanceCaseType }
     * 
     */
    public AcceptanceCaseType createAcceptanceCaseType() {
        return new AcceptanceCaseType();
    }

    /**
     * Create an instance of {@link CaseType }
     * 
     */
    public CaseType createCaseType() {
        return new CaseType();
    }

    /**
     * Create an instance of {@link CaseDetailType }
     * 
     */
    public CaseDetailType createCaseDetailType() {
        return new CaseDetailType();
    }

    /**
     * Create an instance of {@link CloseRejectCaseType }
     * 
     */
    public CloseRejectCaseType createCloseRejectCaseType() {
        return new CloseRejectCaseType();
    }

    /**
     * Create an instance of {@link ProblemTypeType }
     * 
     */
    public ProblemTypeType createProblemTypeType() {
        return new ProblemTypeType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
    }

    /**
     * Create an instance of {@link CaseConfirmationNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CaseConfirmationNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02", name = "CaseConfirmationNotification")
    public CaseConfirmationNotification createCaseConfirmationNotification(CaseConfirmationNotificationType value) {
        return new CaseConfirmationNotification(value);
    }

}
