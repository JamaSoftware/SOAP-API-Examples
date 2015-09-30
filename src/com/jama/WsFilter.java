
package com.jama;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentType" type="{http://v3.ws.contour.jamasoftware.com/}wsDocumentType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="includeHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isFavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://v3.ws.contour.jamasoftware.com/}wsFilterParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project" type="{http://v3.ws.contour.jamasoftware.com/}wsProject" minOccurs="0"/>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scopeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsFilter", propOrder = {
    "documentType",
    "id",
    "includeHierarchy",
    "isFavorite",
    "name",
    "parameters",
    "project",
    "refId",
    "scopeId"
})
public class WsFilter {

    protected WsDocumentType documentType;
    protected Long id;
    protected Boolean includeHierarchy;
    protected Boolean isFavorite;
    protected String name;
    @XmlElement(nillable = true)
    protected List<WsFilterParameter> parameters;
    protected WsProject project;
    protected Integer refId;
    protected Integer scopeId;

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link WsDocumentType }
     *     
     */
    public WsDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDocumentType }
     *     
     */
    public void setDocumentType(WsDocumentType value) {
        this.documentType = value;
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
     * Gets the value of the includeHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHierarchy() {
        return includeHierarchy;
    }

    /**
     * Sets the value of the includeHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHierarchy(Boolean value) {
        this.includeHierarchy = value;
    }

    /**
     * Gets the value of the isFavorite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFavorite() {
        return isFavorite;
    }

    /**
     * Sets the value of the isFavorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFavorite(Boolean value) {
        this.isFavorite = value;
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
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsFilterParameter }
     * 
     * 
     */
    public List<WsFilterParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<WsFilterParameter>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link WsProject }
     *     
     */
    public WsProject getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsProject }
     *     
     */
    public void setProject(WsProject value) {
        this.project = value;
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

}
