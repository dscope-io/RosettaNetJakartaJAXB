
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.marketing.v02_12 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.marketing.v02_12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeNotificationType }
     * 
     */
    public ChangeNotificationType createChangeNotificationType() {
        return new ChangeNotificationType();
    }

    /**
     * Create an instance of {@link CoreProductRegistrationType }
     * 
     */
    public CoreProductRegistrationType createCoreProductRegistrationType() {
        return new CoreProductRegistrationType();
    }

    /**
     * Create an instance of {@link DesignCompetitorInformationType }
     * 
     */
    public DesignCompetitorInformationType createDesignCompetitorInformationType() {
        return new DesignCompetitorInformationType();
    }

    /**
     * Create an instance of {@link DesignProjectDescriptionType }
     * 
     */
    public DesignProjectDescriptionType createDesignProjectDescriptionType() {
        return new DesignProjectDescriptionType();
    }

    /**
     * Create an instance of {@link DesignRegistrationIdentificationType }
     * 
     */
    public DesignRegistrationIdentificationType createDesignRegistrationIdentificationType() {
        return new DesignRegistrationIdentificationType();
    }

    /**
     * Create an instance of {@link DeviceProductRegistrationType }
     * 
     */
    public DeviceProductRegistrationType createDeviceProductRegistrationType() {
        return new DeviceProductRegistrationType();
    }

    /**
     * Create an instance of {@link GeographicRegionType }
     * 
     */
    public GeographicRegionType createGeographicRegionType() {
        return new GeographicRegionType();
    }

    /**
     * Create an instance of {@link MarketingInstructionType }
     * 
     */
    public MarketingInstructionType createMarketingInstructionType() {
        return new MarketingInstructionType();
    }

    /**
     * Create an instance of {@link RegistrationDispositionType }
     * 
     */
    public RegistrationDispositionType createRegistrationDispositionType() {
        return new RegistrationDispositionType();
    }

    /**
     * Create an instance of {@link RegistrationRenewableStatusType }
     * 
     */
    public RegistrationRenewableStatusType createRegistrationRenewableStatusType() {
        return new RegistrationRenewableStatusType();
    }

    /**
     * Create an instance of {@link RegistrationStatusType }
     * 
     */
    public RegistrationStatusType createRegistrationStatusType() {
        return new RegistrationStatusType();
    }

    /**
     * Create an instance of {@link ChangeNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ChangeNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "ChangeNotification")
    public ChangeNotification createChangeNotification(ChangeNotificationType value) {
        return new ChangeNotification(value);
    }

    /**
     * Create an instance of {@link CoreProductRegistration }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CoreProductRegistration }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "CoreProductRegistration")
    public CoreProductRegistration createCoreProductRegistration(CoreProductRegistrationType value) {
        return new CoreProductRegistration(value);
    }

    /**
     * Create an instance of {@link DebitAuthorizationNumber }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DebitAuthorizationNumber }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "DebitAuthorizationNumber")
    public DebitAuthorizationNumber createDebitAuthorizationNumber(String value) {
        return new DebitAuthorizationNumber(value);
    }

    /**
     * Create an instance of {@link DemandCreatorTrackingIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DemandCreatorTrackingIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "DemandCreatorTrackingIdentifier")
    public DemandCreatorTrackingIdentifier createDemandCreatorTrackingIdentifier(String value) {
        return new DemandCreatorTrackingIdentifier(value);
    }

    /**
     * Create an instance of {@link DesignCompetitorInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignCompetitorInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "DesignCompetitorInformation")
    public DesignCompetitorInformation createDesignCompetitorInformation(DesignCompetitorInformationType value) {
        return new DesignCompetitorInformation(value);
    }

    /**
     * Create an instance of {@link DesignProjectDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignProjectDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "DesignProjectDescription")
    public DesignProjectDescription createDesignProjectDescription(DesignProjectDescriptionType value) {
        return new DesignProjectDescription(value);
    }

    /**
     * Create an instance of {@link DesignRegistrationIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignRegistrationIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "DesignRegistrationIdentification")
    public DesignRegistrationIdentification createDesignRegistrationIdentification(DesignRegistrationIdentificationType value) {
        return new DesignRegistrationIdentification(value);
    }

    /**
     * Create an instance of {@link DesignWinStatusReasonCodeExplanation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignWinStatusReasonCodeExplanation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "DesignWinStatusReasonCodeExplanation")
    public DesignWinStatusReasonCodeExplanation createDesignWinStatusReasonCodeExplanation(String value) {
        return new DesignWinStatusReasonCodeExplanation(value);
    }

    /**
     * Create an instance of {@link DeviceProductRegistration }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DeviceProductRegistration }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "DeviceProductRegistration")
    public DeviceProductRegistration createDeviceProductRegistration(DeviceProductRegistrationType value) {
        return new DeviceProductRegistration(value);
    }

    /**
     * Create an instance of {@link GeographicRegion }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GeographicRegion }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "GeographicRegion")
    public GeographicRegion createGeographicRegion(GeographicRegionType value) {
        return new GeographicRegion(value);
    }

    /**
     * Create an instance of {@link IsDesignWin }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IsDesignWin }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "IsDesignWin")
    public IsDesignWin createIsDesignWin(Boolean value) {
        return new IsDesignWin(value);
    }

    /**
     * Create an instance of {@link IsDeveloperToolKit }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IsDeveloperToolKit }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "IsDeveloperToolKit")
    public IsDeveloperToolKit createIsDeveloperToolKit(Boolean value) {
        return new IsDeveloperToolKit(value);
    }

    /**
     * Create an instance of {@link IsPartSelected }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IsPartSelected }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "IsPartSelected")
    public IsPartSelected createIsPartSelected(Boolean value) {
        return new IsPartSelected(value);
    }

    /**
     * Create an instance of {@link IsRegisterable }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IsRegisterable }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "IsRegisterable")
    public IsRegisterable createIsRegisterable(Boolean value) {
        return new IsRegisterable(value);
    }

    /**
     * Create an instance of {@link IsRegistrationRenewable }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IsRegistrationRenewable }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "IsRegistrationRenewable")
    public IsRegistrationRenewable createIsRegistrationRenewable(Boolean value) {
        return new IsRegistrationRenewable(value);
    }

    /**
     * Create an instance of {@link MarketingInstruction }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MarketingInstruction }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "MarketingInstruction")
    public MarketingInstruction createMarketingInstruction(MarketingInstructionType value) {
        return new MarketingInstruction(value);
    }

    /**
     * Create an instance of {@link ProductProviderComments }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductProviderComments }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "ProductProviderComments")
    public ProductProviderComments createProductProviderComments(String value) {
        return new ProductProviderComments(value);
    }

    /**
     * Create an instance of {@link ProductProviderLeadDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductProviderLeadDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "ProductProviderLeadDescription")
    public ProductProviderLeadDescription createProductProviderLeadDescription(String value) {
        return new ProductProviderLeadDescription(value);
    }

    /**
     * Create an instance of {@link ProductProviderLeadTrackingIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductProviderLeadTrackingIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "ProductProviderLeadTrackingIdentifier")
    public ProductProviderLeadTrackingIdentifier createProductProviderLeadTrackingIdentifier(String value) {
        return new ProductProviderLeadTrackingIdentifier(value);
    }

    /**
     * Create an instance of {@link ProjectIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProjectIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "ProjectIdentifier")
    public ProjectIdentifier createProjectIdentifier(String value) {
        return new ProjectIdentifier(value);
    }

    /**
     * Create an instance of {@link RegistrationDisposition }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationDisposition }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "RegistrationDisposition")
    public RegistrationDisposition createRegistrationDisposition(RegistrationDispositionType value) {
        return new RegistrationDisposition(value);
    }

    /**
     * Create an instance of {@link RegistrationRenewableDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationRenewableDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "RegistrationRenewableDate")
    public RegistrationRenewableDate createRegistrationRenewableDate(XMLGregorianCalendar value) {
        return new RegistrationRenewableDate(value);
    }

    /**
     * Create an instance of {@link RegistrationRenewableStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationRenewableStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "RegistrationRenewableStatus")
    public RegistrationRenewableStatus createRegistrationRenewableStatus(RegistrationRenewableStatusType value) {
        return new RegistrationRenewableStatus(value);
    }

    /**
     * Create an instance of {@link RegistrationStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "RegistrationStatus")
    public RegistrationStatus createRegistrationStatus(RegistrationStatusType value) {
        return new RegistrationStatus(value);
    }

    /**
     * Create an instance of {@link RegistrationSubmissionDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationSubmissionDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", name = "RegistrationSubmissionDate")
    public RegistrationSubmissionDate createRegistrationSubmissionDate(XMLGregorianCalendar value) {
        return new RegistrationSubmissionDate(value);
    }

}
