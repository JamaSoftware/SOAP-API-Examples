
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateChangeRequestAssociation complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="updateChangeRequestAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="changeRequestAssociation" type="{http://v3.ws.contour.jamasoftware.com/}wsChangeRequestAssociation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateChangeRequestAssociation", propOrder = {
        "token",
        "changeRequestAssociation"
})
public class UpdateChangeRequestAssociation {

    protected WsAuth token;
    protected WsChangeRequestAssociation changeRequestAssociation;

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
     * Gets the value of the changeRequestAssociation property.
     *
     * @return possible object is
     * {@link WsChangeRequestAssociation }
     */
    public WsChangeRequestAssociation getChangeRequestAssociation() {
        return changeRequestAssociation;
    }

    /**
     * Sets the value of the changeRequestAssociation property.
     *
     * @param value allowed object is
     *              {@link WsChangeRequestAssociation }
     */
    public void setChangeRequestAssociation(WsChangeRequestAssociation value) {
        this.changeRequestAssociation = value;
    }

}
