
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="read" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scopeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user" type="{http://v3.ws.contour.jamasoftware.com/}wsUser" minOccurs="0"/>
 *         &lt;element name="write" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPermissions", propOrder = {
    "manage",
    "read",
    "refId",
    "scopeId",
    "user",
    "write"
})
public class WsPermissions {

    protected boolean manage;
    protected boolean read;
    protected Integer refId;
    protected Integer scopeId;
    protected WsUser user;
    protected boolean write;

    /**
     * Gets the value of the manage property.
     * 
     */
    public boolean isManage() {
        return manage;
    }

    /**
     * Sets the value of the manage property.
     * 
     */
    public void setManage(boolean value) {
        this.manage = value;
    }

    /**
     * Gets the value of the read property.
     * 
     */
    public boolean isRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     */
    public void setRead(boolean value) {
        this.read = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefId(Integer value) {
        this.refId = value;
    }

    /**
     * Gets the value of the scopeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScopeId() {
        return scopeId;
    }

    /**
     * Sets the value of the scopeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScopeId(Integer value) {
        this.scopeId = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link WsUser }
     *     
     */
    public WsUser getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsUser }
     *     
     */
    public void setUser(WsUser value) {
        this.user = value;
    }

    /**
     * Gets the value of the write property.
     * 
     */
    public boolean isWrite() {
        return write;
    }

    /**
     * Sets the value of the write property.
     * 
     */
    public void setWrite(boolean value) {
        this.write = value;
    }

}
