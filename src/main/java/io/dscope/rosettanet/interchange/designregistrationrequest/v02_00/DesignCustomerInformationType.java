
package io.dscope.rosettanet.interchange.designregistrationrequest.v02_00;

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
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


/**
 * <p>Java class for DesignCustomerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignCustomerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignCustomerDistributorBranch" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNSPlus4Type" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PointOfSaleCustomerDistributorBranch" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNSPlus4Type" minOccurs="0"/&gt;
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
@XmlType(name = "DesignCustomerInformationType", propOrder = {
    "designCustomerDistributorBranch",
    "partnerDescription",
    "pointOfSaleCustomerDistributorBranch"
})
public class DesignCustomerInformationType {

    @XmlElement(name = "DesignCustomerDistributorBranch")
    protected String designCustomerDistributorBranch;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "PointOfSaleCustomerDistributorBranch")
    protected String pointOfSaleCustomerDistributorBranch;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designCustomerDistributorBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignCustomerDistributorBranch() {
        return designCustomerDistributorBranch;
    }

    /**
     * Sets the value of the designCustomerDistributorBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignCustomerDistributorBranch(String value) {
        this.designCustomerDistributorBranch = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the pointOfSaleCustomerDistributorBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCustomerDistributorBranch() {
        return pointOfSaleCustomerDistributorBranch;
    }

    /**
     * Sets the value of the pointOfSaleCustomerDistributorBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCustomerDistributorBranch(String value) {
        this.pointOfSaleCustomerDistributorBranch = value;
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
