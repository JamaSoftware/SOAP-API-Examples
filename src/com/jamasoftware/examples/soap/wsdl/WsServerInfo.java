
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsServerInfo complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="wsServerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contourVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="databaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="javaDateTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="javaDayMonthYearFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="javaScriptDateTimeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="javaScriptDayMonthYearFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serverOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsServerInfo", propOrder = {
        "contourVersion",
        "databaseType",
        "javaDateTimeFormat",
        "javaDayMonthYearFormat",
        "javaScriptDateTimeFormat",
        "javaScriptDayMonthYearFormat",
        "serverOS",
        "timeZoneOffset"
})
public class WsServerInfo {

    protected String contourVersion;
    protected String databaseType;
    protected String javaDateTimeFormat;
    protected String javaDayMonthYearFormat;
    protected String javaScriptDateTimeFormat;
    protected String javaScriptDayMonthYearFormat;
    protected String serverOS;
    protected Integer timeZoneOffset;

    /**
     * Gets the value of the contourVersion property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getContourVersion() {
        return contourVersion;
    }

    /**
     * Sets the value of the contourVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setContourVersion(String value) {
        this.contourVersion = value;
    }

    /**
     * Gets the value of the databaseType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /**
     * Sets the value of the databaseType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDatabaseType(String value) {
        this.databaseType = value;
    }

    /**
     * Gets the value of the javaDateTimeFormat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJavaDateTimeFormat() {
        return javaDateTimeFormat;
    }

    /**
     * Sets the value of the javaDateTimeFormat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJavaDateTimeFormat(String value) {
        this.javaDateTimeFormat = value;
    }

    /**
     * Gets the value of the javaDayMonthYearFormat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJavaDayMonthYearFormat() {
        return javaDayMonthYearFormat;
    }

    /**
     * Sets the value of the javaDayMonthYearFormat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJavaDayMonthYearFormat(String value) {
        this.javaDayMonthYearFormat = value;
    }

    /**
     * Gets the value of the javaScriptDateTimeFormat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJavaScriptDateTimeFormat() {
        return javaScriptDateTimeFormat;
    }

    /**
     * Sets the value of the javaScriptDateTimeFormat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJavaScriptDateTimeFormat(String value) {
        this.javaScriptDateTimeFormat = value;
    }

    /**
     * Gets the value of the javaScriptDayMonthYearFormat property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJavaScriptDayMonthYearFormat() {
        return javaScriptDayMonthYearFormat;
    }

    /**
     * Sets the value of the javaScriptDayMonthYearFormat property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJavaScriptDayMonthYearFormat(String value) {
        this.javaScriptDayMonthYearFormat = value;
    }

    /**
     * Gets the value of the serverOS property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getServerOS() {
        return serverOS;
    }

    /**
     * Sets the value of the serverOS property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServerOS(String value) {
        this.serverOS = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setTimeZoneOffset(Integer value) {
        this.timeZoneOffset = value;
    }

}
