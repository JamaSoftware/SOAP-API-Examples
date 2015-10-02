
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsPropertyEntry complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="wsPropertyEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPropertyEntry", propOrder = {
        "id",
        "propertyName",
        "propertyType",
        "propertyValue",
        "refId",
        "scope"
})
public class WsPropertyEntry {

    protected Integer id;
    protected String propertyName;
    protected Integer propertyType;
    protected String propertyValue;
    protected Integer refId;
    protected Integer scope;

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
     * Gets the value of the propertyName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the propertyType property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPropertyType(Integer value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the propertyValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * Sets the value of the propertyValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPropertyValue(String value) {
        this.propertyValue = value;
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
     * Gets the value of the scope property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setScope(Integer value) {
        this.scope = value;
    }

}
