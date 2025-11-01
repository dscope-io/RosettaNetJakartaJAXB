
package io.dscope.rosettanet.interchange.codelist.shipmentstatus.v01_03;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipmentStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ShipmentStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AAA"/&gt;
 *     &lt;enumeration value="AAD"/&gt;
 *     &lt;enumeration value="AAF"/&gt;
 *     &lt;enumeration value="AAP"/&gt;
 *     &lt;enumeration value="AAR"/&gt;
 *     &lt;enumeration value="AAS"/&gt;
 *     &lt;enumeration value="AAT"/&gt;
 *     &lt;enumeration value="AAU"/&gt;
 *     &lt;enumeration value="AAV"/&gt;
 *     &lt;enumeration value="ABC"/&gt;
 *     &lt;enumeration value="ACL"/&gt;
 *     &lt;enumeration value="ADA"/&gt;
 *     &lt;enumeration value="ADC"/&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="ADL"/&gt;
 *     &lt;enumeration value="ADR"/&gt;
 *     &lt;enumeration value="ADS"/&gt;
 *     &lt;enumeration value="AEA"/&gt;
 *     &lt;enumeration value="AEC"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AEE"/&gt;
 *     &lt;enumeration value="AEL"/&gt;
 *     &lt;enumeration value="AEP"/&gt;
 *     &lt;enumeration value="AER"/&gt;
 *     &lt;enumeration value="AET"/&gt;
 *     &lt;enumeration value="AGO"/&gt;
 *     &lt;enumeration value="AIT"/&gt;
 *     &lt;enumeration value="ALA"/&gt;
 *     &lt;enumeration value="ALD"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="ALP"/&gt;
 *     &lt;enumeration value="APD"/&gt;
 *     &lt;enumeration value="APL"/&gt;
 *     &lt;enumeration value="APR"/&gt;
 *     &lt;enumeration value="APS"/&gt;
 *     &lt;enumeration value="ARA"/&gt;
 *     &lt;enumeration value="ARD"/&gt;
 *     &lt;enumeration value="ARR"/&gt;
 *     &lt;enumeration value="ATA"/&gt;
 *     &lt;enumeration value="ATL"/&gt;
 *     &lt;enumeration value="AVF"/&gt;
 *     &lt;enumeration value="AVR"/&gt;
 *     &lt;enumeration value="CAC"/&gt;
 *     &lt;enumeration value="CBA"/&gt;
 *     &lt;enumeration value="CBH"/&gt;
 *     &lt;enumeration value="CBN"/&gt;
 *     &lt;enumeration value="CBR"/&gt;
 *     &lt;enumeration value="CCA"/&gt;
 *     &lt;enumeration value="CCC"/&gt;
 *     &lt;enumeration value="CCD"/&gt;
 *     &lt;enumeration value="CCH"/&gt;
 *     &lt;enumeration value="CCI"/&gt;
 *     &lt;enumeration value="CCP"/&gt;
 *     &lt;enumeration value="CCR"/&gt;
 *     &lt;enumeration value="CCS"/&gt;
 *     &lt;enumeration value="CDI"/&gt;
 *     &lt;enumeration value="CEF"/&gt;
 *     &lt;enumeration value="CIM"/&gt;
 *     &lt;enumeration value="CIS"/&gt;
 *     &lt;enumeration value="CMA"/&gt;
 *     &lt;enumeration value="CNF"/&gt;
 *     &lt;enumeration value="CPC"/&gt;
 *     &lt;enumeration value="CRB"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CRF"/&gt;
 *     &lt;enumeration value="CRN"/&gt;
 *     &lt;enumeration value="CRP"/&gt;
 *     &lt;enumeration value="CSC"/&gt;
 *     &lt;enumeration value="CSD"/&gt;
 *     &lt;enumeration value="CSI"/&gt;
 *     &lt;enumeration value="CSO"/&gt;
 *     &lt;enumeration value="CSS"/&gt;
 *     &lt;enumeration value="CST"/&gt;
 *     &lt;enumeration value="DAA"/&gt;
 *     &lt;enumeration value="DAB"/&gt;
 *     &lt;enumeration value="DAC"/&gt;
 *     &lt;enumeration value="DAD"/&gt;
 *     &lt;enumeration value="DAE"/&gt;
 *     &lt;enumeration value="DAF"/&gt;
 *     &lt;enumeration value="DAG"/&gt;
 *     &lt;enumeration value="DAH"/&gt;
 *     &lt;enumeration value="DAI"/&gt;
 *     &lt;enumeration value="DAL"/&gt;
 *     &lt;enumeration value="DAM"/&gt;
 *     &lt;enumeration value="DAN"/&gt;
 *     &lt;enumeration value="DAO"/&gt;
 *     &lt;enumeration value="DAP"/&gt;
 *     &lt;enumeration value="DAQ"/&gt;
 *     &lt;enumeration value="DAR"/&gt;
 *     &lt;enumeration value="DAS"/&gt;
 *     &lt;enumeration value="DAT"/&gt;
 *     &lt;enumeration value="DAU"/&gt;
 *     &lt;enumeration value="DAV"/&gt;
 *     &lt;enumeration value="DAW"/&gt;
 *     &lt;enumeration value="DAX"/&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="DAZ"/&gt;
 *     &lt;enumeration value="DBO"/&gt;
 *     &lt;enumeration value="DCA"/&gt;
 *     &lt;enumeration value="DCB"/&gt;
 *     &lt;enumeration value="DCC"/&gt;
 *     &lt;enumeration value="DCD"/&gt;
 *     &lt;enumeration value="DCP"/&gt;
 *     &lt;enumeration value="DCR"/&gt;
 *     &lt;enumeration value="DCT"/&gt;
 *     &lt;enumeration value="DCU"/&gt;
 *     &lt;enumeration value="DDA"/&gt;
 *     &lt;enumeration value="DDB"/&gt;
 *     &lt;enumeration value="DDC"/&gt;
 *     &lt;enumeration value="DDD"/&gt;
 *     &lt;enumeration value="DDE"/&gt;
 *     &lt;enumeration value="DDF"/&gt;
 *     &lt;enumeration value="DDG"/&gt;
 *     &lt;enumeration value="DDH"/&gt;
 *     &lt;enumeration value="DDI"/&gt;
 *     &lt;enumeration value="DDJ"/&gt;
 *     &lt;enumeration value="DDK"/&gt;
 *     &lt;enumeration value="DDL"/&gt;
 *     &lt;enumeration value="DDO"/&gt;
 *     &lt;enumeration value="DDP"/&gt;
 *     &lt;enumeration value="DDS"/&gt;
 *     &lt;enumeration value="DDT"/&gt;
 *     &lt;enumeration value="DEF"/&gt;
 *     &lt;enumeration value="DEL"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DEN"/&gt;
 *     &lt;enumeration value="DEO"/&gt;
 *     &lt;enumeration value="DEP"/&gt;
 *     &lt;enumeration value="DEQ"/&gt;
 *     &lt;enumeration value="DER"/&gt;
 *     &lt;enumeration value="DES"/&gt;
 *     &lt;enumeration value="DFA"/&gt;
 *     &lt;enumeration value="DFB"/&gt;
 *     &lt;enumeration value="DFC"/&gt;
 *     &lt;enumeration value="DFD"/&gt;
 *     &lt;enumeration value="DFE"/&gt;
 *     &lt;enumeration value="DFF"/&gt;
 *     &lt;enumeration value="DFR"/&gt;
 *     &lt;enumeration value="DFS"/&gt;
 *     &lt;enumeration value="DFV"/&gt;
 *     &lt;enumeration value="DHI"/&gt;
 *     &lt;enumeration value="DHM"/&gt;
 *     &lt;enumeration value="DIB"/&gt;
 *     &lt;enumeration value="DIT"/&gt;
 *     &lt;enumeration value="DKD"/&gt;
 *     &lt;enumeration value="DLA"/&gt;
 *     &lt;enumeration value="DLB"/&gt;
 *     &lt;enumeration value="DLD"/&gt;
 *     &lt;enumeration value="DLT"/&gt;
 *     &lt;enumeration value="DMB"/&gt;
 *     &lt;enumeration value="DMP"/&gt;
 *     &lt;enumeration value="DMR"/&gt;
 *     &lt;enumeration value="DND"/&gt;
 *     &lt;enumeration value="DNR"/&gt;
 *     &lt;enumeration value="DOC"/&gt;
 *     &lt;enumeration value="DOD"/&gt;
 *     &lt;enumeration value="DOM"/&gt;
 *     &lt;enumeration value="DOO"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DOS"/&gt;
 *     &lt;enumeration value="DOT"/&gt;
 *     &lt;enumeration value="DPD"/&gt;
 *     &lt;enumeration value="DPI"/&gt;
 *     &lt;enumeration value="DPL"/&gt;
 *     &lt;enumeration value="DRB"/&gt;
 *     &lt;enumeration value="DRD"/&gt;
 *     &lt;enumeration value="DRE"/&gt;
 *     &lt;enumeration value="DRF"/&gt;
 *     &lt;enumeration value="DRG"/&gt;
 *     &lt;enumeration value="DRH"/&gt;
 *     &lt;enumeration value="DRI"/&gt;
 *     &lt;enumeration value="DRJ"/&gt;
 *     &lt;enumeration value="DRO"/&gt;
 *     &lt;enumeration value="DRQ"/&gt;
 *     &lt;enumeration value="DSC"/&gt;
 *     &lt;enumeration value="DSD"/&gt;
 *     &lt;enumeration value="DSE"/&gt;
 *     &lt;enumeration value="DSP"/&gt;
 *     &lt;enumeration value="DSU"/&gt;
 *     &lt;enumeration value="DTA"/&gt;
 *     &lt;enumeration value="DTC"/&gt;
 *     &lt;enumeration value="DTD"/&gt;
 *     &lt;enumeration value="DTE"/&gt;
 *     &lt;enumeration value="DTF"/&gt;
 *     &lt;enumeration value="DTG"/&gt;
 *     &lt;enumeration value="DTL"/&gt;
 *     &lt;enumeration value="DTO"/&gt;
 *     &lt;enumeration value="DTR"/&gt;
 *     &lt;enumeration value="DTU"/&gt;
 *     &lt;enumeration value="DVD"/&gt;
 *     &lt;enumeration value="DVL"/&gt;
 *     &lt;enumeration value="DVR"/&gt;
 *     &lt;enumeration value="HAN"/&gt;
 *     &lt;enumeration value="HAO"/&gt;
 *     &lt;enumeration value="HFC"/&gt;
 *     &lt;enumeration value="HTB"/&gt;
 *     &lt;enumeration value="HTS"/&gt;
 *     &lt;enumeration value="IDA"/&gt;
 *     &lt;enumeration value="IIT"/&gt;
 *     &lt;enumeration value="ITA"/&gt;
 *     &lt;enumeration value="ITB"/&gt;
 *     &lt;enumeration value="ITC"/&gt;
 *     &lt;enumeration value="ITD"/&gt;
 *     &lt;enumeration value="ITE"/&gt;
 *     &lt;enumeration value="ITF"/&gt;
 *     &lt;enumeration value="ITG"/&gt;
 *     &lt;enumeration value="ITH"/&gt;
 *     &lt;enumeration value="ITI"/&gt;
 *     &lt;enumeration value="ITJ"/&gt;
 *     &lt;enumeration value="ITK"/&gt;
 *     &lt;enumeration value="ITL"/&gt;
 *     &lt;enumeration value="ITM"/&gt;
 *     &lt;enumeration value="ITN"/&gt;
 *     &lt;enumeration value="ITO"/&gt;
 *     &lt;enumeration value="ITR"/&gt;
 *     &lt;enumeration value="ITS"/&gt;
 *     &lt;enumeration value="ITT"/&gt;
 *     &lt;enumeration value="ITU"/&gt;
 *     &lt;enumeration value="ITV"/&gt;
 *     &lt;enumeration value="ITW"/&gt;
 *     &lt;enumeration value="LET"/&gt;
 *     &lt;enumeration value="LLD"/&gt;
 *     &lt;enumeration value="LLF"/&gt;
 *     &lt;enumeration value="LLL"/&gt;
 *     &lt;enumeration value="LLT"/&gt;
 *     &lt;enumeration value="LOA"/&gt;
 *     &lt;enumeration value="LOB"/&gt;
 *     &lt;enumeration value="LOR"/&gt;
 *     &lt;enumeration value="LOT"/&gt;
 *     &lt;enumeration value="OAC"/&gt;
 *     &lt;enumeration value="OAH"/&gt;
 *     &lt;enumeration value="OAP"/&gt;
 *     &lt;enumeration value="OAR"/&gt;
 *     &lt;enumeration value="OAS"/&gt;
 *     &lt;enumeration value="OBN"/&gt;
 *     &lt;enumeration value="OCI"/&gt;
 *     &lt;enumeration value="OCP"/&gt;
 *     &lt;enumeration value="OCR"/&gt;
 *     &lt;enumeration value="OCS"/&gt;
 *     &lt;enumeration value="OCT"/&gt;
 *     &lt;enumeration value="OCU"/&gt;
 *     &lt;enumeration value="ODL"/&gt;
 *     &lt;enumeration value="OES"/&gt;
 *     &lt;enumeration value="OFE"/&gt;
 *     &lt;enumeration value="OFP"/&gt;
 *     &lt;enumeration value="OFT"/&gt;
 *     &lt;enumeration value="OHA"/&gt;
 *     &lt;enumeration value="OHB"/&gt;
 *     &lt;enumeration value="OHC"/&gt;
 *     &lt;enumeration value="OHD"/&gt;
 *     &lt;enumeration value="OHE"/&gt;
 *     &lt;enumeration value="OHF"/&gt;
 *     &lt;enumeration value="OHG"/&gt;
 *     &lt;enumeration value="OHH"/&gt;
 *     &lt;enumeration value="OHI"/&gt;
 *     &lt;enumeration value="OHJ"/&gt;
 *     &lt;enumeration value="OHK"/&gt;
 *     &lt;enumeration value="OHL"/&gt;
 *     &lt;enumeration value="OHM"/&gt;
 *     &lt;enumeration value="OHN"/&gt;
 *     &lt;enumeration value="OHO"/&gt;
 *     &lt;enumeration value="OHP"/&gt;
 *     &lt;enumeration value="OHQ"/&gt;
 *     &lt;enumeration value="OHR"/&gt;
 *     &lt;enumeration value="OHS"/&gt;
 *     &lt;enumeration value="OHT"/&gt;
 *     &lt;enumeration value="OHU"/&gt;
 *     &lt;enumeration value="OHV"/&gt;
 *     &lt;enumeration value="OHW"/&gt;
 *     &lt;enumeration value="OHX"/&gt;
 *     &lt;enumeration value="OHY"/&gt;
 *     &lt;enumeration value="OHZ"/&gt;
 *     &lt;enumeration value="OIF"/&gt;
 *     &lt;enumeration value="OIG"/&gt;
 *     &lt;enumeration value="OMD"/&gt;
 *     &lt;enumeration value="OND"/&gt;
 *     &lt;enumeration value="ONS"/&gt;
 *     &lt;enumeration value="OOC"/&gt;
 *     &lt;enumeration value="OOG"/&gt;
 *     &lt;enumeration value="OOH"/&gt;
 *     &lt;enumeration value="OOO"/&gt;
 *     &lt;enumeration value="OOP"/&gt;
 *     &lt;enumeration value="OOR"/&gt;
 *     &lt;enumeration value="OPL"/&gt;
 *     &lt;enumeration value="OPR"/&gt;
 *     &lt;enumeration value="OPS"/&gt;
 *     &lt;enumeration value="ORC"/&gt;
 *     &lt;enumeration value="ORW"/&gt;
 *     &lt;enumeration value="OSA"/&gt;
 *     &lt;enumeration value="OSC"/&gt;
 *     &lt;enumeration value="OSI"/&gt;
 *     &lt;enumeration value="OSK"/&gt;
 *     &lt;enumeration value="OSN"/&gt;
 *     &lt;enumeration value="OSO"/&gt;
 *     &lt;enumeration value="OSR"/&gt;
 *     &lt;enumeration value="OSS"/&gt;
 *     &lt;enumeration value="OTC"/&gt;
 *     &lt;enumeration value="OTD"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="OTI"/&gt;
 *     &lt;enumeration value="OTP"/&gt;
 *     &lt;enumeration value="OUC"/&gt;
 *     &lt;enumeration value="OUP"/&gt;
 *     &lt;enumeration value="OVR"/&gt;
 *     &lt;enumeration value="OWI"/&gt;
 *     &lt;enumeration value="OWL"/&gt;
 *     &lt;enumeration value="OWP"/&gt;
 *     &lt;enumeration value="PPC"/&gt;
 *     &lt;enumeration value="PPD"/&gt;
 *     &lt;enumeration value="PPH"/&gt;
 *     &lt;enumeration value="PPM"/&gt;
 *     &lt;enumeration value="PPS"/&gt;
 *     &lt;enumeration value="PSC"/&gt;
 *     &lt;enumeration value="PSO"/&gt;
 *     &lt;enumeration value="PSP"/&gt;
 *     &lt;enumeration value="PSS"/&gt;
 *     &lt;enumeration value="PUP"/&gt;
 *     &lt;enumeration value="PUU"/&gt;
 *     &lt;enumeration value="RAC"/&gt;
 *     &lt;enumeration value="RAR"/&gt;
 *     &lt;enumeration value="RBO"/&gt;
 *     &lt;enumeration value="RCR"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RGR"/&gt;
 *     &lt;enumeration value="RHR"/&gt;
 *     &lt;enumeration value="RMB"/&gt;
 *     &lt;enumeration value="RMC"/&gt;
 *     &lt;enumeration value="RNP"/&gt;
 *     &lt;enumeration value="ROC"/&gt;
 *     &lt;enumeration value="RRC"/&gt;
 *     &lt;enumeration value="RRE"/&gt;
 *     &lt;enumeration value="RRO"/&gt;
 *     &lt;enumeration value="RRP"/&gt;
 *     &lt;enumeration value="RRR"/&gt;
 *     &lt;enumeration value="RRT"/&gt;
 *     &lt;enumeration value="RTS"/&gt;
 *     &lt;enumeration value="RWB"/&gt;
 *     &lt;enumeration value="SDA"/&gt;
 *     &lt;enumeration value="SDB"/&gt;
 *     &lt;enumeration value="SDC"/&gt;
 *     &lt;enumeration value="SDF"/&gt;
 *     &lt;enumeration value="SDI"/&gt;
 *     &lt;enumeration value="SDM"/&gt;
 *     &lt;enumeration value="SDN"/&gt;
 *     &lt;enumeration value="SDO"/&gt;
 *     &lt;enumeration value="SDP"/&gt;
 *     &lt;enumeration value="SDQ"/&gt;
 *     &lt;enumeration value="SDR"/&gt;
 *     &lt;enumeration value="SDS"/&gt;
 *     &lt;enumeration value="SIB"/&gt;
 *     &lt;enumeration value="SIC"/&gt;
 *     &lt;enumeration value="SID"/&gt;
 *     &lt;enumeration value="SIE"/&gt;
 *     &lt;enumeration value="SIF"/&gt;
 *     &lt;enumeration value="SIG"/&gt;
 *     &lt;enumeration value="SIH"/&gt;
 *     &lt;enumeration value="SII"/&gt;
 *     &lt;enumeration value="SIJ"/&gt;
 *     &lt;enumeration value="SIK"/&gt;
 *     &lt;enumeration value="SIL"/&gt;
 *     &lt;enumeration value="SIM"/&gt;
 *     &lt;enumeration value="SIR"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SSC"/&gt;
 *     &lt;enumeration value="SSD"/&gt;
 *     &lt;enumeration value="SSE"/&gt;
 *     &lt;enumeration value="SSF"/&gt;
 *     &lt;enumeration value="SSG"/&gt;
 *     &lt;enumeration value="SSL"/&gt;
 *     &lt;enumeration value="SSO"/&gt;
 *     &lt;enumeration value="SSP"/&gt;
 *     &lt;enumeration value="SSR"/&gt;
 *     &lt;enumeration value="SSS"/&gt;
 *     &lt;enumeration value="SST"/&gt;
 *     &lt;enumeration value="SSU"/&gt;
 *     &lt;enumeration value="SSV"/&gt;
 *     &lt;enumeration value="STT"/&gt;
 *     &lt;enumeration value="UAI"/&gt;
 *     &lt;enumeration value="UAW"/&gt;
 *     &lt;enumeration value="UBN"/&gt;
 *     &lt;enumeration value="UCU"/&gt;
 *     &lt;enumeration value="UFA"/&gt;
 *     &lt;enumeration value="UFB"/&gt;
 *     &lt;enumeration value="UFT"/&gt;
 *     &lt;enumeration value="UFU"/&gt;
 *     &lt;enumeration value="UFV"/&gt;
 *     &lt;enumeration value="UII"/&gt;
 *     &lt;enumeration value="UIN"/&gt;
 *     &lt;enumeration value="ULE"/&gt;
 *     &lt;enumeration value="UNA"/&gt;
 *     &lt;enumeration value="UNE"/&gt;
 *     &lt;enumeration value="UNO"/&gt;
 *     &lt;enumeration value="UNS"/&gt;
 *     &lt;enumeration value="UOA"/&gt;
 *     &lt;enumeration value="USH"/&gt;
 *     &lt;enumeration value="USI"/&gt;
 *     &lt;enumeration value="USL"/&gt;
 *     &lt;enumeration value="UTU"/&gt;
 *     &lt;enumeration value="UUD"/&gt;
 *     &lt;enumeration value="UUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipmentStatusContentType")
