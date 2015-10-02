
package com.jamasoftware.examples.soap.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsTestRunStatus.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="wsTestRunStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSED"/>
 *     &lt;enumeration value="NOT_RUN"/>
 *     &lt;enumeration value="INPROGRESS"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="BLOCKED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "wsTestRunStatus")
@XmlEnum
public enum WsTestRunStatus {

    PASSED,
    NOT_RUN,
    INPROGRESS,
    FAILED,
    BLOCKED;

    public String value() {
        return name();
    }

    public static WsTestRunStatus fromValue(String v) {
        return valueOf(v);
    }

}
