
package io.dscope.rosettanet.domain.procurement.codelist.exportcontrolclassification.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportControlClassificationContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExportControlClassificationContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CLE"/&gt;
 *     &lt;enumeration value="DET"/&gt;
 *     &lt;enumeration value="DOR"/&gt;
 *     &lt;enumeration value="DRC"/&gt;
 *     &lt;enumeration value="FUM"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="IAC"/&gt;
 *     &lt;enumeration value="IAR"/&gt;
 *     &lt;enumeration value="NCP"/&gt;
 *     &lt;enumeration value="SAC"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *     &lt;enumeration value="SER"/&gt;
 *     &lt;enumeration value="STC"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="TAC"/&gt;
 *     &lt;enumeration value="TAR"/&gt;
 *     &lt;enumeration value="ACC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExportControlClassificationContentType")
@XmlEnum
public enum ExportControlClassificationContentType {

    CLE,
    DET,
    DOR,
    DRC,
    FUM,
    INS,
    IAC,
    IAR,
    NCP,
    SAC,
    SAR,
    SEC,
    SER,
    STC,
    STR,
    TAC,
    TAR,
    ACC;

    public String value() {
        return name();
    }

    public static ExportControlClassificationContentType fromValue(String v) {
        return valueOf(v);
    }

}
