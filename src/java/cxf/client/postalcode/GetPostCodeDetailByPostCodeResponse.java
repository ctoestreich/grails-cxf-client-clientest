
package cxf.client.postalcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPostCodeDetailByPostCodeResult" type="{http://www.restfulwebservices.net/DataContracts/2008/01}PostalCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPostCodeDetailByPostCodeResult"
})
@XmlRootElement(name = "GetPostCodeDetailByPostCodeResponse")
public class GetPostCodeDetailByPostCodeResponse {

    @XmlElementRef(name = "GetPostCodeDetailByPostCodeResult", namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<PostalCode> getPostCodeDetailByPostCodeResult;

    /**
     * Gets the value of the getPostCodeDetailByPostCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostalCode }{@code >}
     *     
     */
    public JAXBElement<PostalCode> getGetPostCodeDetailByPostCodeResult() {
        return getPostCodeDetailByPostCodeResult;
    }

    /**
     * Sets the value of the getPostCodeDetailByPostCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostalCode }{@code >}
     *     
     */
    public void setGetPostCodeDetailByPostCodeResult(JAXBElement<PostalCode> value) {
        this.getPostCodeDetailByPostCodeResult = ((JAXBElement<PostalCode> ) value);
    }

}
