
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
 *         &lt;element name="GetPostCodeDetailsByPlaceNameResult" type="{http://www.restfulwebservices.net/DataContracts/2008/01}PostalCode" minOccurs="0"/>
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
    "getPostCodeDetailsByPlaceNameResult"
})
@XmlRootElement(name = "GetPostCodeDetailsByPlaceNameResponse")
public class GetPostCodeDetailsByPlaceNameResponse {

    @XmlElementRef(name = "GetPostCodeDetailsByPlaceNameResult", namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<PostalCode> getPostCodeDetailsByPlaceNameResult;

    /**
     * Gets the value of the getPostCodeDetailsByPlaceNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostalCode }{@code >}
     *     
     */
    public JAXBElement<PostalCode> getGetPostCodeDetailsByPlaceNameResult() {
        return getPostCodeDetailsByPlaceNameResult;
    }

    /**
     * Sets the value of the getPostCodeDetailsByPlaceNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostalCode }{@code >}
     *     
     */
    public void setGetPostCodeDetailsByPlaceNameResult(JAXBElement<PostalCode> value) {
        this.getPostCodeDetailsByPlaceNameResult = ((JAXBElement<PostalCode> ) value);
    }

}
