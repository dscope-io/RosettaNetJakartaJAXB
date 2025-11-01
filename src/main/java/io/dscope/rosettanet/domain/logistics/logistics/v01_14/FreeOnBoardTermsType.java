
package io.dscope.rosettanet.domain.logistics.logistics.v01_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.freeonboard.v01_03.FreeOnBoard;
import io.dscope.rosettanet.universal.locations.v01_02.PhysicalAddress;


/**
 * <p>Java class for FreeOnBoardTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeOnBoardTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:FreeOnBoard:xsd:codelist:01.03}FreeOnBoard"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}PhysicalAddress" minOccurs="0"/&gt;
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
@XmlType(name = "FreeOnBoardTermsType", propOrder = {
    "freeOnBoard",
    "physicalAddress"
})
public class FreeOnBoardTermsType {

    @XmlElementRef(name = "FreeOnBoard", namespace = "urn:rosettanet:specification:domain:Procurement:FreeOnBoard:xsd:codelist:01.03", type = FreeOnBoard.class)
    protected FreeOnBoard freeOnBoard;
    @XmlElementRef(name = "PhysicalAddress", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = PhysicalAddress.class, required = false)
    protected PhysicalAddress physicalAddress;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the freeOnBoard property.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoard }
     *     
     */
    public FreeOnBoard getFreeOnBoard() {
        return freeOnBoard;
    }

    /**
     * Sets the value of the freeOnBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoard }
     *     
     */
    public void setFreeOnBoard(FreeOnBoard value) {
        this.freeOnBoard = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalAddress value) {
        this.physicalAddress = value;
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
