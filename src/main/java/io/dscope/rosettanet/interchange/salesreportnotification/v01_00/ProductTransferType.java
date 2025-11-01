
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

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
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ParticipatingPartner;


/**
 * <p>Java class for ProductTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTransferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ParticipatingPartner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesReportLineItem" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0}SalesReportLineItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTransferType", propOrder = {
    "participatingPartner",
    "salesReportLineItem"
})
public class ProductTransferType {

    @XmlElementRef(name = "ParticipatingPartner", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ParticipatingPartner.class, required = false)
    protected List<ParticipatingPartner> participatingPartner;
    @XmlElement(name = "SalesReportLineItem", required = true)
    protected List<SalesReportLineItemType> salesReportLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the participatingPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipatingPartner }
     * 
     * 
     */
    public List<ParticipatingPartner> getParticipatingPartner() {
        if (participatingPartner == null) {
            participatingPartner = new ArrayList<ParticipatingPartner>();
        }
        return this.participatingPartner;
    }

    /**
     * Gets the value of the salesReportLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesReportLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesReportLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesReportLineItemType }
     * 
     * 
     */
    public List<SalesReportLineItemType> getSalesReportLineItem() {
        if (salesReportLineItem == null) {
            salesReportLineItem = new ArrayList<SalesReportLineItemType>();
        }
        return this.salesReportLineItem;
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
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
