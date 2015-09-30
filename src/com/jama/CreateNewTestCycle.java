
package com.jama;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for createNewTestCycle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createNewTestCycle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="testPlanId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cycleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cycleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="statusesToInclude" type="{http://v3.ws.contour.jamasoftware.com/}wsTestRunStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testGroupsToInclude" type="{http://v3.ws.contour.jamasoftware.com/}wsTestGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createNewTestCycle", propOrder = {
    "token",
    "testPlanId",
    "cycleName",
    "cycleDescription",
    "startDate",
    "endDate",
    "statusesToInclude",
    "testGroupsToInclude"
})
public class CreateNewTestCycle {

    protected WsAuth token;
    protected Integer testPlanId;
    protected String cycleName;
    protected String cycleDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected List<WsTestRunStatus> statusesToInclude;
    protected List<WsTestGroup> testGroupsToInclude;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link WsAuth }
     *     
     */
    public WsAuth getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsAuth }
     *     
     */
    public void setToken(WsAuth value) {
        this.token = value;
    }

    /**
     * Gets the value of the testPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTestPlanId() {
        return testPlanId;
    }

    /**
     * Sets the value of the testPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTestPlanId(Integer value) {
        this.testPlanId = value;
    }

    /**
     * Gets the value of the cycleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleName() {
        return cycleName;
    }

    /**
     * Sets the value of the cycleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleName(String value) {
        this.cycleName = value;
    }

    /**
     * Gets the value of the cycleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleDescription() {
        return cycleDescription;
    }

    /**
     * Sets the value of the cycleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleDescription(String value) {
        this.cycleDescription = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the statusesToInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusesToInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusesToInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsTestRunStatus }
     * 
     * 
     */
    public List<WsTestRunStatus> getStatusesToInclude() {
        if (statusesToInclude == null) {
            statusesToInclude = new ArrayList<WsTestRunStatus>();
        }
        return this.statusesToInclude;
    }

    /**
     * Gets the value of the testGroupsToInclude property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testGroupsToInclude property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestGroupsToInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsTestGroup }
     * 
     * 
     */
    public List<WsTestGroup> getTestGroupsToInclude() {
        if (testGroupsToInclude == null) {
            testGroupsToInclude = new ArrayList<WsTestGroup>();
        }
        return this.testGroupsToInclude;
    }

}
