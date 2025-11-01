
package io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProblemTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProblemTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProblemClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProblemSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProblemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ProblemTypeType", propOrder = {
    "problemClassification",
    "problemSubtype",
    "problemType"
})
public class ProblemTypeType {

    @XmlElement(name = "ProblemClassification")
    protected String problemClassification;
    @XmlElement(name = "ProblemSubtype")
    protected String problemSubtype;
    @XmlElement(name = "ProblemType")
    protected String problemType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the problemClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemClassification() {
        return problemClassification;
    }

    /**
     * Sets the value of the problemClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemClassification(String value) {
        this.problemClassification = value;
    }

    /**
     * Gets the value of the problemSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemSubtype() {
        return problemSubtype;
    }

    /**
     * Sets the value of the problemSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemSubtype(String value) {
        this.problemSubtype = value;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemType(String value) {
        this.problemType = value;
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
