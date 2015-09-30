
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsChangeRequestAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsChangeRequestAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="associatedItem" type="{http://v3.ws.contour.jamasoftware.com/}wsItem" minOccurs="0"/>
 *         &lt;element name="changeRequestComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeRequestItem" type="{http://v3.ws.contour.jamasoftware.com/}wsItem" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="versionEnd" type="{http://v3.ws.contour.jamasoftware.com/}wsVersion" minOccurs="0"/>
 *         &lt;element name="versionStart" type="{http://v3.ws.contour.jamasoftware.com/}wsVersion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsChangeRequestAssociation", propOrder = {
    "associatedItem",
    "changeRequestComment",
    "changeRequestItem",
    "id",
    "versionEnd",
    "versionStart"
})
public class WsChangeRequestAssociation {

    protected WsItem associatedItem;
    protected String changeRequestComment;
    protected WsItem changeRequestItem;
    protected Long id;
    protected WsVersion versionEnd;
    protected WsVersion versionStart;

    /**
     * Gets the value of the associatedItem property.
     * 
     * @return
     *     possible object is
     *     {@link WsItem }
     *     
     */
    public WsItem getAssociatedItem() {
        return associatedItem;
    }

    /**
     * Sets the value of the associatedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsItem }
     *     
     */
    public void setAssociatedItem(WsItem value) {
        this.associatedItem = value;
    }

    /**
     * Gets the value of the changeRequestComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeRequestComment() {
        return changeRequestComment;
    }

    /**
     * Sets the value of the changeRequestComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeRequestComment(String value) {
        this.changeRequestComment = value;
    }

    /**
     * Gets the value of the changeRequestItem property.
     * 
     * @return
     *     possible object is
     *     {@link WsItem }
     *     
     */
    public WsItem getChangeRequestItem() {
        return changeRequestItem;
    }

    /**
     * Sets the value of the changeRequestItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsItem }
     *     
     */
    public void setChangeRequestItem(WsItem value) {
        this.changeRequestItem = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the versionEnd property.
     * 
     * @return
     *     possible object is
     *     {@link WsVersion }
     *     
     */
    public WsVersion getVersionEnd() {
        return versionEnd;
    }

    /**
     * Sets the value of the versionEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsVersion }
     *     
     */
    public void setVersionEnd(WsVersion value) {
        this.versionEnd = value;
    }

    /**
     * Gets the value of the versionStart property.
     * 
     * @return
     *     possible object is
     *     {@link WsVersion }
     *     
     */
    public WsVersion getVersionStart() {
        return versionStart;
    }

    /**
     * Sets the value of the versionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsVersion }
     *     
     */
    public void setVersionStart(WsVersion value) {
        this.versionStart = value;
    }

}
