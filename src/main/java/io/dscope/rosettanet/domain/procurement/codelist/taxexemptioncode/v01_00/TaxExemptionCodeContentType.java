
package io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_00;

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
 *     &lt;enumeration value="LOF"/&gt;
 *     &lt;enumeration value="DPI"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="DIV"/&gt;
 *     &lt;enumeration value="EFE"/&gt;
 *     &lt;enumeration value="EFR"/&gt;
 *     &lt;enumeration value="CPT"/&gt;
 *     &lt;enumeration value="LPT"/&gt;
 *     &lt;enumeration value="SPT"/&gt;
 *     &lt;enumeration value="TPT"/&gt;
 *     &lt;enumeration value="GST"/&gt;
 *     &lt;enumeration value="TOS"/&gt;
 *     &lt;enumeration value="USG"/&gt;
 *     &lt;enumeration value="PST"/&gt;
 *     &lt;enumeration value="PSL"/&gt;
 *     &lt;enumeration value="NFR"/&gt;
 *     &lt;enumeration value="LOS"/&gt;
 *     &lt;enumeration value="HOM"/&gt;
 *     &lt;enumeration value="MAE"/&gt;
 *     &lt;enumeration value="LAE"/&gt;
 *     &lt;enumeration value="NOH"/&gt;
 *     &lt;enumeration value="NE1"/&gt;
 *     &lt;enumeration value="NE2"/&gt;
 *     &lt;enumeration value="NOT"/&gt;
 *     &lt;enumeration value="OPS"/&gt;
 *     &lt;enumeration value="OPT"/&gt;
 *     &lt;enumeration value="O65"/&gt;
 *     &lt;enumeration value="REE"/&gt;
 *     &lt;enumeration value="TOE"/&gt;
 *     &lt;enumeration value="USE"/&gt;
 *     &lt;enumeration value="WOF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxExemptionCodeContentType")
@XmlEnum
public enum TaxExemptionCodeContentType {

    AGR("AGR"),
    LOF("LOF"),
    DPI("DPI"),
    DIS("DIS"),
    DIV("DIV"),
    EFE("EFE"),
    EFR("EFR"),
    CPT("CPT"),
    LPT("LPT"),
    SPT("SPT"),
    TPT("TPT"),
    GST("GST"),
    TOS("TOS"),
    USG("USG"),
    PST("PST"),
    PSL("PSL"),
    NFR("NFR"),
    LOS("LOS"),
    HOM("HOM"),
    MAE("MAE"),
    LAE("LAE"),
    NOH("NOH"),
    @XmlEnumValue("NE1")
    NE_1("NE1"),
    @XmlEnumValue("NE2")
    NE_2("NE2"),
    NOT("NOT"),
    OPS("OPS"),
    OPT("OPT"),
    @XmlEnumValue("O65")
    O_65("O65"),
    REE("REE"),
    TOE("TOE"),
    USE("USE"),
    WOF("WOF");
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
