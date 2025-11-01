
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;


/**
 * <p>Java class for DocumentSubLineLotShipReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSubLineLotShipReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotShipReference" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.04}LotShipReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ShippedLotQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSubLineLotShipReferenceType", propOrder = {
    "lotShipReference",
    "requestedQuantity",
    "shippedLotQuantity"
})
public class DocumentSubLineLotShipReferenceType
    extends BusinessDocumentReferenceType
{

    @XmlElement(name = "LotShipReference")
    protected List<LotShipReferenceType> lotShipReference;
    @XmlElement(name = "RequestedQuantity")
    protected Float requestedQuantity;
    @XmlElement(name = "ShippedLotQuantity")
    protected float shippedLotQuantity;

    /**
     * Gets the value of the lotShipReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotShipReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotShipReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotShipReferenceType }
     * 
     * 
     */
    public List<LotShipReferenceType> getLotShipReference() {
        if (lotShipReference == null) {
            lotShipReference = new ArrayList<LotShipReferenceType>();
        }
        return this.lotShipReference;
    }

    /**
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedQuantity(Float value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the shippedLotQuantity property.
     * 
     */
    public float getShippedLotQuantity() {
        return shippedLotQuantity;
    }

    /**
     * Sets the value of the shippedLotQuantity property.
     * 
     */
    public void setShippedLotQuantity(float value) {
        this.shippedLotQuantity = value;
    }

}
