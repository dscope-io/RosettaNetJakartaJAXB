
package io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TaxExemptionCodeType }
     * 
     */
    public TaxExemptionCodeType createTaxExemptionCodeType() {
        return new TaxExemptionCodeType();
    }

    /**
     * Create an instance of {@link TaxExemptionCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TaxExemptionCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.02", name = "TaxExemptionCodeA")
    public TaxExemptionCodeA createTaxExemptionCodeA(Object value) {
        return new TaxExemptionCodeA(value);
    }

    /**
     * Create an instance of {@link TaxExemptionCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TaxExemptionCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.02", name = "TaxExemptionCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.02", substitutionHeadName = "TaxExemptionCodeA")
    public TaxExemptionCode createTaxExemptionCode(TaxExemptionCodeType value) {
        return new TaxExemptionCode(value);
    }

}
