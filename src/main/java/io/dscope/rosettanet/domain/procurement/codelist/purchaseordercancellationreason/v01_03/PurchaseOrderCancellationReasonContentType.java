
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderCancellationReasonContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseOrderCancellationReasonContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CBT"/&gt;
 *     &lt;enumeration value="CPD"/&gt;
 *     &lt;enumeration value="CST"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="IPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderCancellationReasonContentType")
@XmlEnum
public enum PurchaseOrderCancellationReasonContentType {

    CBT,
    CPD,
    CST,
    DDP,
    IPD;

    public String value() {
        return name();
    }

    public static PurchaseOrderCancellationReasonContentType fromValue(String v) {
        return valueOf(v);
    }

}
