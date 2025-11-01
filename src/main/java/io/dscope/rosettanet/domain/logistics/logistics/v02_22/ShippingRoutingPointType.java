
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_03.RouteLocation;


/**
 * <p>Java class for ShippingRoutingPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingRoutingPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.03}RouteLocation"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}PortAddress"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}PortIdentification"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "ShippingRoutingPointType", propOrder = {
    "routeLocation",
    "portAddress",
    "portIdentification"
})
public class ShippingRoutingPointType {

    @XmlElementRef(name = "RouteLocation", namespace = "urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.03", type = RouteLocation.class)
    protected RouteLocation routeLocation;
    @XmlElementRef(name = "PortAddress", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = PortAddress.class, required = false)
    protected PortAddress portAddress;
    @XmlElementRef(name = "PortIdentification", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = PortIdentification.class, required = false)
    protected PortIdentification portIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the routeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RouteLocation }
     *     
     */
    public RouteLocation getRouteLocation() {
        return routeLocation;
    }

    /**
     * Sets the value of the routeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteLocation }
     *     
     */
    public void setRouteLocation(RouteLocation value) {
        this.routeLocation = value;
    }

    /**
     * Gets the value of the portAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PortAddress }
     *     
     */
    public PortAddress getPortAddress() {
        return portAddress;
    }

    /**
     * Sets the value of the portAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortAddress }
     *     
     */
    public void setPortAddress(PortAddress value) {
        this.portAddress = value;
    }

    /**
     * Gets the value of the portIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PortIdentification }
     *     
     */
    public PortIdentification getPortIdentification() {
        return portIdentification;
    }

    /**
     * Sets the value of the portIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortIdentification }
     *     
     */
    public void setPortIdentification(PortIdentification value) {
        this.portIdentification = value;
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
