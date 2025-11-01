
package io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxExemptionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaxExemptionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AGR"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="DIV"/&gt;
 *     &lt;enumeration value="DPI"/&gt;
 *     &lt;enumeration value="EFE"/&gt;
 *     &lt;enumeration value="EFR"/&gt;
 *     &lt;enumeration value="GST"/&gt;
 *     &lt;enumeration value="HOM"/&gt;
 *     &lt;enumeration value="LAE"/&gt;
 *     &lt;enumeration value="LOF"/&gt;
 *     &lt;enumeration value="LOS"/&gt;
 *     &lt;enumeration value="LPT"/&gt;
 *     &lt;enumeration value="MAE"/&gt;
 *     &lt;enumeration value="NE1"/&gt;
 *     &lt;enumeration value="NE2"/&gt;
 *     &lt;enumeration value="NFR"/&gt;
 *     &lt;enumeration value="NOH"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *     &lt;enumeration value="O65"/&gt;
 *     &lt;enumeration value="OPS"/&gt;
 *     &lt;enumeration value="OPT"/&gt;
 *     &lt;enumeration value="PSL"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *     &lt;enumeration value="REE"/&gt;
 *     &lt;enumeration value="SPT"/&gt;
 *     &lt;enumeration value="TOE"/&gt;
 *     &lt;enumeration value="TOS"/&gt;
 *     &lt;enumeration value="TPT"/&gt;
 *     &lt;enumeration value="USE"/&gt;
 *     &lt;enumeration value="USG"/&gt;
 *     &lt;enumeration value="WOF"/&gt;
 *     &lt;enumeration value="GND"/&gt;
 *     &lt;enumeration value="EVD"/&gt;
 *     &lt;enumeration value="SPD"/&gt;
 *     &lt;enumeration value="FAD"/&gt;
 *     &lt;enumeration value="OLR"/&gt;
 *     &lt;enumeration value="SRG"/&gt;
 *     &lt;enumeration value="FTZ"/&gt;
 *     &lt;enumeration value="OTZ"/&gt;
 *     &lt;enumeration value="SEG"/&gt;
 *     &lt;enumeration value="TNT"/&gt;
 *     &lt;enumeration value="MNE"/&gt;
 *     &lt;enumeration value="IFS"/&gt;
 *     &lt;enumeration value="AQT"/&gt;
 *     &lt;enumeration value="NTL"/&gt;
 *     &lt;enumeration value="EVI"/&gt;
 *     &lt;enumeration value="OSV"/&gt;
 *     &lt;enumeration value="ITS"/&gt;
 *     &lt;enumeration value="IGC"/&gt;
 *     &lt;enumeration value="ITA"/&gt;
 *     &lt;enumeration value="MFE"/&gt;
 *     &lt;enumeration value="CSM"/&gt;
 *     &lt;enumeration value="IMM"/&gt;
 *     &lt;enumeration value="BTL"/&gt;
 *     &lt;enumeration value="OPA"/&gt;
 *     &lt;enumeration value="LFV"/&gt;
 *     &lt;enumeration value="LFC"/&gt;
 *     &lt;enumeration value="FFE"/&gt;
 *     &lt;enumeration value="MPT"/&gt;
 *     &lt;enumeration value="LPT"/&gt;
 *     &lt;enumeration value="LON"/&gt;
 *     &lt;enumeration value="LOS"/&gt;
 *     &lt;enumeration value="ICT"/&gt;
 *     &lt;enumeration value="SFD"/&gt;
 *     &lt;enumeration value="NDF"/&gt;
 *     &lt;enumeration value="DRD"/&gt;
 *     &lt;enumeration value="CRT"/&gt;
 *     &lt;enumeration value="IET"/&gt;
 *     &lt;enumeration value="EXC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxExemptionCodeContentType")
@XmlEnum
public enum TaxExemptionCodeContentType {

    AGR("AGR"),
    CPT("CPT"),
    DIS("DIS"),
    DIV("DIV"),
    DPI("DPI"),
    EFE("EFE"),
    EFR("EFR"),
    GST("GST"),
    HOM("HOM"),
    LAE("LAE"),
    LOF("LOF"),
    LOS("LOS"),
    LPT("LPT"),
    MAE("MAE"),
    @XmlEnumValue("NE1")
    NE_1("NE1"),
    @XmlEnumValue("NE2")
    NE_2("NE2"),
    NFR("NFR"),
    NOH("NOH"),
    NOT("NOT"),
    @XmlEnumValue("O65")
    O_65("O65"),
    OPS("OPS"),
    OPT("OPT"),
    PSL("PSL"),
    PST("PST"),
    REE("REE"),
    SPT("SPT"),
    TOE("TOE"),
    TOS("TOS"),
    TPT("TPT"),
    USE("USE"),
    USG("USG"),
    WOF("WOF"),
    GND("GND"),
    EVD("EVD"),
    SPD("SPD"),
    FAD("FAD"),
    OLR("OLR"),
    SRG("SRG"),
    FTZ("FTZ"),
    OTZ("OTZ"),
    SEG("SEG"),
    TNT("TNT"),
    MNE("MNE"),
    IFS("IFS"),
    AQT("AQT"),
    NTL("NTL"),
    EVI("EVI"),
    OSV("OSV"),
    ITS("ITS"),
    IGC("IGC"),
    ITA("ITA"),
    MFE("MFE"),
    CSM("CSM"),
    IMM("IMM"),
    BTL("BTL"),
    OPA("OPA"),
    LFV("LFV"),
    LFC("LFC"),
    FFE("FFE"),
    MPT("MPT"),
    LON("LON"),
    ICT("ICT"),
    SFD("SFD"),
    NDF("NDF"),
    DRD("DRD"),
    CRT("CRT"),
    IET("IET"),
    EXC("EXC");
    private final String value;

    TaxExemptionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxExemptionCodeContentType fromValue(String v) {
        for (TaxExemptionCodeContentType c: TaxExemptionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
