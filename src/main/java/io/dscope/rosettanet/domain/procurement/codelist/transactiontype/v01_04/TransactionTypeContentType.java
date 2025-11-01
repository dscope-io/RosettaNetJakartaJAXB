
package io.dscope.rosettanet.domain.procurement.codelist.transactiontype.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TransactionTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="COS"/&gt;
 *     &lt;enumeration value="DSM"/&gt;
 *     &lt;enumeration value="ITC"/&gt;
 *     &lt;enumeration value="ITR"/&gt;
 *     &lt;enumeration value="ITT"/&gt;
 *     &lt;enumeration value="MSI"/&gt;
 *     &lt;enumeration value="MSO"/&gt;
 *     &lt;enumeration value="OOO"/&gt;
 *     &lt;enumeration value="OOS"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *     &lt;enumeration value="RPR"/&gt;
 *     &lt;enumeration value="SAL"/&gt;
 *     &lt;enumeration value="SEL"/&gt;
 *     &lt;enumeration value="SIN"/&gt;
 *     &lt;enumeration value="STI"/&gt;
 *     &lt;enumeration value="STO"/&gt;
 *     &lt;enumeration value="WHS"/&gt;
 *     &lt;enumeration value="WHA"/&gt;
 *     &lt;enumeration value="WHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionTypeContentType")
@XmlEnum
public enum TransactionTypeContentType {

    CAN,
    COS,
    DSM,
    ITC,
    ITR,
    ITT,
    MSI,
    MSO,
    OOO,
    OOS,
    RET,
    RPR,
    SAL,
    SEL,
    SIN,
    STI,
    STO,
    WHS,
    WHA,
    WHR;

    public String value() {
        return name();
    }

    public static TransactionTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
