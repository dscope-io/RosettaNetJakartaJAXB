
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02.ProjectMarketSegment;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescription;


/**
 * <p>Java class for DesignProjectDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignProjectDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProjectComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02}ProjectMarketSegment" minOccurs="0"/&gt;
 *         &lt;element name="ProjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescription" minOccurs="0"/&gt;
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
@XmlType(name = "DesignProjectDescriptionType", propOrder = {
    "projectComments",
    "projectMarketSegment",
    "projectName",
    "textualDescription"
})
public class DesignProjectDescriptionType {

    @XmlElement(name = "ProjectComments")
    protected String projectComments;
    @XmlElementRef(name = "ProjectMarketSegment", namespace = "urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02", type = ProjectMarketSegment.class, required = false)
    protected ProjectMarketSegment projectMarketSegment;
    @XmlElement(name = "ProjectName")
    protected String projectName;
    @XmlElementRef(name = "TextualDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = TextualDescription.class, required = false)
    protected TextualDescription textualDescription;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the projectComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectComments() {
        return projectComments;
    }

    /**
     * Sets the value of the projectComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectComments(String value) {
        this.projectComments = value;
    }

    /**
     * Gets the value of the projectMarketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectMarketSegment }
     *     
     */
    public ProjectMarketSegment getProjectMarketSegment() {
        return projectMarketSegment;
    }

    /**
     * Sets the value of the projectMarketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectMarketSegment }
     *     
     */
    public void setProjectMarketSegment(ProjectMarketSegment value) {
        this.projectMarketSegment = value;
    }

    /**
     * Gets the value of the projectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the value of the projectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * Gets the value of the textualDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescription }
     *     
     */
    public TextualDescription getTextualDescription() {
        return textualDescription;
    }

    /**
     * Sets the value of the textualDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescription }
     *     
     */
    public void setTextualDescription(TextualDescription value) {
        this.textualDescription = value;
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
