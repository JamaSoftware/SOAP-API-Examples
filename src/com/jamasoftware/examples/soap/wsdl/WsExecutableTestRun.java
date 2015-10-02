
package com.jamasoftware.examples.soap.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsExecutableTestRun complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="wsExecutableTestRun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defectDocTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="steps" type="{http://v3.ws.contour.jamasoftware.com/}wsTestRunStep" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="testRun" type="{http://v3.ws.contour.jamasoftware.com/}wsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsExecutableTestRun", propOrder = {
        "defectDocTypeId",
        "steps",
        "testRun"
})
public class WsExecutableTestRun {

    protected Integer defectDocTypeId;
    @XmlElement(nillable = true)
    protected List<WsTestRunStep> steps;
    protected WsItem testRun;

    /**
     * Gets the value of the defectDocTypeId property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getDefectDocTypeId() {
        return defectDocTypeId;
    }

    /**
     * Sets the value of the defectDocTypeId property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setDefectDocTypeId(Integer value) {
        this.defectDocTypeId = value;
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

    /**
     * Gets the value of the testRun property.
     *
     * @return possible object is
     * {@link WsItem }
     */
    public WsItem getTestRun() {
        return testRun;
    }

    /**
     * Sets the value of the testRun property.
     *
     * @param value allowed object is
     *              {@link WsItem }
     */
    public void setTestRun(WsItem value) {
        this.testRun = value;
    }

}
