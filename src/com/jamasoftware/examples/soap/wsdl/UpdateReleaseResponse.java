
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateReleaseResponse complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="updateReleaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://v3.ws.contour.jamasoftware.com/}wsRelease" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateReleaseResponse", propOrder = {
        "_return"
})
public class UpdateReleaseResponse {

    @XmlElement(name = "return")
    protected WsRelease _return;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     * {@link WsRelease }
     */
    public WsRelease getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value allowed object is
     *              {@link WsRelease }
     */
    public void setReturn(WsRelease value) {
        this._return = value;
    }

}
