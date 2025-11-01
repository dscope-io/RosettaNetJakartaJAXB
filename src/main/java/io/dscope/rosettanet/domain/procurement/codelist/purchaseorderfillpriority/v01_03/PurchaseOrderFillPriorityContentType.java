
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderFillPriorityContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseOrderFillPriorityContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="HIG"/&gt;
 *     &lt;enumeration value="LOW"/&gt;
 *     &lt;enumeration value="MED"/&gt;
 *     &lt;enumeration value="PR1"/&gt;
 *     &lt;enumeration value="PR2"/&gt;
 *     &lt;enumeration value="PR3"/&gt;
 *     &lt;enumeration value="PR4"/&gt;
 *     &lt;enumeration value="PR5"/&gt;
 *     &lt;enumeration value="PR6"/&gt;
 *     &lt;enumeration value="PR7"/&gt;
 *     &lt;enumeration value="PR8"/&gt;
 *     &lt;enumeration value="PR9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderFillPriorityContentType")
@XmlEnum
public enum PurchaseOrderFillPriorityContentType {

    HIG("HIG"),
    LOW("LOW"),
    MED("MED"),
    @XmlEnumValue("PR1")
    PR_1("PR1"),
    @XmlEnumValue("PR2")
    PR_2("PR2"),
    @XmlEnumValue("PR3")
    PR_3("PR3"),
    @XmlEnumValue("PR4")
    PR_4("PR4"),
    @XmlEnumValue("PR5")
    PR_5("PR5"),
    @XmlEnumValue("PR6")
    PR_6("PR6"),
    @XmlEnumValue("PR7")
    PR_7("PR7"),
    @XmlEnumValue("PR8")
    PR_8("PR8"),
    @XmlEnumValue("PR9")
    PR_9("PR9");
    private final String value;

    PurchaseOrderFillPriorityContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurchaseOrderFillPriorityContentType fromValue(String v) {
        for (PurchaseOrderFillPriorityContentType c: PurchaseOrderFillPriorityContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
