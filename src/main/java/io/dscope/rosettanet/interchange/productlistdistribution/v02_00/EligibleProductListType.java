
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EligibleProductListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibleProductListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentIdentification" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}DocumentIdentificationType"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="CoreProductInformation" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}CoreProductInformationType"/&gt;
 *           &lt;element name="DeviceProductInformation" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}DeviceProductInformationType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "EligibleProductListType", propOrder = {
    "documentIdentification",
    "coreProductInformationOrDeviceProductInformation"
})
public class EligibleProductListType {

    @XmlElement(name = "DocumentIdentification", required = true)
    protected DocumentIdentificationType documentIdentification;
    @XmlElements({
        @XmlElement(name = "CoreProductInformation", type = CoreProductInformationType.class),
        @XmlElement(name = "DeviceProductInformation", type = DeviceProductInformationType.class)
    })
    protected List<Object> coreProductInformationOrDeviceProductInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the documentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentificationType }
     *     
     */
    public DocumentIdentificationType getDocumentIdentification() {
        return documentIdentification;
    }

    /**
     * Sets the value of the documentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentificationType }
     *     
     */
    public void setDocumentIdentification(DocumentIdentificationType value) {
        this.documentIdentification = value;
    }

    /**
     * Gets the value of the coreProductInformationOrDeviceProductInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coreProductInformationOrDeviceProductInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoreProductInformationOrDeviceProductInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreProductInformationType }
     * {@link DeviceProductInformationType }
     * 
     * 
     */
    public List<Object> getCoreProductInformationOrDeviceProductInformation() {
        if (coreProductInformationOrDeviceProductInformation == null) {
            coreProductInformationOrDeviceProductInformation = new ArrayList<Object>();
        }
        return this.coreProductInformationOrDeviceProductInformation;
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
