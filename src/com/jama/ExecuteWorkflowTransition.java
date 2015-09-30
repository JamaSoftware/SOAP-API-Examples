
package com.jama;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeWorkflowTransition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeWorkflowTransition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="transition" type="{http://v3.ws.contour.jamasoftware.com/}wsWorkflowTransition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeWorkflowTransition", propOrder = {
    "token",
    "documentId",
    "transition"
})
public class ExecuteWorkflowTransition {

    protected WsAuth token;
    protected Integer documentId;
    protected WsWorkflowTransition transition;

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
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocumentId(Integer value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link WsWorkflowTransition }
     *     
     */
    public WsWorkflowTransition getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsWorkflowTransition }
     *     
     */
    public void setTransition(WsWorkflowTransition value) {
        this.transition = value;
    }

}
