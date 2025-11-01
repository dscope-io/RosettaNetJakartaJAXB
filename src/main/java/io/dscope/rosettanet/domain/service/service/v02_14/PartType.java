
package io.dscope.rosettanet.domain.service.service.v02_14;

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
 * <p>Java class for PartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.14}ReplacedPart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PartType", propOrder = {
    "list",
    "replacedPart",
    "warehouseID"
})
public class PartType {

    @XmlElement(name = "List", required = true)
    protected String list;
    @XmlElementRef(name = "ReplacedPart", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.14", type = ReplacedPart.class, required = false)
    protected List<ReplacedPart> replacedPart;
    @XmlElement(name = "WarehouseID")
    protected String warehouseID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setList(String value) {
        this.list = value;
    }

    /**
     * Gets the value of the replacedPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacedPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacedPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplacedPart }
     * 
     * 
     */
    public List<ReplacedPart> getReplacedPart() {
        if (replacedPart == null) {
            replacedPart = new ArrayList<ReplacedPart>();
        }
        return this.replacedPart;
    }

    /**
     * Gets the value of the warehouseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseID() {
        return warehouseID;
    }

    /**
     * Sets the value of the warehouseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseID(String value) {
        this.warehouseID = value;
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
