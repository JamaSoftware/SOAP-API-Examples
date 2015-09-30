
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLookup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLookup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="lookupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLookup", propOrder = {
    "token",
    "lookupId"
})
public class GetLookup {

    protected WsAuth token;
    protected Integer lookupId;

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
     * Gets the value of the lookupId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLookupId() {
        return lookupId;
    }

    /**
     * Sets the value of the lookupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLookupId(Integer value) {
        this.lookupId = value;
    }

}
