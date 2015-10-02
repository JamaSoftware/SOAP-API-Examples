
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteRelease complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="deleteRelease">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="releaseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="swapReleaseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteRelease", propOrder = {
        "token",
        "releaseId",
        "swapReleaseId"
})
public class DeleteRelease {

    protected WsAuth token;
    protected Long releaseId;
    protected Long swapReleaseId;

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
     * Gets the value of the releaseId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getReleaseId() {
        return releaseId;
    }

    /**
     * Sets the value of the releaseId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setReleaseId(Long value) {
        this.releaseId = value;
    }

    /**
     * Gets the value of the swapReleaseId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSwapReleaseId() {
        return swapReleaseId;
    }

    /**
     * Sets the value of the swapReleaseId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSwapReleaseId(Long value) {
        this.swapReleaseId = value;
    }

}
