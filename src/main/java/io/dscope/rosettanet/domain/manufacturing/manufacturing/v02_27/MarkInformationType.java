
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_03.MarkSide;
import io.dscope.rosettanet.domain.manufacturing.codelist.marktype.v01_03.MarkType;


/**
 * <p>Java class for MarkInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}MarkingContents" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:01.03}MarkSide" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:MarkType:xsd:codelist:01.03}MarkType" minOccurs="0"/&gt;
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
@XmlType(name = "MarkInformationType", propOrder = {
    "markingContents",
    "markSide",
    "markType"
})
public class MarkInformationType {

    @XmlElementRef(name = "MarkingContents", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = MarkingContents.class)
    protected List<MarkingContents> markingContents;
    @XmlElementRef(name = "MarkSide", namespace = "urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:01.03", type = MarkSide.class, required = false)
    protected MarkSide markSide;
    @XmlElementRef(name = "MarkType", namespace = "urn:rosettanet:specification:domain:Manufacturing:MarkType:xsd:codelist:01.03", type = MarkType.class, required = false)
    protected MarkType markType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the markingContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markingContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkingContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkingContents }
     * 
     * 
     */
    public List<MarkingContents> getMarkingContents() {
        if (markingContents == null) {
            markingContents = new ArrayList<MarkingContents>();
        }
        return this.markingContents;
    }

    /**
     * Gets the value of the markSide property.
     * 
     * @return
     *     possible object is
     *     {@link MarkSide }
     *     
     */
    public MarkSide getMarkSide() {
        return markSide;
    }

    /**
     * Sets the value of the markSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkSide }
     *     
     */
    public void setMarkSide(MarkSide value) {
        this.markSide = value;
    }

    /**
     * Gets the value of the markType property.
     * 
     * @return
     *     possible object is
     *     {@link MarkType }
     *     
     */
    public MarkType getMarkType() {
        return markType;
    }

    /**
     * Sets the value of the markType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkType }
     *     
     */
    public void setMarkType(MarkType value) {
        this.markType = value;
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
