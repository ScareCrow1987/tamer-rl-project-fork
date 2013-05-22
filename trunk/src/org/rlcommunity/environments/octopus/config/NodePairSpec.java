//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.05.02 at 05:14:34 PM EDT 
//


package org.rlcommunity.environments.octopus.config;

import org.rlcommunity.environments.octopus.config.NodePairSpec;
import org.rlcommunity.environments.octopus.config.NodeSpec;


/**
 * <p>Java class for NodePairSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodePairSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upper" type="{}NodeSpec"/>
 *         &lt;element name="lower" type="{}NodeSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

public class NodePairSpec {

    protected NodeSpec upper;
    protected NodeSpec lower;

    public NodePairSpec(){}
    public NodePairSpec(NodeSpec upper, NodeSpec lower){
        this.upper=upper;
        this.lower=lower;
    }
    /**
     * Gets the value of the upper property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSpec }
     *     
     */
    public NodeSpec getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSpec }
     *     
     */
    public void setUpper(NodeSpec value) {
        this.upper = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     * @return
     *     possible object is
     *     {@link NodeSpec }
     *     
     */
    public NodeSpec getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeSpec }
     *     
     */
    public void setLower(NodeSpec value) {
        this.lower = value;
    }

}
