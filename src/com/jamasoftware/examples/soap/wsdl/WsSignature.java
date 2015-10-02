
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wsSignature complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="wsSignature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isRevoked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="revokeComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revokeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scopeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="signedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="user" type="{http://v3.ws.contour.jamasoftware.com/}wsUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsSignature", propOrder = {
        "comments",
        "id",
        "isRevoked",
        "refId",
        "revokeComments",
        "revokeDate",
        "scopeId",
        "signedDate",
        "user"
})
public class WsSignature {

    protected String comments;
    protected Long id;
    protected Boolean isRevoked;
    protected Long refId;
    protected String revokeComments;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revokeDate;
    protected Integer scopeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signedDate;
    protected WsUser user;

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
     * Gets the value of the isRevoked property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isIsRevoked() {
        return isRevoked;
    }

    /**
     * Sets the value of the isRevoked property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setIsRevoked(Boolean value) {
        this.isRevoked = value;
    }

    /**
     * Gets the value of the refId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setRefId(Long value) {
        this.refId = value;
    }

    /**
     * Gets the value of the revokeComments property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getRevokeComments() {
        return revokeComments;
    }

    /**
     * Sets the value of the revokeComments property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRevokeComments(String value) {
        this.revokeComments = value;
    }

    /**
     * Gets the value of the revokeDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getRevokeDate() {
        return revokeDate;
    }

    /**
     * Sets the value of the revokeDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setRevokeDate(XMLGregorianCalendar value) {
        this.revokeDate = value;
    }

    /**
     * Gets the value of the scopeId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getScopeId() {
        return scopeId;
    }

    /**
     * Sets the value of the scopeId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setScopeId(Integer value) {
        this.scopeId = value;
    }

    /**
     * Gets the value of the signedDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getSignedDate() {
        return signedDate;
    }

    /**
     * Sets the value of the signedDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setSignedDate(XMLGregorianCalendar value) {
        this.signedDate = value;
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

}
