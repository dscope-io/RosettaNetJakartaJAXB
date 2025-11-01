
package io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductProcurementTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProductProcurementTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AAP"/&gt;
 *     &lt;enumeration value="ALC"/&gt;
 *     &lt;enumeration value="BLK"/&gt;
 *     &lt;enumeration value="CQS"/&gt;
 *     &lt;enumeration value="CSU"/&gt;
 *     &lt;enumeration value="DPA"/&gt;
 *     &lt;enumeration value="JIT"/&gt;
 *     &lt;enumeration value="LBD"/&gt;
 *     &lt;enumeration value="NAP"/&gt;
 *     &lt;enumeration value="NCN"/&gt;
 *     &lt;enumeration value="NPB"/&gt;
 *     &lt;enumeration value="NPI"/&gt;
 *     &lt;enumeration value="NSB"/&gt;
 *     &lt;enumeration value="ONC"/&gt;
 *     &lt;enumeration value="QUS"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SEG"/&gt;
 *     &lt;enumeration value="SPS"/&gt;
 *     &lt;enumeration value="SUB"/&gt;
 *     &lt;enumeration value="VMI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductProcurementTypeContentType")
@XmlEnum
public enum ProductProcurementTypeContentType {

    AAP,
    ALC,
    BLK,
    CQS,
    CSU,
    DPA,
    JIT,
    LBD,
    NAP,
    NCN,
    NPB,
    NPI,
    NSB,
    ONC,
    QUS,
    REP,
    SBD,
    SEG,
    SPS,
    SUB,
    VMI;

    public String value() {
        return name();
    }

    public static ProductProcurementTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
