
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAttachmentToItem complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="addAttachmentToItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="attachmentDocId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAttachmentToItem", propOrder = {
        "token",
        "attachmentDocId",
        "itemId"
})
public class AddAttachmentToItem {

    protected WsAuth token;
    protected Long attachmentDocId;
    protected Long itemId;

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
     * Gets the value of the attachmentDocId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAttachmentDocId() {
        return attachmentDocId;
    }

    /**
     * Sets the value of the attachmentDocId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAttachmentDocId(Long value) {
        this.attachmentDocId = value;
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

}
