
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescriptionType;


/**
 * <p>Java class for PartnerProductReleaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerProductReleaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReleasePartnerDescription" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescriptionType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReleaseProduct" type="{urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00}ReleaseProductType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "PartnerProductReleaseType", propOrder = {
    "releasePartnerDescription",
    "releaseProduct"
})
public class PartnerProductReleaseType {

    @XmlElement(name = "ReleasePartnerDescription", required = true)
    protected List<PartnerDescriptionType> releasePartnerDescription;
    @XmlElement(name = "ReleaseProduct", required = true)
    protected List<ReleaseProductType> releaseProduct;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the releasePartnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releasePartnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleasePartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescriptionType }
     * 
     * 
     */
    public List<PartnerDescriptionType> getReleasePartnerDescription() {
        if (releasePartnerDescription == null) {
            releasePartnerDescription = new ArrayList<PartnerDescriptionType>();
        }
        return this.releasePartnerDescription;
    }

    /**
     * Gets the value of the releaseProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReleaseProductType }
     * 
     * 
     */
    public List<ReleaseProductType> getReleaseProduct() {
        if (releaseProduct == null) {
            releaseProduct = new ArrayList<ReleaseProductType>();
        }
        return this.releaseProduct;
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
