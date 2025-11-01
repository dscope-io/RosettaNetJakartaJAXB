
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_04;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.LotQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.LotIdentification;


/**
 * <p>Java class for LotShipReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotShipReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}LotIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}LotQuantity" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ManufacturingDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LotShipReferenceType", propOrder = {
    "expiryDate",
    "lotIdentification",
    "lotQuantity",
    "manufacturingDateCode"
})
public class LotShipReferenceType {

    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = LotIdentification.class)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "LotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = LotQuantity.class)
    protected List<LotQuantity> lotQuantity;
    @XmlElement(name = "ManufacturingDateCode")
    protected String manufacturingDateCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

    /**
     * Gets the value of the lotQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotQuantity }
     * 
     * 
     */
    public List<LotQuantity> getLotQuantity() {
        if (lotQuantity == null) {
            lotQuantity = new ArrayList<LotQuantity>();
        }
        return this.lotQuantity;
    }

    /**
     * Gets the value of the manufacturingDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDateCode() {
        return manufacturingDateCode;
    }

    /**
     * Sets the value of the manufacturingDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDateCode(String value) {
        this.manufacturingDateCode = value;
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
