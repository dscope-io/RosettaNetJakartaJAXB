
package io.dscope.rosettanet.system.standarddocumentheader.v01_24;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.system.standarddocumentheader.v01_24 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.system.standarddocumentheader.v01_24
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessServiceInformationType }
     * 
     */
    public BusinessServiceInformationType createBusinessServiceInformationType() {
        return new BusinessServiceInformationType();
    }

    /**
     * Create an instance of {@link ContractInformationType }
     * 
     */
    public ContractInformationType createContractInformationType() {
        return new ContractInformationType();
    }

    /**
     * Create an instance of {@link CorrelationInformationType }
     * 
     */
    public CorrelationInformationType createCorrelationInformationType() {
        return new CorrelationInformationType();
    }

    /**
     * Create an instance of {@link DocumentHeaderType }
     * 
     */
    public DocumentHeaderType createDocumentHeaderType() {
        return new DocumentHeaderType();
    }

    /**
     * Create an instance of {@link DocumentIdentificationType }
     * 
     */
    public DocumentIdentificationType createDocumentIdentificationType() {
        return new DocumentIdentificationType();
    }

    /**
     * Create an instance of {@link DocumentInformationType }
     * 
     */
    public DocumentInformationType createDocumentInformationType() {
        return new DocumentInformationType();
    }

    /**
     * Create an instance of {@link DocumentManifestType }
     * 
     */
    public DocumentManifestType createDocumentManifestType() {
        return new DocumentManifestType();
    }

    /**
     * Create an instance of {@link DocumentSecurityType }
     * 
     */
    public DocumentSecurityType createDocumentSecurityType() {
        return new DocumentSecurityType();
    }

    /**
     * Create an instance of {@link ManifestItemType }
     * 
     */
    public ManifestItemType createManifestItemType() {
        return new ManifestItemType();
    }

    /**
     * Create an instance of {@link ReceiverType }
     * 
     */
    public ReceiverType createReceiverType() {
        return new ReceiverType();
    }

    /**
     * Create an instance of {@link RequestingDocumentInformationType }
     * 
     */
    public RequestingDocumentInformationType createRequestingDocumentInformationType() {
        return new RequestingDocumentInformationType();
    }

    /**
     * Create an instance of {@link SenderType }
     * 
     */
    public SenderType createSenderType() {
        return new SenderType();
    }

    /**
     * Create an instance of {@link StandardDocumentIdentificationType }
     * 
     */
    public StandardDocumentIdentificationType createStandardDocumentIdentificationType() {
        return new StandardDocumentIdentificationType();
    }

    /**
     * Create an instance of {@link TpirPipIdentificationType }
     * 
     */
    public TpirPipIdentificationType createTpirPipIdentificationType() {
        return new TpirPipIdentificationType();
    }

    /**
     * Create an instance of {@link BusinessProcessIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link BusinessProcessIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "BusinessProcessIdentifier")
    public BusinessProcessIdentifier createBusinessProcessIdentifier(String value) {
        return new BusinessProcessIdentifier(value);
    }

    /**
     * Create an instance of {@link BusinessServiceInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link BusinessServiceInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "BusinessServiceInformation")
    public BusinessServiceInformation createBusinessServiceInformation(BusinessServiceInformationType value) {
        return new BusinessServiceInformation(value);
    }

    /**
     * Create an instance of {@link ContractInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContractInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "ContractInformation")
    public ContractInformation createContractInformation(ContractInformationType value) {
        return new ContractInformation(value);
    }

    /**
     * Create an instance of {@link CorrelationInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CorrelationInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "CorrelationInformation")
    public CorrelationInformation createCorrelationInformation(CorrelationInformationType value) {
        return new CorrelationInformation(value);
    }

    /**
     * Create an instance of {@link DocumentHeader }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentHeader }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "DocumentHeader")
    public DocumentHeader createDocumentHeader(DocumentHeaderType value) {
        return new DocumentHeader(value);
    }

    /**
     * Create an instance of {@link DocumentIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "DocumentIdentification")
    public DocumentIdentification createDocumentIdentification(DocumentIdentificationType value) {
        return new DocumentIdentification(value);
    }

    /**
     * Create an instance of {@link DocumentInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "DocumentInformation")
    public DocumentInformation createDocumentInformation(DocumentInformationType value) {
        return new DocumentInformation(value);
    }

    /**
     * Create an instance of {@link DocumentManifest }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentManifest }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "DocumentManifest")
    public DocumentManifest createDocumentManifest(DocumentManifestType value) {
        return new DocumentManifest(value);
    }

    /**
     * Create an instance of {@link DocumentSecurity }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DocumentSecurity }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "DocumentSecurity")
    public DocumentSecurity createDocumentSecurity(DocumentSecurityType value) {
        return new DocumentSecurity(value);
    }

    /**
     * Create an instance of {@link ManifestItem }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ManifestItem }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "ManifestItem")
    public ManifestItem createManifestItem(ManifestItemType value) {
        return new ManifestItem(value);
    }

    /**
     * Create an instance of {@link PipIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PipIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "PipIdentifier")
    public PipIdentifier createPipIdentifier(String value) {
        return new PipIdentifier(value);
    }

    /**
     * Create an instance of {@link PipVersion }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PipVersion }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "PipVersion")
    public PipVersion createPipVersion(String value) {
        return new PipVersion(value);
    }

    /**
     * Create an instance of {@link Receiver }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Receiver }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "Receiver")
    public Receiver createReceiver(ReceiverType value) {
        return new Receiver(value);
    }

    /**
     * Create an instance of {@link RequestingDocumentInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RequestingDocumentInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "RequestingDocumentInformation")
    public RequestingDocumentInformation createRequestingDocumentInformation(RequestingDocumentInformationType value) {
        return new RequestingDocumentInformation(value);
    }

    /**
     * Create an instance of {@link Sender }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Sender }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "Sender")
    public Sender createSender(SenderType value) {
        return new Sender(value);
    }

    /**
     * Create an instance of {@link StandardDocumentIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link StandardDocumentIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "StandardDocumentIdentification")
    public StandardDocumentIdentification createStandardDocumentIdentification(StandardDocumentIdentificationType value) {
        return new StandardDocumentIdentification(value);
    }

    /**
     * Create an instance of {@link TpirPipIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TpirPipIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "TpirPipIdentification")
    public TpirPipIdentification createTpirPipIdentification(TpirPipIdentificationType value) {
        return new TpirPipIdentification(value);
    }

    /**
     * Create an instance of {@link VersionIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link VersionIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", name = "VersionIdentifier")
    public VersionIdentifier createVersionIdentifier(String value) {
        return new VersionIdentifier(value);
    }

}
