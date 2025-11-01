
package io.dscope.rosettanet.domain.procurement.codelist.salesreportdiscrepancycode.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesReportDiscrepancyCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SalesReportDiscrepancyCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DIN"/&gt;
 *     &lt;enumeration value="DLZ"/&gt;
 *     &lt;enumeration value="DNR"/&gt;
 *     &lt;enumeration value="DRF"/&gt;
 *     &lt;enumeration value="DXP"/&gt;
 *     &lt;enumeration value="ICR"/&gt;
 *     &lt;enumeration value="IPN"/&gt;
 *     &lt;enumeration value="IRC"/&gt;
 *     &lt;enumeration value="ISN"/&gt;
 *     &lt;enumeration value="ITC"/&gt;
 *     &lt;enumeration value="MCR"/&gt;
 *     &lt;enumeration value="MCX"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MDR"/&gt;
 *     &lt;enumeration value="MIL"/&gt;
 *     &lt;enumeration value="MIN"/&gt;
 *     &lt;enumeration value="MPN"/&gt;
 *     &lt;enumeration value="MQS"/&gt;
 *     &lt;enumeration value="MRC"/&gt;
 *     &lt;enumeration value="MRP"/&gt;
 *     &lt;enumeration value="MSD"/&gt;
 *     &lt;enumeration value="MTC"/&gt;
 *     &lt;enumeration value="ONF"/&gt;
 *     &lt;enumeration value="PDO"/&gt;
 *     &lt;enumeration value="PNE"/&gt;
 *     &lt;enumeration value="PSF"/&gt;
 *     &lt;enumeration value="PXL"/&gt;
 *     &lt;enumeration value="RCD"/&gt;
 *     &lt;enumeration value="RCL"/&gt;
 *     &lt;enumeration value="RNA"/&gt;
 *     &lt;enumeration value="RNF"/&gt;
 *     &lt;enumeration value="SDF"/&gt;
 *     &lt;enumeration value="SDL"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="XAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SalesReportDiscrepancyCodeContentType")
@XmlEnum
public enum SalesReportDiscrepancyCodeContentType {

    DIN,
    DLZ,
    DNR,
    DRF,
    DXP,
    ICR,
    IPN,
    IRC,
    ISN,
    ITC,
    MCR,
    MCX,
    MDL,
    MDR,
    MIL,
    MIN,
    MPN,
    MQS,
    MRC,
    MRP,
    MSD,
    MTC,
    ONF,
    PDO,
    PNE,
    PSF,
    PXL,
    RCD,
    RCL,
    RNA,
    RNF,
    SDF,
    SDL,
    SDP,
    XAP;

    public String value() {
        return name();
    }

    public static SalesReportDiscrepancyCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
