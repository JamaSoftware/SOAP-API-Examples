
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deactivateLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deactivateLookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="lookuptoDeactivate" type="{http://v3.ws.contour.jamasoftware.com/}wsLookup" minOccurs="0"/>
 *         &lt;element name="replacementLookup" type="{http://v3.ws.contour.jamasoftware.com/}wsLookup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deactivateLookup", propOrder = {
    "token",
    "lookuptoDeactivate",
    "replacementLookup"
})
public class DeactivateLookup {

    protected WsAuth token;
    protected WsLookup lookuptoDeactivate;
    protected WsLookup replacementLookup;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link WsAuth }
     *     
     */
    public WsAuth getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsAuth }
     *     
     */
    public void setToken(WsAuth value) {
        this.token = value;
    }

    /**
     * Gets the value of the lookuptoDeactivate property.
     * 
     * @return
     *     possible object is
     *     {@link WsLookup }
     *     
     */
    public WsLookup getLookuptoDeactivate() {
        return lookuptoDeactivate;
    }

    /**
     * Sets the value of the lookuptoDeactivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsLookup }
     *     
     */
    public void setLookuptoDeactivate(WsLookup value) {
        this.lookuptoDeactivate = value;
    }

    /**
     * Gets the value of the replacementLookup property.
     * 
     * @return
     *     possible object is
     *     {@link WsLookup }
     *     
     */
    public WsLookup getReplacementLookup() {
        return replacementLookup;
    }

    /**
     * Sets the value of the replacementLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsLookup }
     *     
     */
    public void setReplacementLookup(WsLookup value) {
        this.replacementLookup = value;
    }

}
