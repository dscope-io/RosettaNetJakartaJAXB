
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.response.v01_03.Response;
import io.dscope.rosettanet.domain.procurement.codelist.revisionreason.v01_03.RevisionReason;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastProductScheduleType;


/**
 * <p>Java class for ForecastProductScheduleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastProductScheduleResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastProductScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:Response:xsd:codelist:01.03}Response"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:RevisionReason:xsd:codelist:01.03}RevisionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastProductScheduleResponseType", propOrder = {
    "response",
    "revisionReason"
})
public class ForecastProductScheduleResponseType
    extends ForecastProductScheduleType
{

    @XmlElementRef(name = "Response", namespace = "urn:rosettanet:specification:domain:Procurement:Response:xsd:codelist:01.03", type = Response.class)
    protected Response response;
    @XmlElementRef(name = "RevisionReason", namespace = "urn:rosettanet:specification:domain:Procurement:RevisionReason:xsd:codelist:01.03", type = RevisionReason.class, required = false)
    protected List<RevisionReason> revisionReason;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the revisionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revisionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevisionReason }
     * 
     * 
     */
    public List<RevisionReason> getRevisionReason() {
        if (revisionReason == null) {
            revisionReason = new ArrayList<RevisionReason>();
        }
        return this.revisionReason;
    }

}
