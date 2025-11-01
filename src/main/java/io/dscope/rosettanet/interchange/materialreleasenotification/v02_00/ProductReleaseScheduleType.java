
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_03.TransportEvent;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductQuantity;
import io.dscope.rosettanet.universal.monetaryexpression.v01_04.FinancialAmountType;


/**
 * <p>Java class for ProductReleaseScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductReleaseScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JustInTimeSchedule" type="{urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00}JustInTimeScheduleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantity"/&gt;
 *         &lt;element name="ReleaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03}TransportEvent"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductReleaseScheduleType", propOrder = {
    "justInTimeSchedule",
    "materialReleaseDate",
    "productQuantity",
    "releaseNumber",
    "transportEvent",
    "unitPrice"
})
public class ProductReleaseScheduleType {

    @XmlElement(name = "JustInTimeSchedule")
    protected List<JustInTimeScheduleType> justInTimeSchedule;
    @XmlElement(name = "MaterialReleaseDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar materialReleaseDate;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElement(name = "ReleaseNumber")
    protected String releaseNumber;
    @XmlElementRef(name = "TransportEvent", namespace = "urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03", type = TransportEvent.class)
    protected TransportEvent transportEvent;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the justInTimeSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justInTimeSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustInTimeSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JustInTimeScheduleType }
     * 
     * 
     */
    public List<JustInTimeScheduleType> getJustInTimeSchedule() {
        if (justInTimeSchedule == null) {
            justInTimeSchedule = new ArrayList<JustInTimeScheduleType>();
        }
        return this.justInTimeSchedule;
    }

    /**
     * Gets the value of the materialReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaterialReleaseDate() {
        return materialReleaseDate;
    }

    /**
     * Sets the value of the materialReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaterialReleaseDate(XMLGregorianCalendar value) {
        this.materialReleaseDate = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the releaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNumber() {
        return releaseNumber;
    }

    /**
     * Sets the value of the releaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNumber(String value) {
        this.releaseNumber = value;
    }

    /**
     * Gets the value of the transportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEvent }
     *     
     */
    public TransportEvent getTransportEvent() {
        return transportEvent;
    }

    /**
     * Sets the value of the transportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEvent }
     *     
     */
    public void setTransportEvent(TransportEvent value) {
        this.transportEvent = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