@XmlEnum
public enum ShipmentStatusContentType {

    AAA,
    AAD,
    AAF,
    AAP,
    AAR,
    AAS,
    AAT,
    AAU,
    AAV,
    ABC,
    ACL,
    ADA,
    ADC,
    ADD,
    ADL,
    ADR,
    ADS,
    AEA,
    AEC,
    AED,
    AEE,
    AEL,
    AEP,
    AER,
    AET,
    AGO,
    AIT,
    ALA,
    ALD,
    ALL,
    ALP,
    APD,
    APL,
    APR,
    APS,
    ARA,
    ARD,
    ARR,
    ATA,
    ATL,
    AVF,
    AVR,
    CAC,
    CBA,
    CBH,
    CBN,
    CBR,
    CCA,
    CCC,
    CCD,
    CCH,
    CCI,
    CCP,
    CCR,
    CCS,
    CDI,
    CEF,
    CIM,
    CIS,
    CMA,
    CNF,
    CPC,
    CRB,
    CRC,
    CRF,
    CRN,
    CRP,
    CSC,
    CSD,
    CSI,
    CSO,
    CSS,
    CST,
    DAA,
    DAB,
    DAC,
    DAD,
    DAE,
    DAF,
    DAG,
    DAH,
    DAI,
    DAL,
    DAM,
    DAN,
    DAO,
    DAP,
    DAQ,
    DAR,
    DAS,
    DAT,
    DAU,
    DAV,
    DAW,
    DAX,
    DAY,
    DAZ,
    DBO,
    DCA,
    DCB,
    DCC,
    DCD,
    DCP,
    DCR,
    DCT,
    DCU,
    DDA,
    DDB,
    DDC,
    DDD,
    DDE,
    DDF,
    DDG,
    DDH,
    DDI,
    DDJ,
    DDK,
    DDL,
    DDO,
    DDP,
    DDS,
    DDT,
    DEF,
    DEL,
    DEM,
    DEN,
    DEO,
    DEP,
    DEQ,
    DER,
    DES,
    DFA,
    DFB,
    DFC,
    DFD,
    DFE,
    DFF,
    DFR,
    DFS,
    DFV,
    DHI,
    DHM,
    DIB,
    DIT,
    DKD,
    DLA,
    DLB,
    DLD,
    DLT,
    DMB,
    DMP,
    DMR,
    DND,
    DNR,
    DOC,
    DOD,
    DOM,
    DOO,
    DOP,
    DOS,
    DOT,
    DPD,
    DPI,
    DPL,
    DRB,
    DRD,
    DRE,
    DRF,
    DRG,
    DRH,
    DRI,
    DRJ,
    DRO,
    DRQ,
    DSC,
    DSD,
    DSE,
    DSP,
    DSU,
    DTA,
    DTC,
    DTD,
    DTE,
    DTF,
    DTG,
    DTL,
    DTO,
    DTR,
    DTU,
    DVD,
    DVL,
    DVR,
    HAN,
    HAO,
    HFC,
    HTB,
    HTS,
    IDA,
    IIT,
    ITA,
    ITB,
    ITC,
    ITD,
    ITE,
    ITF,
    ITG,
    ITH,
    ITI,
    ITJ,
    ITK,
    ITL,
    ITM,
    ITN,
    ITO,
    ITR,
    ITS,
    ITT,
    ITU,
    ITV,
    ITW,
    LET,
    LLD,
    LLF,
    LLL,
    LLT,
    LOA,
    LOB,
    LOR,
    LOT,
    OAC,
    OAH,
    OAP,
    OAR,
    OAS,
    OBN,
    OCI,
    OCP,
    OCR,
    OCS,
    OCT,
    OCU,
    ODL,
    OES,
    OFE,
    OFP,
    OFT,
    OHA,
    OHB,
    OHC,
    OHD,
    OHE,
    OHF,
    OHG,
    OHH,
    OHI,
    OHJ,
    OHK,
    OHL,
    OHM,
    OHN,
    OHO,
    OHP,
    OHQ,
    OHR,
    OHS,
    OHT,
    OHU,
    OHV,
    OHW,
    OHX,
    OHY,
    OHZ,
    OIF,
    OIG,
    OMD,
    OND,
    ONS,
    OOC,
    OOG,
    OOH,
    OOO,
    OOP,
    OOR,
    OPL,
    OPR,
    OPS,
    ORC,
    ORW,
    OSA,
    OSC,
    OSI,
    OSK,
    OSN,
    OSO,
    OSR,
    OSS,
    OTC,
    OTD,
    OTH,
    OTI,
    OTP,
    OUC,
    OUP,
    OVR,
    OWI,
    OWL,
    OWP,
    PPC,
    PPD,
    PPH,
    PPM,
    PPS,
    PSC,
    PSO,
    PSP,
    PSS,
    PUP,
    PUU,
    RAC,
    RAR,
    RBO,
    RCR,
    REC,
    REP,
    RGR,
    RHR,
    RMB,
    RMC,
    RNP,
    ROC,
    RRC,
    RRE,
    RRO,
    RRP,
    RRR,
    RRT,
    RTS,
    RWB,
    SDA,
    SDB,
    SDC,
    SDF,
    SDI,
    SDM,
    SDN,
    SDO,
    SDP,
    SDQ,
    SDR,
    SDS,
    SIB,
    SIC,
    SID,
    SIE,
    SIF,
    SIG,
    SIH,
    SII,
    SIJ,
    SIK,
    SIL,
    SIM,
    SIR,
    SIT,
    SSC,
    SSD,
    SSE,
    SSF,
    SSG,
    SSL,
    SSO,
    SSP,
    SSR,
    SSS,
    SST,
    SSU,
    SSV,
    STT,
    UAI,
    UAW,
    UBN,
    UCU,
    UFA,
    UFB,
    UFT,
    UFU,
    UFV,
    UII,
    UIN,
    ULE,
    UNA,
    UNE,
    UNO,
    UNS,
    UOA,
    USH,
    USI,
    USL,
    UTU,
    UUD,
    UUT;

    public String value() {
        return name();
    }

    public static ShipmentStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
