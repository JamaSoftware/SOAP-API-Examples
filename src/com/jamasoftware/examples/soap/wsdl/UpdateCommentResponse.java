
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCommentResponse complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="updateCommentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://v3.ws.contour.jamasoftware.com/}wsComment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCommentResponse", propOrder = {
        "_return"
})
public class UpdateCommentResponse {

    @XmlElement(name = "return")
    protected WsComment _return;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     * {@link WsComment }
     */
    public WsComment getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value allowed object is
     *              {@link WsComment }
     */
    public void setReturn(WsComment value) {
        this._return = value;
    }

}
