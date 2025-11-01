
package io.dscope.rosettanet.domain.logistics.logistics.v02_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShippingLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingLabelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BarcodeInstruction" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}LabelInstructionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}LabelServiceContent" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInstruction" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}LabelInstructionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueAddedService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingLabelType", propOrder = {
    "barcodeInstruction",
    "description",
    "labelServiceContent",
    "routingInstruction",
    "serviceAccountNumber",
    "serviceText",
    "valueAddedService"
})
public class ShippingLabelType {

    @XmlElement(name = "BarcodeInstruction")
    protected List<LabelInstructionType> barcodeInstruction;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "LabelServiceContent", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = LabelServiceContent.class, required = false)
    protected LabelServiceContent labelServiceContent;
    @XmlElement(name = "RoutingInstruction")
    protected List<LabelInstructionType> routingInstruction;
    @XmlElement(name = "ServiceAccountNumber")
    protected String serviceAccountNumber;
    @XmlElement(name = "ServiceText")
    protected String serviceText;
    @XmlElement(name = "ValueAddedService")
    protected String valueAddedService;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the barcodeInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barcodeInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarcodeInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelInstructionType }
     * 
     * 
     */
    public List<LabelInstructionType> getBarcodeInstruction() {
        if (barcodeInstruction == null) {
            barcodeInstruction = new ArrayList<LabelInstructionType>();
        }
        return this.barcodeInstruction;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the labelServiceContent property.
     * 
     * @return
     *     possible object is
     *     {@link LabelServiceContent }
     *     
     */
    public LabelServiceContent getLabelServiceContent() {
        return labelServiceContent;
    }

    /**
     * Sets the value of the labelServiceContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelServiceContent }
     *     
     */
    public void setLabelServiceContent(LabelServiceContent value) {
        this.labelServiceContent = value;
    }

    /**
     * Gets the value of the routingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelInstructionType }
     * 
     * 
     */
    public List<LabelInstructionType> getRoutingInstruction() {
        if (routingInstruction == null) {
            routingInstruction = new ArrayList<LabelInstructionType>();
        }
        return this.routingInstruction;
    }

    /**
     * Gets the value of the serviceAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAccountNumber() {
        return serviceAccountNumber;
    }

    /**
     * Sets the value of the serviceAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAccountNumber(String value) {
        this.serviceAccountNumber = value;
    }

    /**
     * Gets the value of the serviceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceText() {
        return serviceText;
    }

    /**
     * Sets the value of the serviceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceText(String value) {
        this.serviceText = value;
    }

    /**
     * Gets the value of the valueAddedService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddedService() {
        return valueAddedService;
    }

    /**
     * Sets the value of the valueAddedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddedService(String value) {
        this.valueAddedService = value;
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
