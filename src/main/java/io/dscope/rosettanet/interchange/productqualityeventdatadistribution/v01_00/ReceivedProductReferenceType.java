
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductReferenceType;


/**
 * <p>Java class for ReceivedProductReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceivedProductReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivedProductReferenceType", propOrder = {
    "receiptDate"
})
public class ReceivedProductReferenceType
    extends ProductReferenceType
{

    @XmlElement(name = "ReceiptDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

}
