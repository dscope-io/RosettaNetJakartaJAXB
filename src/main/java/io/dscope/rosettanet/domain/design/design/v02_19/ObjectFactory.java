
package io.dscope.rosettanet.domain.design.design.v02_19;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.design.v02_19 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.design.v02_19
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualValueType }
     * 
     */
    public ActualValueType createActualValueType() {
        return new ActualValueType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link ChangeDescriptionType }
     * 
     */
    public ChangeDescriptionType createChangeDescriptionType() {
        return new ChangeDescriptionType();
    }

    /**
     * Create an instance of {@link DateReferenceType }
     * 
     */
    public DateReferenceType createDateReferenceType() {
        return new DateReferenceType();
    }

    /**
     * Create an instance of {@link DependentConditionType }
     * 
     */
    public DependentConditionType createDependentConditionType() {
        return new DependentConditionType();
    }

    /**
     * Create an instance of {@link DirectiveType }
     * 
     */
    public DirectiveType createDirectiveType() {
        return new DirectiveType();
    }

    /**
     * Create an instance of {@link EngineeringInformationType }
     * 
     */
    public EngineeringInformationType createEngineeringInformationType() {
        return new EngineeringInformationType();
    }

    /**
     * Create an instance of {@link LifeCycleStatusType }
     * 
     */
    public LifeCycleStatusType createLifeCycleStatusType() {
        return new LifeCycleStatusType();
    }

    /**
     * Create an instance of {@link ManufacturingProcessInfoType }
     * 
     */
    public ManufacturingProcessInfoType createManufacturingProcessInfoType() {
        return new ManufacturingProcessInfoType();
    }

    /**
     * Create an instance of {@link MassType }
     * 
     */
    public MassType createMassType() {
        return new MassType();
    }

    /**
     * Create an instance of {@link MassPercentageType }
     * 
     */
    public MassPercentageType createMassPercentageType() {
        return new MassPercentageType();
    }

    /**
     * Create an instance of {@link MaterialType }
     * 
     */
    public MaterialType createMaterialType() {
        return new MaterialType();
    }

    /**
     * Create an instance of {@link MaterialMassType }
     * 
     */
    public MaterialMassType createMaterialMassType() {
        return new MaterialMassType();
    }

    /**
     * Create an instance of {@link ProcessValueType }
     * 
     */
    public ProcessValueType createProcessValueType() {
        return new ProcessValueType();
    }

    /**
     * Create an instance of {@link ProductIdentifierType }
     * 
     */
    public ProductIdentifierType createProductIdentifierType() {
        return new ProductIdentifierType();
    }

    /**
     * Create an instance of {@link ProductMassType }
     * 
     */
    public ProductMassType createProductMassType() {
        return new ProductMassType();
    }

    /**
     * Create an instance of {@link QualDataType }
     * 
     */
    public QualDataType createQualDataType() {
        return new QualDataType();
    }

    /**
     * Create an instance of {@link RadioactivityType }
     * 
     */
    public RadioactivityType createRadioactivityType() {
        return new RadioactivityType();
    }

    /**
     * Create an instance of {@link ReferenceLocatorType }
     * 
     */
    public ReferenceLocatorType createReferenceLocatorType() {
        return new ReferenceLocatorType();
    }

    /**
     * Create an instance of {@link SubpartType }
     * 
     */
    public SubpartType createSubpartType() {
        return new SubpartType();
    }

    /**
     * Create an instance of {@link SubpartIdentifierType }
     * 
     */
    public SubpartIdentifierType createSubpartIdentifierType() {
        return new SubpartIdentifierType();
    }

    /**
     * Create an instance of {@link SubstanceType }
     * 
     */
    public SubstanceType createSubstanceType() {
        return new SubstanceType();
    }

    /**
     * Create an instance of {@link SubstanceIdentificationType }
     * 
     */
    public SubstanceIdentificationType createSubstanceIdentificationType() {
        return new SubstanceIdentificationType();
    }

    /**
     * Create an instance of {@link SubstanceMassType }
     * 
     */
    public SubstanceMassType createSubstanceMassType() {
        return new SubstanceMassType();
    }

    /**
     * Create an instance of {@link ThresholdType }
     * 
     */
    public ThresholdType createThresholdType() {
        return new ThresholdType();
    }

    /**
     * Create an instance of {@link ToleranceType }
     * 
     */
    public ToleranceType createToleranceType() {
        return new ToleranceType();
    }

    /**
     * Create an instance of {@link ActualValue }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ActualValue }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "ActualValue")
    public ActualValue createActualValue(ActualValueType value) {
        return new ActualValue(value);
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Attachment }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Attachment")
    public Attachment createAttachment(AttachmentType value) {
        return new Attachment(value);
    }

    /**
     * Create an instance of {@link CAS }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CAS }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "CAS")
    public CAS createCAS(String value) {
        return new CAS(value);
    }

    /**
     * Create an instance of {@link ChangeDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ChangeDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "ChangeDescription")
    public ChangeDescription createChangeDescription(ChangeDescriptionType value) {
        return new ChangeDescription(value);
    }

    /**
     * Create an instance of {@link DateReference }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DateReference }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "DateReference")
    public DateReference createDateReference(DateReferenceType value) {
        return new DateReference(value);
    }

    /**
     * Create an instance of {@link DependentCondition }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DependentCondition }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "DependentCondition")
    public DependentCondition createDependentCondition(DependentConditionType value) {
        return new DependentCondition(value);
    }

    /**
     * Create an instance of {@link Directive }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Directive }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Directive")
    public Directive createDirective(DirectiveType value) {
        return new Directive(value);
    }

    /**
     * Create an instance of {@link EngineeringInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link EngineeringInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "EngineeringInformation")
    public EngineeringInformation createEngineeringInformation(EngineeringInformationType value) {
        return new EngineeringInformation(value);
    }

    /**
     * Create an instance of {@link LifeCycleStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LifeCycleStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "LifeCycleStatus")
    public LifeCycleStatus createLifeCycleStatus(LifeCycleStatusType value) {
        return new LifeCycleStatus(value);
    }

    /**
     * Create an instance of {@link ManufacturingProcessInfo }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ManufacturingProcessInfo }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "ManufacturingProcessInfo")
    public ManufacturingProcessInfo createManufacturingProcessInfo(ManufacturingProcessInfoType value) {
        return new ManufacturingProcessInfo(value);
    }

    /**
     * Create an instance of {@link Mass }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Mass }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Mass")
    public Mass createMass(MassType value) {
        return new Mass(value);
    }

    /**
     * Create an instance of {@link MassPercentage }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MassPercentage }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "MassPercentage")
    public MassPercentage createMassPercentage(MassPercentageType value) {
        return new MassPercentage(value);
    }

    /**
     * Create an instance of {@link Material }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Material }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Material")
    public Material createMaterial(MaterialType value) {
        return new Material(value);
    }

    /**
     * Create an instance of {@link MaterialMass }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MaterialMass }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "MaterialMass")
    public MaterialMass createMaterialMass(MaterialMassType value) {
        return new MaterialMass(value);
    }

    /**
     * Create an instance of {@link Note }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Note }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Note")
    public Note createNote(String value) {
        return new Note(value);
    }

    /**
     * Create an instance of {@link ProcessValue }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProcessValue }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "ProcessValue")
    public ProcessValue createProcessValue(ProcessValueType value) {
        return new ProcessValue(value);
    }

    /**
     * Create an instance of {@link ProductIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "ProductIdentifier")
    public ProductIdentifier createProductIdentifier(ProductIdentifierType value) {
        return new ProductIdentifier(value);
    }

    /**
     * Create an instance of {@link ProductMass }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductMass }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "ProductMass")
    public ProductMass createProductMass(ProductMassType value) {
        return new ProductMass(value);
    }

    /**
     * Create an instance of {@link QualData }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QualData }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "QualData")
    public QualData createQualData(QualDataType value) {
        return new QualData(value);
    }

    /**
     * Create an instance of {@link Radioactivity }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Radioactivity }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Radioactivity")
    public Radioactivity createRadioactivity(RadioactivityType value) {
        return new Radioactivity(value);
    }

    /**
     * Create an instance of {@link ReferenceLocator }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReferenceLocator }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "ReferenceLocator")
    public ReferenceLocator createReferenceLocator(ReferenceLocatorType value) {
        return new ReferenceLocator(value);
    }

    /**
     * Create an instance of {@link Subpart }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Subpart }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Subpart")
    public Subpart createSubpart(SubpartType value) {
        return new Subpart(value);
    }

    /**
     * Create an instance of {@link SubpartIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SubpartIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "SubpartIdentifier")
    public SubpartIdentifier createSubpartIdentifier(SubpartIdentifierType value) {
        return new SubpartIdentifier(value);
    }

    /**
     * Create an instance of {@link Substance }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Substance }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Substance")
    public Substance createSubstance(SubstanceType value) {
        return new Substance(value);
    }

    /**
     * Create an instance of {@link SubstanceIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SubstanceIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "SubstanceIdentification")
    public SubstanceIdentification createSubstanceIdentification(SubstanceIdentificationType value) {
        return new SubstanceIdentification(value);
    }

    /**
     * Create an instance of {@link SubstanceMass }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SubstanceMass }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "SubstanceMass")
    public SubstanceMass createSubstanceMass(SubstanceMassType value) {
        return new SubstanceMass(value);
    }

    /**
     * Create an instance of {@link Text }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Text }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Text")
    public Text createText(String value) {
        return new Text(value);
    }

    /**
     * Create an instance of {@link Threshold }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Threshold }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Threshold")
    public Threshold createThreshold(ThresholdType value) {
        return new Threshold(value);
    }

    /**
     * Create an instance of {@link Tolerance }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Tolerance }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Tolerance")
    public Tolerance createTolerance(ToleranceType value) {
        return new Tolerance(value);
    }

    /**
     * Create an instance of {@link Url }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Url }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "url")
    public Url createUrl(String value) {
        return new Url(value);
    }

    /**
     * Create an instance of {@link Value }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Value }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", name = "Value")
    public Value createValue(String value) {
        return new Value(value);
    }

}
