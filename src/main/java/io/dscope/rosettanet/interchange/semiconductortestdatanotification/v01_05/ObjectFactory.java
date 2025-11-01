
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SemiconductorTestDataNotificationType }
     * 
     */
    public SemiconductorTestDataNotificationType createSemiconductorTestDataNotificationType() {
        return new SemiconductorTestDataNotificationType();
    }

    /**
     * Create an instance of {@link BALocationType }
     * 
     */
    public BALocationType createBALocationType() {
        return new BALocationType();
    }

    /**
     * Create an instance of {@link CalcFailReportType }
     * 
     */
    public CalcFailReportType createCalcFailReportType() {
        return new CalcFailReportType();
    }

    /**
     * Create an instance of {@link DieType }
     * 
     */
    public DieType createDieType() {
        return new DieType();
    }

    /**
     * Create an instance of {@link DieReportType }
     * 
     */
    public DieReportType createDieReportType() {
        return new DieReportType();
    }

    /**
     * Create an instance of {@link FabLocationType }
     * 
     */
    public FabLocationType createFabLocationType() {
        return new FabLocationType();
    }

    /**
     * Create an instance of {@link FinalTestType }
     * 
     */
    public FinalTestType createFinalTestType() {
        return new FinalTestType();
    }

    /**
     * Create an instance of {@link FinalTestLocationType }
     * 
     */
    public FinalTestLocationType createFinalTestLocationType() {
        return new FinalTestLocationType();
    }

    /**
     * Create an instance of {@link FPReportType }
     * 
     */
    public FPReportType createFPReportType() {
        return new FPReportType();
    }

    /**
     * Create an instance of {@link FunctionalPinReportType }
     * 
     */
    public FunctionalPinReportType createFunctionalPinReportType() {
        return new FunctionalPinReportType();
    }

    /**
     * Create an instance of {@link GangTestType }
     * 
     */
    public GangTestType createGangTestType() {
        return new GangTestType();
    }

    /**
     * Create an instance of {@link LotReportType }
     * 
     */
    public LotReportType createLotReportType() {
        return new LotReportType();
    }

    /**
     * Create an instance of {@link OtherLocationType }
     * 
     */
    public OtherLocationType createOtherLocationType() {
        return new OtherLocationType();
    }

    /**
     * Create an instance of {@link PCMType }
     * 
     */
    public PCMType createPCMType() {
        return new PCMType();
    }

    /**
     * Create an instance of {@link PPReportType }
     * 
     */
    public PPReportType createPPReportType() {
        return new PPReportType();
    }

    /**
     * Create an instance of {@link PPResultType }
     * 
     */
    public PPResultType createPPResultType() {
        return new PPResultType();
    }

    /**
     * Create an instance of {@link PRReportType }
     * 
     */
    public PRReportType createPRReportType() {
        return new PRReportType();
    }

    /**
     * Create an instance of {@link SetupReportType }
     * 
     */
    public SetupReportType createSetupReportType() {
        return new SetupReportType();
    }

    /**
     * Create an instance of {@link SortType }
     * 
     */
    public SortType createSortType() {
        return new SortType();
    }

    /**
     * Create an instance of {@link TestOperationDescriptionType }
     * 
     */
    public TestOperationDescriptionType createTestOperationDescriptionType() {
        return new TestOperationDescriptionType();
    }

    /**
     * Create an instance of {@link TestOpIdentificationType }
     * 
     */
    public TestOpIdentificationType createTestOpIdentificationType() {
        return new TestOpIdentificationType();
    }

    /**
     * Create an instance of {@link TestReportType }
     * 
     */
    public TestReportType createTestReportType() {
        return new TestReportType();
    }

    /**
     * Create an instance of {@link VectorReportType }
     * 
     */
    public VectorReportType createVectorReportType() {
        return new VectorReportType();
    }

    /**
     * Create an instance of {@link WaferSortType }
     * 
     */
    public WaferSortType createWaferSortType() {
        return new WaferSortType();
    }

    /**
     * Create an instance of {@link WaferSortLocationType }
     * 
     */
    public WaferSortLocationType createWaferSortLocationType() {
        return new WaferSortLocationType();
    }

    /**
     * Create an instance of {@link YieldReportType }
     * 
     */
    public YieldReportType createYieldReportType() {
        return new YieldReportType();
    }

    /**
     * Create an instance of {@link SemiconductorTestDataNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SemiconductorTestDataNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05", name = "SemiconductorTestDataNotification")
    public SemiconductorTestDataNotification createSemiconductorTestDataNotification(SemiconductorTestDataNotificationType value) {
        return new SemiconductorTestDataNotification(value);
    }

}
