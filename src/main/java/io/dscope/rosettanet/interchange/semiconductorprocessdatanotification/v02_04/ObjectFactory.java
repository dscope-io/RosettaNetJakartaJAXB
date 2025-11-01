
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SemiconductorProcessDataNotificationType }
     * 
     */
    public SemiconductorProcessDataNotificationType createSemiconductorProcessDataNotificationType() {
        return new SemiconductorProcessDataNotificationType();
    }

    /**
     * Create an instance of {@link AssemblyLotReportType }
     * 
     */
    public AssemblyLotReportType createAssemblyLotReportType() {
        return new AssemblyLotReportType();
    }

    /**
     * Create an instance of {@link AssemblyMeasurementReportType }
     * 
     */
    public AssemblyMeasurementReportType createAssemblyMeasurementReportType() {
        return new AssemblyMeasurementReportType();
    }

    /**
     * Create an instance of {@link AssemblyProcessType }
     * 
     */
    public AssemblyProcessType createAssemblyProcessType() {
        return new AssemblyProcessType();
    }

    /**
     * Create an instance of {@link CarrierReportType }
     * 
     */
    public CarrierReportType createCarrierReportType() {
        return new CarrierReportType();
    }

    /**
     * Create an instance of {@link CarrierSlotType }
     * 
     */
    public CarrierSlotType createCarrierSlotType() {
        return new CarrierSlotType();
    }

    /**
     * Create an instance of {@link ChipType }
     * 
     */
    public ChipType createChipType() {
        return new ChipType();
    }

    /**
     * Create an instance of {@link DefectInformationType }
     * 
     */
    public DefectInformationType createDefectInformationType() {
        return new DefectInformationType();
    }

    /**
     * Create an instance of {@link IncomingWaferLotReportType }
     * 
     */
    public IncomingWaferLotReportType createIncomingWaferLotReportType() {
        return new IncomingWaferLotReportType();
    }

    /**
     * Create an instance of {@link InlineProcessType }
     * 
     */
    public InlineProcessType createInlineProcessType() {
        return new InlineProcessType();
    }

    /**
     * Create an instance of {@link InlineProcessMeasurementReportType }
     * 
     */
    public InlineProcessMeasurementReportType createInlineProcessMeasurementReportType() {
        return new InlineProcessMeasurementReportType();
    }

    /**
     * Create an instance of {@link InlineSetupReportType }
     * 
     */
    public InlineSetupReportType createInlineSetupReportType() {
        return new InlineSetupReportType();
    }

    /**
     * Create an instance of {@link LotReportType }
     * 
     */
    public LotReportType createLotReportType() {
        return new LotReportType();
    }

    /**
     * Create an instance of {@link LotTimeStampType }
     * 
     */
    public LotTimeStampType createLotTimeStampType() {
        return new LotTimeStampType();
    }

    /**
     * Create an instance of {@link MeasurementFeatureReportType }
     * 
     */
    public MeasurementFeatureReportType createMeasurementFeatureReportType() {
        return new MeasurementFeatureReportType();
    }

    /**
     * Create an instance of {@link MeasurementReportType }
     * 
     */
    public MeasurementReportType createMeasurementReportType() {
        return new MeasurementReportType();
    }

    /**
     * Create an instance of {@link OperationInformationReportType }
     * 
     */
    public OperationInformationReportType createOperationInformationReportType() {
        return new OperationInformationReportType();
    }

    /**
     * Create an instance of {@link OpticalInspectionReportType }
     * 
     */
    public OpticalInspectionReportType createOpticalInspectionReportType() {
        return new OpticalInspectionReportType();
    }

    /**
     * Create an instance of {@link OrientationType }
     * 
     */
    public OrientationType createOrientationType() {
        return new OrientationType();
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link PackageReportType }
     * 
     */
    public PackageReportType createPackageReportType() {
        return new PackageReportType();
    }

    /**
     * Create an instance of {@link PinInformationType }
     * 
     */
    public PinInformationType createPinInformationType() {
        return new PinInformationType();
    }

    /**
     * Create an instance of {@link TestParameterInformationType }
     * 
     */
    public TestParameterInformationType createTestParameterInformationType() {
        return new TestParameterInformationType();
    }

    /**
     * Create an instance of {@link SemiconductorProcessDataNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SemiconductorProcessDataNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04", name = "SemiconductorProcessDataNotification")
    public SemiconductorProcessDataNotification createSemiconductorProcessDataNotification(SemiconductorProcessDataNotificationType value) {
        return new SemiconductorProcessDataNotification(value);
    }

}
