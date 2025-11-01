
package io.dscope.rosettanet.universal.partneridentification.v01_12;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.partneridentification.v01_12 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.partneridentification.v01_12
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FullPartnerType }
     * 
     */
    public FullPartnerType createFullPartnerType() {
        return new FullPartnerType();
    }

    /**
     * Create an instance of {@link IntermittentPartnerType }
     * 
     */
    public IntermittentPartnerType createIntermittentPartnerType() {
        return new IntermittentPartnerType();
    }

    /**
     * Create an instance of {@link KnownPartnerType }
     * 
     */
    public KnownPartnerType createKnownPartnerType() {
        return new KnownPartnerType();
    }

    /**
     * Create an instance of {@link KnownPartnerContactType }
     * 
     */
    public KnownPartnerContactType createKnownPartnerContactType() {
        return new KnownPartnerContactType();
    }

    /**
     * Create an instance of {@link NewPartnerType }
     * 
     */
    public NewPartnerType createNewPartnerType() {
        return new NewPartnerType();
    }

    /**
     * Create an instance of {@link PartnerDescriptionType }
     * 
     */
    public PartnerDescriptionType createPartnerDescriptionType() {
        return new PartnerDescriptionType();
    }

    /**
     * Create an instance of {@link PartnerIdentificationType }
     * 
     */
    public PartnerIdentificationType createPartnerIdentificationType() {
        return new PartnerIdentificationType();
    }

    /**
     * Create an instance of {@link SpecifiedFullPartnerType }
     * 
     */
    public SpecifiedFullPartnerType createSpecifiedFullPartnerType() {
        return new SpecifiedFullPartnerType();
    }

    /**
     * Create an instance of {@link SpecifiedIntermittentPartnerType }
     * 
     */
    public SpecifiedIntermittentPartnerType createSpecifiedIntermittentPartnerType() {
        return new SpecifiedIntermittentPartnerType();
    }

    /**
     * Create an instance of {@link SpecifiedKnownPartnerType }
     * 
     */
    public SpecifiedKnownPartnerType createSpecifiedKnownPartnerType() {
        return new SpecifiedKnownPartnerType();
    }

    /**
     * Create an instance of {@link SpecifiedKnownPartnerContactType }
     * 
     */
    public SpecifiedKnownPartnerContactType createSpecifiedKnownPartnerContactType() {
        return new SpecifiedKnownPartnerContactType();
    }

    /**
     * Create an instance of {@link SpecifiedNewPartnerType }
     * 
     */
    public SpecifiedNewPartnerType createSpecifiedNewPartnerType() {
        return new SpecifiedNewPartnerType();
    }

    /**
     * Create an instance of {@link SpecifiedPartnerDescriptionType }
     * 
     */
    public SpecifiedPartnerDescriptionType createSpecifiedPartnerDescriptionType() {
        return new SpecifiedPartnerDescriptionType();
    }

    /**
     * Create an instance of {@link FullPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FullPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "FullPartner")
    public FullPartner createFullPartner(FullPartnerType value) {
        return new FullPartner(value);
    }

    /**
     * Create an instance of {@link IntermittentPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IntermittentPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "IntermittentPartner")
    public IntermittentPartner createIntermittentPartner(IntermittentPartnerType value) {
        return new IntermittentPartner(value);
    }

    /**
     * Create an instance of {@link KnownPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link KnownPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "KnownPartner")
    public KnownPartner createKnownPartner(KnownPartnerType value) {
        return new KnownPartner(value);
    }

    /**
     * Create an instance of {@link KnownPartnerContact }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link KnownPartnerContact }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "KnownPartnerContact")
    public KnownPartnerContact createKnownPartnerContact(KnownPartnerContactType value) {
        return new KnownPartnerContact(value);
    }

    /**
     * Create an instance of {@link NewPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NewPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "NewPartner")
    public NewPartner createNewPartner(NewPartnerType value) {
        return new NewPartner(value);
    }

    /**
     * Create an instance of {@link PartnerDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PartnerDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "PartnerDescription")
    public PartnerDescription createPartnerDescription(PartnerDescriptionType value) {
        return new PartnerDescription(value);
    }

    /**
     * Create an instance of {@link PartnerIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PartnerIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "PartnerIdentification")
    public PartnerIdentification createPartnerIdentification(PartnerIdentificationType value) {
        return new PartnerIdentification(value);
    }

    /**
     * Create an instance of {@link SpecifiedFullPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecifiedFullPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "SpecifiedFullPartner")
    public SpecifiedFullPartner createSpecifiedFullPartner(SpecifiedFullPartnerType value) {
        return new SpecifiedFullPartner(value);
    }

    /**
     * Create an instance of {@link SpecifiedIntermittentPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecifiedIntermittentPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "SpecifiedIntermittentPartner")
    public SpecifiedIntermittentPartner createSpecifiedIntermittentPartner(SpecifiedIntermittentPartnerType value) {
        return new SpecifiedIntermittentPartner(value);
    }

    /**
     * Create an instance of {@link SpecifiedKnownPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecifiedKnownPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "SpecifiedKnownPartner")
    public SpecifiedKnownPartner createSpecifiedKnownPartner(SpecifiedKnownPartnerType value) {
        return new SpecifiedKnownPartner(value);
    }

    /**
     * Create an instance of {@link SpecifiedKnownPartnerContact }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecifiedKnownPartnerContact }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "SpecifiedKnownPartnerContact")
    public SpecifiedKnownPartnerContact createSpecifiedKnownPartnerContact(SpecifiedKnownPartnerContactType value) {
        return new SpecifiedKnownPartnerContact(value);
    }

    /**
     * Create an instance of {@link SpecifiedNewPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecifiedNewPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "SpecifiedNewPartner")
    public SpecifiedNewPartner createSpecifiedNewPartner(SpecifiedNewPartnerType value) {
        return new SpecifiedNewPartner(value);
    }

    /**
     * Create an instance of {@link SpecifiedPartnerDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecifiedPartnerDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", name = "SpecifiedPartnerDescription")
    public SpecifiedPartnerDescription createSpecifiedPartnerDescription(SpecifiedPartnerDescriptionType value) {
        return new SpecifiedPartnerDescription(value);
    }

}
