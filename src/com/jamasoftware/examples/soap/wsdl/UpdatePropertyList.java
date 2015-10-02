
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePropertyList complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="updatePropertyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="propertylist" type="{http://v3.ws.contour.jamasoftware.com/}wsPropertyList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePropertyList", propOrder = {
        "token",
        "propertylist"
})
public class UpdatePropertyList {

    protected WsAuth token;
    protected WsPropertyList propertylist;

    /**
     * Gets the value of the token property.
     *
     * @return possible object is
     * {@link WsAuth }
     */
    public WsAuth getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value allowed object is
     *              {@link WsAuth }
     */
    public void setToken(WsAuth value) {
        this.token = value;
    }

    /**
     * Gets the value of the propertylist property.
     *
     * @return possible object is
     * {@link WsPropertyList }
     */
    public WsPropertyList getPropertylist() {
        return propertylist;
    }

    /**
     * Sets the value of the propertylist property.
     *
     * @param value allowed object is
     *              {@link WsPropertyList }
     */
    public void setPropertylist(WsPropertyList value) {
        this.propertylist = value;
    }

}
