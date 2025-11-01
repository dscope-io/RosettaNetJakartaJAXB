
package io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_04;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceRejectionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="InvoiceRejectionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AGM"/&gt;
 *     &lt;enumeration value="ATL"/&gt;
 *     &lt;enumeration value="BIC"/&gt;
 *     &lt;enumeration value="BOI"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BPO"/&gt;
 *     &lt;enumeration value="BUP"/&gt;
 *     &lt;enumeration value="BUS"/&gt;
 *     &lt;enumeration value="CNP"/&gt;
 *     &lt;enumeration value="CNS"/&gt;
 *     &lt;enumeration value="CPC"/&gt;
 *     &lt;enumeration value="CPO"/&gt;
 *     &lt;enumeration value="CPS"/&gt;
 *     &lt;enumeration value="DIV"/&gt;
 *     &lt;enumeration value="DNP"/&gt;
 *     &lt;enumeration value="DPD"/&gt;
 *     &lt;enumeration value="DPI"/&gt;
 *     &lt;enumeration value="DPO"/&gt;
 *     &lt;enumeration value="EIL"/&gt;
 *     &lt;enumeration value="EIM"/&gt;
 *     &lt;enumeration value="EIP"/&gt;
 *     &lt;enumeration value="ESM"/&gt;
 *     &lt;enumeration value="FBS"/&gt;
 *     &lt;enumeration value="FNA"/&gt;
 *     &lt;enumeration value="FNN"/&gt;
 *     &lt;enumeration value="FNP"/&gt;
 *     &lt;enumeration value="GST"/&gt;
 *     &lt;enumeration value="IAD"/&gt;
 *     &lt;enumeration value="IBR"/&gt;
 *     &lt;enumeration value="ICI"/&gt;
 *     &lt;enumeration value="ICS"/&gt;
 *     &lt;enumeration value="IEC"/&gt;
 *     &lt;enumeration value="IGI"/&gt;
 *     &lt;enumeration value="IHT"/&gt;
 *     &lt;enumeration value="IIN"/&gt;
 *     &lt;enumeration value="ILI"/&gt;
 *     &lt;enumeration value="IMC"/&gt;
 *     &lt;enumeration value="IME"/&gt;
 *     &lt;enumeration value="INA"/&gt;
 *     &lt;enumeration value="INE"/&gt;
 *     &lt;enumeration value="INP"/&gt;
 *     &lt;enumeration value="INQ"/&gt;
 *     &lt;enumeration value="IPO"/&gt;
 *     &lt;enumeration value="IRB"/&gt;
 *     &lt;enumeration value="IRC"/&gt;
 *     &lt;enumeration value="IRD"/&gt;
 *     &lt;enumeration value="IRF"/&gt;
 *     &lt;enumeration value="IRI"/&gt;
 *     &lt;enumeration value="IRM"/&gt;
 *     &lt;enumeration value="IRN"/&gt;
 *     &lt;enumeration value="ISD"/&gt;
 *     &lt;enumeration value="ITA"/&gt;
 *     &lt;enumeration value="IVE"/&gt;
 *     &lt;enumeration value="NBC"/&gt;
 *     &lt;enumeration value="NCL"/&gt;
 *     &lt;enumeration value="NPF"/&gt;
 *     &lt;enumeration value="OIR"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="PBR"/&gt;
 *     &lt;enumeration value="PCC"/&gt;
 *     &lt;enumeration value="PEX"/&gt;
 *     &lt;enumeration value="PNA"/&gt;
 *     &lt;enumeration value="PNB"/&gt;
 *     &lt;enumeration value="PNM"/&gt;
 *     &lt;enumeration value="PNR"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="PRN"/&gt;
 *     &lt;enumeration value="PTB"/&gt;
 *     &lt;enumeration value="PVC"/&gt;
 *     &lt;enumeration value="QIE"/&gt;
 *     &lt;enumeration value="QIZ"/&gt;
 *     &lt;enumeration value="RBE"/&gt;
 *     &lt;enumeration value="RCI"/&gt;
 *     &lt;enumeration value="RCU"/&gt;
 *     &lt;enumeration value="RIF"/&gt;
 *     &lt;enumeration value="RIW"/&gt;
 *     &lt;enumeration value="RPP"/&gt;
 *     &lt;enumeration value="RPR"/&gt;
 *     &lt;enumeration value="RTO"/&gt;
 *     &lt;enumeration value="RUP"/&gt;
 *     &lt;enumeration value="SCB"/&gt;
 *     &lt;enumeration value="SFF"/&gt;
 *     &lt;enumeration value="SIV"/&gt;
 *     &lt;enumeration value="SMC"/&gt;
 *     &lt;enumeration value="SNR"/&gt;
 *     &lt;enumeration value="STI"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *     &lt;enumeration value="TOR"/&gt;
 *     &lt;enumeration value="TPB"/&gt;
 *     &lt;enumeration value="TPC"/&gt;
 *     &lt;enumeration value="TPS"/&gt;
 *     &lt;enumeration value="UCI"/&gt;
 *     &lt;enumeration value="UMI"/&gt;
 *     &lt;enumeration value="VNA"/&gt;
 *     &lt;enumeration value="ZDU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceRejectionContentType")
@XmlEnum
public enum InvoiceRejectionContentType {

    AGM,
    ATL,
    BIC,
    BOI,
    BOL,
    BPO,
    BUP,
    BUS,
    CNP,
    CNS,
    CPC,
    CPO,
    CPS,
    DIV,
    DNP,
    DPD,
    DPI,
    DPO,
    EIL,
    EIM,
    EIP,
    ESM,
    FBS,
    FNA,
    FNN,
    FNP,
    GST,
    IAD,
    IBR,
    ICI,
    ICS,
    IEC,
    IGI,
    IHT,
    IIN,
    ILI,
    IMC,
    IME,
    INA,
    INE,
    INP,
    INQ,
    IPO,
    IRB,
    IRC,
    IRD,
    IRF,
    IRI,
    IRM,
    IRN,
    ISD,
    ITA,
    IVE,
    NBC,
    NCL,
    NPF,
    OIR,
    OTH,
    PBR,
    PCC,
    PEX,
    PNA,
    PNB,
    PNM,
    PNR,
    POR,
    PRI,
    PRN,
    PTB,
    PVC,
    QIE,
    QIZ,
    RBE,
    RCI,
    RCU,
    RIF,
    RIW,
    RPP,
    RPR,
    RTO,
    RUP,
    SCB,
    SFF,
    SIV,
    SMC,
    SNR,
    STI,
    STN,
    TOR,
    TPB,
    TPC,
    TPS,
    UCI,
    UMI,
    VNA,
    ZDU;

    public String value() {
        return name();
    }

    public static InvoiceRejectionContentType fromValue(String v) {
        return valueOf(v);
    }

}
