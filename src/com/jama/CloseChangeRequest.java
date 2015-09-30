
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for closeChangeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="closeChangeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="changeRequestItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "closeChangeRequest", propOrder = {
    "token",
    "changeRequestItemId"
})
public class CloseChangeRequest {

    protected WsAuth token;
    protected Integer changeRequestItemId;

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
     * Gets the value of the changeRequestItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeRequestItemId() {
        return changeRequestItemId;
    }

    /**
     * Sets the value of the changeRequestItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeRequestItemId(Integer value) {
        this.changeRequestItemId = value;
    }

}
