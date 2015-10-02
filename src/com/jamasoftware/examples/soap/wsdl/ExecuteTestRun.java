
package com.jamasoftware.examples.soap.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeTestRun complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="executeTestRun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="testRunId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="durationInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="actualResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passedWithErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="steps" type="{http://v3.ws.contour.jamasoftware.com/}wsTestRunStep" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeTestRun", propOrder = {
        "token",
        "testRunId",
        "durationInMinutes",
        "actualResults",
        "passedWithErrors",
        "steps"
})
public class ExecuteTestRun {

    protected WsAuth token;
    protected Integer testRunId;
    protected Integer durationInMinutes;
    protected String actualResults;
    protected Boolean passedWithErrors;
    protected List<WsTestRunStep> steps;

    /**
     * Gets the value of the token property.
     *
     * @return possible object is
     * {@link WsAuth }
     */
    public WsAuth getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     *
     * @param value allowed object is
     *              {@link WsAuth }
     */
    public void setToken(WsAuth value) {
        this.token = value;
    }

    /**
     * Gets the value of the testRunId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTestRunId() {
        return testRunId;
    }

    /**
     * Sets the value of the testRunId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTestRunId(Integer value) {
        this.testRunId = value;
    }

    /**
     * Gets the value of the durationInMinutes property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    /**
     * Sets the value of the durationInMinutes property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDurationInMinutes(Integer value) {
        this.durationInMinutes = value;
    }

    /**
     * Gets the value of the actualResults property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getActualResults() {
        return actualResults;
    }

    /**
     * Sets the value of the actualResults property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setActualResults(String value) {
        this.actualResults = value;
    }

    /**
     * Gets the value of the passedWithErrors property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isPassedWithErrors() {
        return passedWithErrors;
    }

    /**
     * Sets the value of the passedWithErrors property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setPassedWithErrors(Boolean value) {
        this.passedWithErrors = value;
    }

    /**
     * Gets the value of the steps property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the steps property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSteps().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link WsTestRunStep }
     */
    public List<WsTestRunStep> getSteps() {
        if (steps == null) {
            steps = new ArrayList<WsTestRunStep>();
        }
        return this.steps;
    }

}
