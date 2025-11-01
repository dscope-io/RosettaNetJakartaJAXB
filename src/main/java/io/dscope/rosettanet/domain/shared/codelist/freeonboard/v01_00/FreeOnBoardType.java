
package io.dscope.rosettanet.domain.shared.codelist.freeonboard.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FreeOnBoardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeOnBoardType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.00&gt;FreeOnBoardContentType"&gt;
 *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}token" fixed="FreeOnBoard" /&gt;
 *       &lt;attribute name="codeListVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="01.00" /&gt;
 *       &lt;attribute name="agency" type="{http://www.w3.org/2001/XMLSchema}token" fixed="RosettaNet" /&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeOnBoardType", propOrder = {
    "value"
})
public class FreeOnBoardType {

    @XmlValue
    protected FreeOnBoardContentType value;
    @XmlAttribute(name = "identifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifier;
    @XmlAttribute(name = "codeListVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeListVersion;
    @XmlAttribute(name = "agency")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String agency;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoardContentType }
     *     
     */
    public FreeOnBoardContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoardContentType }
     *     
     */
    public void setValue(FreeOnBoardContentType value) {
        this.value = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        if (identifier == null) {
            return "FreeOnBoard";
        } else {
            return identifier;
        }
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the codeListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListVersion() {
        if (codeListVersion == null) {
            return "01.00";
        } else {
            return codeListVersion;
        }
    }

    /**
     * Sets the value of the codeListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListVersion(String value) {
        this.codeListVersion = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        if (agency == null) {
            return "RosettaNet";
        } else {
            return agency;
        }
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
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
