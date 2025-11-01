
package io.dscope.rosettanet.domain.procurement.codelist.specialfulfillmentrequest.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialFulfillmentRequestContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SpecialFulfillmentRequestContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AQM"/&gt;
 *     &lt;enumeration value="BIG"/&gt;
 *     &lt;enumeration value="BON"/&gt;
 *     &lt;enumeration value="BOO"/&gt;
 *     &lt;enumeration value="BOS"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="CSD"/&gt;
 *     &lt;enumeration value="DNP"/&gt;
 *     &lt;enumeration value="DNS"/&gt;
 *     &lt;enumeration value="EIQ"/&gt;
 *     &lt;enumeration value="EPA"/&gt;
 *     &lt;enumeration value="FAS"/&gt;
 *     &lt;enumeration value="FIK"/&gt;
 *     &lt;enumeration value="GUS"/&gt;
 *     &lt;enumeration value="IIQ"/&gt;
 *     &lt;enumeration value="LPS"/&gt;
 *     &lt;enumeration value="LSA"/&gt;
 *     &lt;enumeration value="MAP"/&gt;
 *     &lt;enumeration value="MUD"/&gt;
 *     &lt;enumeration value="MYA"/&gt;
 *     &lt;enumeration value="NBO"/&gt;
 *     &lt;enumeration value="NOS"/&gt;
 *     &lt;enumeration value="NPS"/&gt;
 *     &lt;enumeration value="OQB"/&gt;
 *     &lt;enumeration value="OQM"/&gt;
 *     &lt;enumeration value="OUS"/&gt;
 *     &lt;enumeration value="PLS"/&gt;
 *     &lt;enumeration value="RAS"/&gt;
 *     &lt;enumeration value="REI"/&gt;
 *     &lt;enumeration value="RHB"/&gt;
 *     &lt;enumeration value="RIP"/&gt;
 *     &lt;enumeration value="RQP"/&gt;
 *     &lt;enumeration value="RUC"/&gt;
 *     &lt;enumeration value="RYI"/&gt;
 *     &lt;enumeration value="SA8"/&gt;
 *     &lt;enumeration value="SAI"/&gt;
 *     &lt;enumeration value="SAS"/&gt;
 *     &lt;enumeration value="SBA"/&gt;
 *     &lt;enumeration value="SBS"/&gt;
 *     &lt;enumeration value="SDS"/&gt;
 *     &lt;enumeration value="SFT"/&gt;
 *     &lt;enumeration value="SHC"/&gt;
 *     &lt;enumeration value="SIA"/&gt;
 *     &lt;enumeration value="SIP"/&gt;
 *     &lt;enumeration value="SMP"/&gt;
 *     &lt;enumeration value="SP1"/&gt;
 *     &lt;enumeration value="SP2"/&gt;
 *     &lt;enumeration value="SP3"/&gt;
 *     &lt;enumeration value="SP4"/&gt;
 *     &lt;enumeration value="SP5"/&gt;
 *     &lt;enumeration value="SP6"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="SPS"/&gt;
 *     &lt;enumeration value="SRA"/&gt;
 *     &lt;enumeration value="SRN"/&gt;
 *     &lt;enumeration value="URP"/&gt;
 *     &lt;enumeration value="WAR"/&gt;
 *     &lt;enumeration value="WHS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialFulfillmentRequestContentType")
@XmlEnum
public enum SpecialFulfillmentRequestContentType {

    AQM("AQM"),
    BIG("BIG"),
    BON("BON"),
    BOO("BOO"),
    BOS("BOS"),
    COM("COM"),
    CON("CON"),
    CSD("CSD"),
    DNP("DNP"),
    DNS("DNS"),
    EIQ("EIQ"),
    EPA("EPA"),
    FAS("FAS"),
    FIK("FIK"),
    GUS("GUS"),
    IIQ("IIQ"),
    LPS("LPS"),
    LSA("LSA"),
    MAP("MAP"),
    MUD("MUD"),
    MYA("MYA"),
    NBO("NBO"),
    NOS("NOS"),
    NPS("NPS"),
    OQB("OQB"),
    OQM("OQM"),
    OUS("OUS"),
    PLS("PLS"),
    RAS("RAS"),
    REI("REI"),
    RHB("RHB"),
    RIP("RIP"),
    RQP("RQP"),
    RUC("RUC"),
    RYI("RYI"),
    @XmlEnumValue("SA8")
    SA_8("SA8"),
    SAI("SAI"),
    SAS("SAS"),
    SBA("SBA"),
    SBS("SBS"),
    SDS("SDS"),
    SFT("SFT"),
    SHC("SHC"),
    SIA("SIA"),
    SIP("SIP"),
    SMP("SMP"),
    @XmlEnumValue("SP1")
    SP_1("SP1"),
    @XmlEnumValue("SP2")
    SP_2("SP2"),
    @XmlEnumValue("SP3")
    SP_3("SP3"),
    @XmlEnumValue("SP4")
    SP_4("SP4"),
    @XmlEnumValue("SP5")
    SP_5("SP5"),
    @XmlEnumValue("SP6")
    SP_6("SP6"),
    SPR("SPR"),
    SPS("SPS"),
    SRA("SRA"),
    SRN("SRN"),
    URP("URP"),
    WAR("WAR"),
    WHS("WHS");
    private final String value;

    SpecialFulfillmentRequestContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialFulfillmentRequestContentType fromValue(String v) {
        for (SpecialFulfillmentRequestContentType c: SpecialFulfillmentRequestContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
