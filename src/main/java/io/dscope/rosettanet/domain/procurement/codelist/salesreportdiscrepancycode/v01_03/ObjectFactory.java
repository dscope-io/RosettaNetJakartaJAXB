
package io.dscope.rosettanet.domain.procurement.codelist.salesreportdiscrepancycode.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.salesreportdiscrepancycode.v01_03 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.salesreportdiscrepancycode.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalesReportDiscrepancyCodeType }
     * 
     */
    public SalesReportDiscrepancyCodeType createSalesReportDiscrepancyCodeType() {
        return new SalesReportDiscrepancyCodeType();
    }

    /**
     * Create an instance of {@link SalesReportDiscrepancyCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SalesReportDiscrepancyCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:SalesReportDiscrepancyCode:xsd:codelist:01.03", name = "SalesReportDiscrepancyCodeA")
    public SalesReportDiscrepancyCodeA createSalesReportDiscrepancyCodeA(Object value) {
        return new SalesReportDiscrepancyCodeA(value);
    }

    /**
     * Create an instance of {@link SalesReportDiscrepancyCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SalesReportDiscrepancyCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:SalesReportDiscrepancyCode:xsd:codelist:01.03", name = "SalesReportDiscrepancyCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:SalesReportDiscrepancyCode:xsd:codelist:01.03", substitutionHeadName = "SalesReportDiscrepancyCodeA")
    public SalesReportDiscrepancyCode createSalesReportDiscrepancyCode(SalesReportDiscrepancyCodeType value) {
        return new SalesReportDiscrepancyCode(value);
    }

}
