
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsProject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsProject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://v3.ws.contour.jamasoftware.com/}wsOrganization" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="projectGroup" type="{http://v3.ws.contour.jamasoftware.com/}wsLookup" minOccurs="0"/>
 *         &lt;element name="projectKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectManager" type="{http://v3.ws.contour.jamasoftware.com/}wsUser" minOccurs="0"/>
 *         &lt;element name="projectType" type="{http://v3.ws.contour.jamasoftware.com/}wsProjectType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://v3.ws.contour.jamasoftware.com/}wsLookup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsProject", propOrder = {
    "active",
    "description",
    "id",
    "isFolder",
    "name",
    "organization",
    "parent",
    "projectGroup",
    "projectKey",
    "projectManager",
    "projectType",
    "status"
})
public class WsProject {

    protected Boolean active;
    protected String description;
    protected Integer id;
    protected Boolean isFolder;
    protected String name;
    protected WsOrganization organization;
    protected Integer parent;
    protected WsLookup projectGroup;
    protected String projectKey;
    protected WsUser projectManager;
    protected WsProjectType projectType;
    protected WsLookup status;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the isFolder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFolder() {
        return isFolder;
    }

    /**
     * Sets the value of the isFolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFolder(Boolean value) {
        this.isFolder = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link WsOrganization }
     *     
     */
    public WsOrganization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsOrganization }
     *     
     */
    public void setOrganization(WsOrganization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParent(Integer value) {
        this.parent = value;
    }

    /**
     * Gets the value of the projectGroup property.
     * 
     * @return
     *     possible object is
     *     {@link WsLookup }
     *     
     */
    public WsLookup getProjectGroup() {
        return projectGroup;
    }

    /**
     * Sets the value of the projectGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsLookup }
     *     
     */
    public void setProjectGroup(WsLookup value) {
        this.projectGroup = value;
    }

    /**
     * Gets the value of the projectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectKey() {
        return projectKey;
    }

    /**
     * Sets the value of the projectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectKey(String value) {
        this.projectKey = value;
    }

    /**
     * Gets the value of the projectManager property.
     * 
     * @return
     *     possible object is
     *     {@link WsUser }
     *     
     */
    public WsUser getProjectManager() {
        return projectManager;
    }

    /**
     * Sets the value of the projectManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsUser }
     *     
     */
    public void setProjectManager(WsUser value) {
        this.projectManager = value;
    }

    /**
     * Gets the value of the projectType property.
     * 
     * @return
     *     possible object is
     *     {@link WsProjectType }
     *     
     */
    public WsProjectType getProjectType() {
        return projectType;
    }

    /**
     * Sets the value of the projectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProjectType }
     *     
     */
    public void setProjectType(WsProjectType value) {
        this.projectType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WsLookup }
     *     
     */
    public WsLookup getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsLookup }
     *     
     */
    public void setStatus(WsLookup value) {
        this.status = value;
    }

}
