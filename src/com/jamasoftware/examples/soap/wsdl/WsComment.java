
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
 * <p>Java class for wsComment complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="wsComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="avatar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childComments" type="{http://v3.ws.contour.jamasoftware.com/}wsComment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentVersionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="important" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="originDocumentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="revisionSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scopeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="threadId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="threadUpdatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user" type="{http://v3.ws.contour.jamasoftware.com/}wsUser" minOccurs="0"/>
 *         &lt;element name="userIdsWhoLiked" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsComment", propOrder = {
        "active",
        "avatar",
        "childComments",
        "commentText",
        "commentType",
        "createdBy",
        "createdDate",
        "documentId",
        "documentKey",
        "documentName",
        "documentVersionId",
        "entryDate",
        "id",
        "important",
        "originDocumentId",
        "parentId",
        "refId",
        "revisionSequence",
        "scopeId",
        "status",
        "threadId",
        "threadUpdatedDate",
        "updatedBy",
        "user",
        "userIdsWhoLiked"
})
public class WsComment {

    protected Boolean active;
    protected String avatar;
    @XmlElement(nillable = true)
    protected List<WsComment> childComments;
    protected String commentText;
    protected Integer commentType;
    protected Integer createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Integer documentId;
    protected String documentKey;
    protected String documentName;
    protected Integer documentVersionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    protected Long id;
    protected Boolean important;
    protected Integer originDocumentId;
    protected Integer parentId;
    protected Integer refId;
    protected Integer revisionSequence;
    protected Integer scopeId;
    protected Integer status;
    protected Integer threadId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar threadUpdatedDate;
    protected Integer updatedBy;
    protected WsUser user;
    @XmlElement(nillable = true)
    protected List<Integer> userIdsWhoLiked;

    /**
     * Gets the value of the active property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the avatar property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Sets the value of the avatar property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAvatar(String value) {
        this.avatar = value;
    }

    /**
     * Gets the value of the childComments property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childComments property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildComments().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link WsComment }
     */
    public List<WsComment> getChildComments() {
        if (childComments == null) {
            childComments = new ArrayList<WsComment>();
        }
        return this.childComments;
    }

    /**
     * Gets the value of the commentText property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Sets the value of the commentText property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    /**
     * Gets the value of the commentType property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setCommentType(Integer value) {
        this.commentType = value;
    }

    /**
     * Gets the value of the createdBy property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setCreatedBy(Integer value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the documentId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDocumentId(Integer value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the documentKey property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentKey() {
        return documentKey;
    }

    /**
     * Sets the value of the documentKey property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentKey(String value) {
        this.documentKey = value;
    }

    /**
     * Gets the value of the documentName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the documentVersionId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDocumentVersionId() {
        return documentVersionId;
    }

    /**
     * Sets the value of the documentVersionId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDocumentVersionId(Integer value) {
        this.documentVersionId = value;
    }

    /**
     * Gets the value of the entryDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
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
     * Gets the value of the important property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isImportant() {
        return important;
    }

    /**
     * Sets the value of the important property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setImportant(Boolean value) {
        this.important = value;
    }

    /**
     * Gets the value of the originDocumentId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getOriginDocumentId() {
        return originDocumentId;
    }

    /**
     * Sets the value of the originDocumentId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setOriginDocumentId(Integer value) {
        this.originDocumentId = value;
    }

    /**
     * Gets the value of the parentId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setParentId(Integer value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the refId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRefId(Integer value) {
        this.refId = value;
    }

    /**
     * Gets the value of the revisionSequence property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getRevisionSequence() {
        return revisionSequence;
    }

    /**
     * Sets the value of the revisionSequence property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setRevisionSequence(Integer value) {
        this.revisionSequence = value;
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
     * Gets the value of the status property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the threadId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getThreadId() {
        return threadId;
    }

    /**
     * Sets the value of the threadId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setThreadId(Integer value) {
        this.threadId = value;
    }

    /**
     * Gets the value of the threadUpdatedDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getThreadUpdatedDate() {
        return threadUpdatedDate;
    }

    /**
     * Sets the value of the threadUpdatedDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setThreadUpdatedDate(XMLGregorianCalendar value) {
        this.threadUpdatedDate = value;
    }

    /**
     * Gets the value of the updatedBy property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setUpdatedBy(Integer value) {
        this.updatedBy = value;
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
     * Gets the value of the userIdsWhoLiked property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userIdsWhoLiked property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserIdsWhoLiked().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     */
    public List<Integer> getUserIdsWhoLiked() {
        if (userIdsWhoLiked == null) {
            userIdsWhoLiked = new ArrayList<Integer>();
        }
        return this.userIdsWhoLiked;
    }

}
