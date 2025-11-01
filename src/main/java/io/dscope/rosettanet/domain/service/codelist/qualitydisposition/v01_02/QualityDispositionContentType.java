
package io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityDispositionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QualityDispositionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="ERE"/&gt;
 *     &lt;enumeration value="FGI"/&gt;
 *     &lt;enumeration value="FGJ"/&gt;
 *     &lt;enumeration value="MAN"/&gt;
 *     &lt;enumeration value="NFF"/&gt;
 *     &lt;enumeration value="NTF"/&gt;
 *     &lt;enumeration value="PSC"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="RFM"/&gt;
 *     &lt;enumeration value="RSC"/&gt;
 *     &lt;enumeration value="RAN"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RTM"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SHI"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualityDispositionContentType")
@XmlEnum
public enum QualityDispositionContentType {

    DEF,
    ERE,
    FGI,
    FGJ,
    MAN,
    NFF,
    NTF,
    PSC,
    REC,
    RFM,
    RSC,
    RAN,
    REP,
    RTM,
    SCR,
    SHI,
    UPD;

    public String value() {
        return name();
    }

    public static QualityDispositionContentType fromValue(String v) {
        return valueOf(v);
    }

}
