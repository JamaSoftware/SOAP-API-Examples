
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveDocument complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="moveDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="newParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveDocument", propOrder = {
        "token",
        "itemId",
        "newParentId"
})
public class MoveDocument {

    protected WsAuth token;
    protected Long itemId;
    protected Long newParentId;

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
     * Gets the value of the itemId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the newParentId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getNewParentId() {
        return newParentId;
    }

    /**
     * Sets the value of the newParentId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setNewParentId(Long value) {
        this.newParentId = value;
    }

}
