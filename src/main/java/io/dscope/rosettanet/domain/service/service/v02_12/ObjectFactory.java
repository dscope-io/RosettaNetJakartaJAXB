
package io.dscope.rosettanet.domain.service.service.v02_12;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.service.v02_12 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.service.v02_12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CaseIDType }
     * 
     */
    public CaseIDType createCaseIDType() {
        return new CaseIDType();
    }

    /**
     * Create an instance of {@link FailureAnalysisType }
     * 
     */
    public FailureAnalysisType createFailureAnalysisType() {
        return new FailureAnalysisType();
    }

    /**
     * Create an instance of {@link FailureEventType }
     * 
     */
    public FailureEventType createFailureEventType() {
        return new FailureEventType();
    }

    /**
     * Create an instance of {@link FailureInformationType }
     * 
     */
    public FailureInformationType createFailureInformationType() {
        return new FailureInformationType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link HardwareType }
     * 
     */
    public HardwareType createHardwareType() {
        return new HardwareType();
    }

    /**
     * Create an instance of {@link IncidentDetailType }
     * 
     */
    public IncidentDetailType createIncidentDetailType() {
        return new IncidentDetailType();
    }

    /**
     * Create an instance of {@link MessageInformationType }
     * 
     */
    public MessageInformationType createMessageInformationType() {
        return new MessageInformationType();
    }

    /**
     * Create an instance of {@link PartType }
     * 
     */
    public PartType createPartType() {
        return new PartType();
    }

    /**
     * Create an instance of {@link ReimbursementInformationType }
     * 
     */
    public ReimbursementInformationType createReimbursementInformationType() {
        return new ReimbursementInformationType();
    }

    /**
     * Create an instance of {@link RejectCaseType }
     * 
     */
    public RejectCaseType createRejectCaseType() {
        return new RejectCaseType();
    }

    /**
     * Create an instance of {@link RepairEventType }
     * 
     */
    public RepairEventType createRepairEventType() {
        return new RepairEventType();
    }

    /**
     * Create an instance of {@link ReplacedPartType }
     * 
     */
    public ReplacedPartType createReplacedPartType() {
        return new ReplacedPartType();
    }

    /**
     * Create an instance of {@link RoutingInformationType }
     * 
     */
    public RoutingInformationType createRoutingInformationType() {
        return new RoutingInformationType();
    }

    /**
     * Create an instance of {@link ServiceInformationType }
     * 
     */
    public ServiceInformationType createServiceInformationType() {
        return new ServiceInformationType();
    }

    /**
     * Create an instance of {@link SoftwareType }
     * 
     */
    public SoftwareType createSoftwareType() {
        return new SoftwareType();
    }

    /**
     * Create an instance of {@link UpdateType }
     * 
     */
    public UpdateType createUpdateType() {
        return new UpdateType();
    }

    /**
     * Create an instance of {@link WarrantyInformationType }
     * 
     */
    public WarrantyInformationType createWarrantyInformationType() {
        return new WarrantyInformationType();
    }

    /**
     * Create an instance of {@link CaseID }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CaseID }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "CaseID")
    public CaseID createCaseID(CaseIDType value) {
        return new CaseID(value);
    }

    /**
     * Create an instance of {@link EffectiveDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link EffectiveDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "EffectiveDate")
    public EffectiveDate createEffectiveDate(XMLGregorianCalendar value) {
        return new EffectiveDate(value);
    }

    /**
     * Create an instance of {@link ExpiryDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ExpiryDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "ExpiryDate")
    public ExpiryDate createExpiryDate(XMLGregorianCalendar value) {
        return new ExpiryDate(value);
    }

    /**
     * Create an instance of {@link FailureAnalysis }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FailureAnalysis }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "FailureAnalysis")
    public FailureAnalysis createFailureAnalysis(FailureAnalysisType value) {
        return new FailureAnalysis(value);
    }

    /**
     * Create an instance of {@link FailureEvent }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FailureEvent }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "FailureEvent")
    public FailureEvent createFailureEvent(FailureEventType value) {
        return new FailureEvent(value);
    }

    /**
     * Create an instance of {@link FailureInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FailureInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "FailureInformation")
    public FailureInformation createFailureInformation(FailureInformationType value) {
        return new FailureInformation(value);
    }

    /**
     * Create an instance of {@link Fault }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Fault }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "Fault")
    public Fault createFault(FaultType value) {
        return new Fault(value);
    }

    /**
     * Create an instance of {@link Hardware }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Hardware }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "Hardware")
    public Hardware createHardware(HardwareType value) {
        return new Hardware(value);
    }

    /**
     * Create an instance of {@link IncidentDetail }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IncidentDetail }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "IncidentDetail")
    public IncidentDetail createIncidentDetail(IncidentDetailType value) {
        return new IncidentDetail(value);
    }

    /**
     * Create an instance of {@link MessageInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MessageInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "MessageInformation")
    public MessageInformation createMessageInformation(MessageInformationType value) {
        return new MessageInformation(value);
    }

    /**
     * Create an instance of {@link Part }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Part }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "Part")
    public Part createPart(PartType value) {
        return new Part(value);
    }

    /**
     * Create an instance of {@link PurchaseDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "PurchaseDate")
    public PurchaseDate createPurchaseDate(XMLGregorianCalendar value) {
        return new PurchaseDate(value);
    }

    /**
     * Create an instance of {@link ReimbursementInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReimbursementInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "ReimbursementInformation")
    public ReimbursementInformation createReimbursementInformation(ReimbursementInformationType value) {
        return new ReimbursementInformation(value);
    }

    /**
     * Create an instance of {@link RejectCase }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RejectCase }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "RejectCase")
    public RejectCase createRejectCase(RejectCaseType value) {
        return new RejectCase(value);
    }

    /**
     * Create an instance of {@link RepairEvent }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RepairEvent }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "RepairEvent")
    public RepairEvent createRepairEvent(RepairEventType value) {
        return new RepairEvent(value);
    }

    /**
     * Create an instance of {@link ReplacedPart }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReplacedPart }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "ReplacedPart")
    public ReplacedPart createReplacedPart(ReplacedPartType value) {
        return new ReplacedPart(value);
    }

    /**
     * Create an instance of {@link ResponsePeriod }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ResponsePeriod }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "ResponsePeriod")
    public ResponsePeriod createResponsePeriod(Duration value) {
        return new ResponsePeriod(value);
    }

    /**
     * Create an instance of {@link RoutingInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RoutingInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "RoutingInformation")
    public RoutingInformation createRoutingInformation(RoutingInformationType value) {
        return new RoutingInformation(value);
    }

    /**
     * Create an instance of {@link ServiceCompletionDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceCompletionDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "ServiceCompletionDate")
    public ServiceCompletionDate createServiceCompletionDate(XMLGregorianCalendar value) {
        return new ServiceCompletionDate(value);
    }

    /**
     * Create an instance of {@link ServiceInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "ServiceInformation")
    public ServiceInformation createServiceInformation(ServiceInformationType value) {
        return new ServiceInformation(value);
    }

    /**
     * Create an instance of {@link ServiceStartDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceStartDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "ServiceStartDate")
    public ServiceStartDate createServiceStartDate(XMLGregorianCalendar value) {
        return new ServiceStartDate(value);
    }

    /**
     * Create an instance of {@link Software }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Software }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "Software")
    public Software createSoftware(SoftwareType value) {
        return new Software(value);
    }

    /**
     * Create an instance of {@link Update }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Update }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "Update")
    public Update createUpdate(UpdateType value) {
        return new Update(value);
    }

    /**
     * Create an instance of {@link WarrantyInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WarrantyInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", name = "WarrantyInformation")
    public WarrantyInformation createWarrantyInformation(WarrantyInformationType value) {
        return new WarrantyInformation(value);
    }

}
