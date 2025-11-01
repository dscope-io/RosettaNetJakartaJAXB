
package io.dscope.rosettanet.domain.procurement.procurement.v02_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_03.ForecastReferenceType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;


/**
 * <p>Java class for ForecastIdentifierReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastIdentifierReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03}ForecastReferenceType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastIdentifierReferenceType", propOrder = {
    "forecastReferenceType"
})
public class ForecastIdentifierReferenceType
    extends BusinessDocumentReferenceType
{

    @XmlElementRef(name = "ForecastReferenceType", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03", type = ForecastReferenceType.class)
    protected ForecastReferenceType forecastReferenceType;

    /**
     * Gets the value of the forecastReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastReferenceType }
     *     
     */
    public ForecastReferenceType getForecastReferenceType() {
        return forecastReferenceType;
    }

    /**
     * Sets the value of the forecastReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastReferenceType }
     *     
     */
    public void setForecastReferenceType(ForecastReferenceType value) {
        this.forecastReferenceType = value;
    }

}
