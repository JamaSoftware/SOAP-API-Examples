
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemsFromTextSearch complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="getItemsFromTextSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://v3.ws.contour.jamasoftware.com/}wsAuth" minOccurs="0"/>
 *         &lt;element name="searchTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemsFromTextSearch", propOrder = {
        "token",
        "searchTerms",
        "start",
        "count"
})
public class GetItemsFromTextSearch {

    protected WsAuth token;
    protected String searchTerms;
    protected Integer start;
    protected Integer count;

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
     * Gets the value of the searchTerms property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * Sets the value of the searchTerms property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

    /**
     * Gets the value of the start property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the count property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setCount(Integer value) {
        this.count = value;
    }

}
