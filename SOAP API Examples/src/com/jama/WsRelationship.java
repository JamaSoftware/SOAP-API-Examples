
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromItem" type="{http://v3.ws.contour.jamasoftware.com/}wsItem" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="relationshipNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationshipType" type="{http://v3.ws.contour.jamasoftware.com/}wsRelationshipType" minOccurs="0"/>
 *         &lt;element name="toItem" type="{http://v3.ws.contour.jamasoftware.com/}wsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsRelationship", propOrder = {
    "fromItem",
    "id",
    "relationshipNote",
    "relationshipStatus",
    "relationshipType",
    "toItem"
})
public class WsRelationship {

    protected WsItem fromItem;
    protected Long id;
    protected String relationshipNote;
    protected String relationshipStatus;
    protected WsRelationshipType relationshipType;
    protected WsItem toItem;

    /**
     * Gets the value of the fromItem property.
     * 
     * @return
     *     possible object is
     *     {@link WsItem }
     *     
     */
    public WsItem getFromItem() {
        return fromItem;
    }

    /**
     * Sets the value of the fromItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsItem }
     *     
     */
    public void setFromItem(WsItem value) {
        this.fromItem = value;
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
     * Gets the value of the relationshipNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipNote() {
        return relationshipNote;
    }

    /**
     * Sets the value of the relationshipNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipNote(String value) {
        this.relationshipNote = value;
    }

    /**
     * Gets the value of the relationshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    /**
     * Sets the value of the relationshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipStatus(String value) {
        this.relationshipStatus = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link WsRelationshipType }
     *     
     */
    public WsRelationshipType getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsRelationshipType }
     *     
     */
    public void setRelationshipType(WsRelationshipType value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the toItem property.
     * 
     * @return
     *     possible object is
     *     {@link WsItem }
     *     
     */
    public WsItem getToItem() {
        return toItem;
    }

    /**
     * Sets the value of the toItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsItem }
     *     
     */
    public void setToItem(WsItem value) {
        this.toItem = value;
    }

}
