
package cxf.client.postalcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrationNameFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrationCodeFirst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrationNameSecond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrationCodeFirstSecond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrationNameThird" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalCode", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", propOrder = {
    "countryCode",
    "postCode",
    "placeName",
    "administrationNameFirst",
    "administrationCodeFirst",
    "administrationNameSecond",
    "administrationCodeFirstSecond",
    "administrationNameThird",
    "latitude",
    "longitude"
})
public class PostalCode {

    @XmlElementRef(name = "CountryCode", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "PostCode", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "PlaceName", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> placeName;
    @XmlElementRef(name = "AdministrationNameFirst", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> administrationNameFirst;
    @XmlElementRef(name = "AdministrationCodeFirst", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> administrationCodeFirst;
    @XmlElementRef(name = "AdministrationNameSecond", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> administrationNameSecond;
    @XmlElementRef(name = "AdministrationCodeFirstSecond", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> administrationCodeFirstSecond;
    @XmlElementRef(name = "AdministrationNameThird", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> administrationNameThird;
    @XmlElementRef(name = "Latitude", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> latitude;
    @XmlElementRef(name = "Longitude", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class)
    protected JAXBElement<String> longitude;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the placeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlaceName(JAXBElement<String> value) {
        this.placeName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the administrationNameFirst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrationNameFirst() {
        return administrationNameFirst;
    }

    /**
     * Sets the value of the administrationNameFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrationNameFirst(JAXBElement<String> value) {
        this.administrationNameFirst = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the administrationCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrationCodeFirst() {
        return administrationCodeFirst;
    }

    /**
     * Sets the value of the administrationCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrationCodeFirst(JAXBElement<String> value) {
        this.administrationCodeFirst = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the administrationNameSecond property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrationNameSecond() {
        return administrationNameSecond;
    }

    /**
     * Sets the value of the administrationNameSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrationNameSecond(JAXBElement<String> value) {
        this.administrationNameSecond = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the administrationCodeFirstSecond property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrationCodeFirstSecond() {
        return administrationCodeFirstSecond;
    }

    /**
     * Sets the value of the administrationCodeFirstSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrationCodeFirstSecond(JAXBElement<String> value) {
        this.administrationCodeFirstSecond = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the administrationNameThird property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrationNameThird() {
        return administrationNameThird;
    }

    /**
     * Sets the value of the administrationNameThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrationNameThird(JAXBElement<String> value) {
        this.administrationNameThird = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatitude(JAXBElement<String> value) {
        this.latitude = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongitude(JAXBElement<String> value) {
        this.longitude = ((JAXBElement<String> ) value);
    }

}
