
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisNotificationType }
     * 
     */
    public CertificateOfAnalysisNotificationType createCertificateOfAnalysisNotificationType() {
        return new CertificateOfAnalysisNotificationType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisType }
     * 
     */
    public CertificateOfAnalysisType createCertificateOfAnalysisType() {
        return new CertificateOfAnalysisType();
    }

    /**
     * Create an instance of {@link CharacteristicType }
     * 
     */
    public CharacteristicType createCharacteristicType() {
        return new CharacteristicType();
    }

    /**
     * Create an instance of {@link ContainerType }
     * 
     */
    public ContainerType createContainerType() {
        return new ContainerType();
    }

    /**
     * Create an instance of {@link LotIdentificationType }
     * 
     */
    public LotIdentificationType createLotIdentificationType() {
        return new LotIdentificationType();
    }

    /**
     * Create an instance of {@link MaterialType }
     * 
     */
    public MaterialType createMaterialType() {
        return new MaterialType();
    }

    /**
     * Create an instance of {@link MaterialSpecificationType }
     * 
     */
    public MaterialSpecificationType createMaterialSpecificationType() {
        return new MaterialSpecificationType();
    }

    /**
     * Create an instance of {@link PackagingType }
     * 
     */
    public PackagingType createPackagingType() {
        return new PackagingType();
    }

    /**
     * Create an instance of {@link QualityDataType }
     * 
     */
    public QualityDataType createQualityDataType() {
        return new QualityDataType();
    }

    /**
     * Create an instance of {@link RequirementType }
     * 
     */
    public RequirementType createRequirementType() {
        return new RequirementType();
    }

    /**
     * Create an instance of {@link SampleType }
     * 
     */
    public SampleType createSampleType() {
        return new SampleType();
    }

    /**
     * Create an instance of {@link TestingDataType }
     * 
     */
    public TestingDataType createTestingDataType() {
        return new TestingDataType();
    }

    /**
     * Create an instance of {@link ValveType }
     * 
     */
    public ValveType createValveType() {
        return new ValveType();
    }

    /**
     * Create an instance of {@link CertificateOfAnalysisNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CertificateOfAnalysisNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06", name = "CertificateOfAnalysisNotification")
    public CertificateOfAnalysisNotification createCertificateOfAnalysisNotification(CertificateOfAnalysisNotificationType value) {
        return new CertificateOfAnalysisNotification(value);
    }

}
