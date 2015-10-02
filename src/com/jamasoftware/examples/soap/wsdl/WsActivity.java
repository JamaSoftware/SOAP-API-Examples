
package com.jamasoftware.examples.soap.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wsActivity complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="wsActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affectedItemIds" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://v3.ws.contour.jamasoftware.com/}wsEventType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="item" type="{http://v3.ws.contour.jamasoftware.com/}wsItem" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user" type="{http://v3.ws.contour.jamasoftware.com/}wsUser" minOccurs="0"/>
 *         &lt;element name="userComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsActivity", propOrder = {
        "action",
        "affectedItemIds",
        "comments",
        "date",
        "eventType",
        "id",
        "item",
        "objectType",
        "user",
        "userComment"
})
public class WsActivity {

    protected String action;
    @XmlElement(nillable = true)
    protected List<Integer> affectedItemIds;
    protected String comments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected WsEventType eventType;
    protected Long id;
    protected WsItem item;
    protected Integer objectType;
    protected WsUser user;
    protected String userComment;

    /**
     * Gets the value of the action property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the affectedItemIds property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedItemIds property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedItemIds().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getAffectedItemIds() {
        if (affectedItemIds == null) {
            affectedItemIds = new ArrayList<Integer>();
        }
        return this.affectedItemIds;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the date property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the eventType property.
     *
     * @return possible object is
     * {@link WsEventType }
     */
    public WsEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     *
     * @param value allowed object is
     *              {@link WsEventType }
     */
    public void setEventType(WsEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the item property.
     *
     * @return possible object is
     * {@link WsItem }
     */
    public WsItem getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value allowed object is
     *              {@link WsItem }
     */
    public void setItem(WsItem value) {
        this.item = value;
    }

    /**
     * Gets the value of the objectType property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setObjectType(Integer value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the user property.
     *
     * @return possible object is
     * {@link WsUser }
     */
    public WsUser getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     *
     * @param value allowed object is
     *              {@link WsUser }
     */
    public void setUser(WsUser value) {
        this.user = value;
    }

    /**
     * Gets the value of the userComment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUserComment() {
        return userComment;
    }

    /**
     * Sets the value of the userComment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserComment(String value) {
        this.userComment = value;
    }

}
