
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsAttachment complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="wsAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentDocId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="attachmentTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mimetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://v3.ws.contour.jamasoftware.com/}wsOrganization" minOccurs="0"/>
 *         &lt;element name="project" type="{http://v3.ws.contour.jamasoftware.com/}wsProject" minOccurs="0"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAttachment", propOrder = {
        "attachmentDocId",
        "attachmentTypeId",
        "description",
        "fileName",
        "fileSize",
        "id",
        "mimetype",
        "organization",
        "project",
        "system"
})
public class WsAttachment {

    protected Integer attachmentDocId;
    protected Integer attachmentTypeId;
    protected String description;
    protected String fileName;
    protected Integer fileSize;
    protected Integer id;
    protected String mimetype;
    protected WsOrganization organization;
    protected WsProject project;
    protected Boolean system;

    /**
     * Gets the value of the attachmentDocId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getAttachmentDocId() {
        return attachmentDocId;
    }

    /**
     * Sets the value of the attachmentDocId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setAttachmentDocId(Integer value) {
        this.attachmentDocId = value;
    }

    /**
     * Gets the value of the attachmentTypeId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getAttachmentTypeId() {
        return attachmentTypeId;
    }

    /**
     * Sets the value of the attachmentTypeId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setAttachmentTypeId(Integer value) {
        this.attachmentTypeId = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fileName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setFileSize(Integer value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the mimetype property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Gets the value of the organization property.
     *
     * @return possible object is
     * {@link WsOrganization }
     */
    public WsOrganization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     *
     * @param value allowed object is
     *              {@link WsOrganization }
     */
    public void setOrganization(WsOrganization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the project property.
     *
     * @return possible object is
     * {@link WsProject }
     */
    public WsProject getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     *
     * @param value allowed object is
     *              {@link WsProject }
     */
    public void setProject(WsProject value) {
        this.project = value;
    }

    /**
     * Gets the value of the system property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSystem(Boolean value) {
        this.system = value;
    }

}
