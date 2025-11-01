
package io.dscope.rosettanet.domain.procurement.codelist.reporttype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.reporttype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.reporttype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReportTypeType }
     * 
     */
    public ReportTypeType createReportTypeType() {
        return new ReportTypeType();
    }

    /**
     * Create an instance of {@link ReportTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReportTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ReportType:xsd:codelist:1.0", name = "ReportTypeA")
    public ReportTypeA createReportTypeA(Object value) {
        return new ReportTypeA(value);
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReportType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ReportType:xsd:codelist:1.0", name = "ReportType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ReportType:xsd:codelist:1.0", substitutionHeadName = "ReportTypeA")
    public ReportType createReportType(ReportTypeType value) {
        return new ReportType(value);
    }

}
