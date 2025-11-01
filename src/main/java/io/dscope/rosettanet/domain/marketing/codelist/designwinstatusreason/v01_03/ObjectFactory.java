
package io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DesignWinStatusReasonType }
     * 
     */
    public DesignWinStatusReasonType createDesignWinStatusReasonType() {
        return new DesignWinStatusReasonType();
    }

    /**
     * Create an instance of {@link DesignWinStatusReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignWinStatusReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03", name = "DesignWinStatusReasonA")
    public DesignWinStatusReasonA createDesignWinStatusReasonA(Object value) {
        return new DesignWinStatusReasonA(value);
    }

    /**
     * Create an instance of {@link DesignWinStatusReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignWinStatusReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03", name = "DesignWinStatusReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03", substitutionHeadName = "DesignWinStatusReasonA")
    public DesignWinStatusReason createDesignWinStatusReason(DesignWinStatusReasonType value) {
        return new DesignWinStatusReason(value);
    }

}
