
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

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
import io.dscope.rosettanet.domain.shared.shared.v01_10.Warranty;


/**
 * <p>Java class for MarketingInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketingInstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ChangeNotification" minOccurs="0"/&gt;
 *         &lt;element name="PartActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}Warranty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MarketingInstructionType", propOrder = {
    "changeNotification",
    "partActivityIndicator",
    "warranty"
})
public class MarketingInstructionType {

    @XmlElementRef(name = "ChangeNotification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ChangeNotification.class, required = false)
    protected ChangeNotification changeNotification;
    @XmlElement(name = "PartActivityIndicator")
    protected String partActivityIndicator;
    @XmlElementRef(name = "Warranty", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = Warranty.class, required = false)
    protected List<Warranty> warranty;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the changeNotification property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeNotification }
     *     
     */
    public ChangeNotification getChangeNotification() {
        return changeNotification;
    }

    /**
     * Sets the value of the changeNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeNotification }
     *     
     */
    public void setChangeNotification(ChangeNotification value) {
        this.changeNotification = value;
    }

    /**
     * Gets the value of the partActivityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartActivityIndicator() {
        return partActivityIndicator;
    }

    /**
     * Sets the value of the partActivityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartActivityIndicator(String value) {
        this.partActivityIndicator = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warranty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarranty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Warranty }
     * 
     * 
     */
    public List<Warranty> getWarranty() {
        if (warranty == null) {
            warranty = new ArrayList<Warranty>();
        }
        return this.warranty;
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
