
package io.dscope.rosettanet.domain.procurement.codelist.paymentmethod.v01_00;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentMethodContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BTX"/&gt;
 *     &lt;enumeration value="BDO"/&gt;
 *     &lt;enumeration value="CSG"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="EPS"/&gt;
 *     &lt;enumeration value="IKP"/&gt;
 *     &lt;enumeration value="LAG"/&gt;
 *     &lt;enumeration value="LOC"/&gt;
 *     &lt;enumeration value="MDT"/&gt;
 *     &lt;enumeration value="NMI"/&gt;
 *     &lt;enumeration value="PBC"/&gt;
 *     &lt;enumeration value="PPC"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PPW"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PVN"/&gt;
 *     &lt;enumeration value="WVD"/&gt;
 *     &lt;enumeration value="WRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodContentType")
@XmlEnum
public enum PaymentMethodContentType {

    BTX,
    BDO,
    CSG,
    CRC,
    EPS,
    IKP,
    LAG,
    LOC,
    MDT,
    NMI,
    PBC,
    PPC,
    PCC,
    PPW,
    PRC,
    PVN,
    WVD,
    WRT;

    public String value() {
        return name();
    }

    public static PaymentMethodContentType fromValue(String v) {
        return valueOf(v);
    }

}
