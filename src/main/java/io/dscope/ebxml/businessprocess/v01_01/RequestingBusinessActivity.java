
package io.dscope.ebxml.businessprocess.v01_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ebxml.org/BusinessProcess/1.01}BusinessAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}DocumentEnvelope"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="retryCount" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentEnvelope"
})
@XmlRootElement(name = "RequestingBusinessActivity")
public class RequestingBusinessActivity
    extends BusinessAction
{

    @XmlElement(name = "DocumentEnvelope", required = true)
    protected DocumentEnvelope documentEnvelope;
    @XmlAttribute(name = "retryCount")
    protected Integer retryCount;

    /**
     * Gets the value of the documentEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentEnvelope }
     *     
     */
    public DocumentEnvelope getDocumentEnvelope() {
        return documentEnvelope;
    }

    /**
     * Sets the value of the documentEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentEnvelope }
     *     
     */
    public void setDocumentEnvelope(DocumentEnvelope value) {
        this.documentEnvelope = value;
    }

    /**
     * Gets the value of the retryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * Sets the value of the retryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetryCount(Integer value) {
        this.retryCount = value;
    }

}
