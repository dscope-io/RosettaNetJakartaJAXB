
package io.dscope.rosettanet.universal.physicaldimension.v01_07;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.physicaldimension.v01_07 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.physicaldimension.v01_07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LinearType }
     * 
     */
    public LinearType createLinearType() {
        return new LinearType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link VolumeType }
     * 
     */
    public VolumeType createVolumeType() {
        return new VolumeType();
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link Linear }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Linear }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", name = "Linear")
    public Linear createLinear(LinearType value) {
        return new Linear(value);
    }

    /**
     * Create an instance of {@link Measure }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Measure }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", name = "Measure")
    public Measure createMeasure(MeasureType value) {
        return new Measure(value);
    }

    /**
     * Create an instance of {@link Volume }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Volume }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", name = "Volume")
    public Volume createVolume(VolumeType value) {
        return new Volume(value);
    }

    /**
     * Create an instance of {@link Weight }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Weight }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", name = "Weight")
    public Weight createWeight(WeightType value) {
        return new Weight(value);
    }

}
