
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePropertyEntry complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="updatePropertyEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="propertyEntry" type="{http://v3.ws.contour.jamasoftware.com/}wsPropertyEntry" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePropertyEntry", propOrder = {
        "token",
        "propertyEntry"
})
public class UpdatePropertyEntry {

    protected WsAuth token;
    protected WsPropertyEntry propertyEntry;

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
     * Gets the value of the propertyEntry property.
     *
     * @return possible object is
     * {@link WsPropertyEntry }
     */
    public WsPropertyEntry getPropertyEntry() {
        return propertyEntry;
    }

    /**
     * Sets the value of the propertyEntry property.
     *
     * @param value allowed object is
     *              {@link WsPropertyEntry }
     */
    public void setPropertyEntry(WsPropertyEntry value) {
        this.propertyEntry = value;
    }

}
