
package io.dscope.rosettanet.domain.service.service.v02_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.failureaction.v01_02.FailureAction;
import io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02.FailureModifier;
import io.dscope.rosettanet.domain.service.codelist.failureobservedcondition.v01_02.FailureObservedCondition;
import io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02.OperatingSystem;


/**
 * <p>Java class for FailureAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureAnalysisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02}FailureAction"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02}FailureModifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:FailureObservedCondition:xsd:codelist:01.02}FailureObservedCondition"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02}OperatingSystem"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureAnalysisType", propOrder = {
    "failureAction",
    "failureModifier",
    "failureObservedCondition",
    "operatingSystem"
})
public class FailureAnalysisType {

    @XmlElementRef(name = "FailureAction", namespace = "urn:rosettanet:specification:domain:Service:FailureAction:xsd:codelist:01.02", type = FailureAction.class)
    protected FailureAction failureAction;
    @XmlElementRef(name = "FailureModifier", namespace = "urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02", type = FailureModifier.class)
    protected FailureModifier failureModifier;
    @XmlElementRef(name = "FailureObservedCondition", namespace = "urn:rosettanet:specification:domain:Service:FailureObservedCondition:xsd:codelist:01.02", type = FailureObservedCondition.class)
    protected FailureObservedCondition failureObservedCondition;
    @XmlElementRef(name = "OperatingSystem", namespace = "urn:rosettanet:specification:domain:Service:OperatingSystem:xsd:codelist:01.02", type = OperatingSystem.class)
    protected OperatingSystem operatingSystem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the failureAction property.
     * 
     * @return
     *     possible object is
     *     {@link FailureAction }
     *     
     */
    public FailureAction getFailureAction() {
        return failureAction;
    }

    /**
     * Sets the value of the failureAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureAction }
     *     
     */
    public void setFailureAction(FailureAction value) {
        this.failureAction = value;
    }

    /**
     * Gets the value of the failureModifier property.
     * 
     * @return
     *     possible object is
     *     {@link FailureModifier }
     *     
     */
    public FailureModifier getFailureModifier() {
        return failureModifier;
    }

    /**
     * Sets the value of the failureModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureModifier }
     *     
     */
    public void setFailureModifier(FailureModifier value) {
        this.failureModifier = value;
    }

    /**
     * Gets the value of the failureObservedCondition property.
     * 
     * @return
     *     possible object is
     *     {@link FailureObservedCondition }
     *     
     */
    public FailureObservedCondition getFailureObservedCondition() {
        return failureObservedCondition;
    }

    /**
     * Sets the value of the failureObservedCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureObservedCondition }
     *     
     */
    public void setFailureObservedCondition(FailureObservedCondition value) {
        this.failureObservedCondition = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystem }
     *     
     */
    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystem }
     *     
     */
    public void setOperatingSystem(OperatingSystem value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
