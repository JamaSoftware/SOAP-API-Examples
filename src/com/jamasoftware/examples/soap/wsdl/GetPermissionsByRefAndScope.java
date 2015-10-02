
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPermissionsByRefAndScope complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="getPermissionsByRefAndScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPermissionsByRefAndScope", propOrder = {
        "token",
        "refId",
        "scope"
})
public class GetPermissionsByRefAndScope {

    protected WsAuth token;
    protected Integer refId;
    protected Integer scope;

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
