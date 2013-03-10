
package cxf.client.postalcode;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxf.client.postalcode package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _DefaultFaultContract_QNAME = new QName("http://GOTLServices.FaultContracts/2008/01", "DefaultFaultContract");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _PostalCode_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "PostalCode");
    private final static QName _PostalCodeLatitude_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Latitude");
    private final static QName _PostalCodeLongitude_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "Longitude");
    private final static QName _PostalCodeAdministrationCodeFirst_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "AdministrationCodeFirst");
    private final static QName _PostalCodePlaceName_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "PlaceName");
    private final static QName _PostalCodeCountryCode_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "CountryCode");
    private final static QName _PostalCodeAdministrationNameSecond_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "AdministrationNameSecond");
    private final static QName _PostalCodeAdministrationNameFirst_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "AdministrationNameFirst");
    private final static QName _PostalCodeAdministrationNameThird_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "AdministrationNameThird");
    private final static QName _PostalCodeAdministrationCodeFirstSecond_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "AdministrationCodeFirstSecond");
    private final static QName _PostalCodePostCode_QNAME = new QName("http://www.restfulwebservices.net/DataContracts/2008/01", "PostCode");
    private final static QName _GetPostCodeDetailsByPlaceNameResponseGetPostCodeDetailsByPlaceNameResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetPostCodeDetailsByPlaceNameResult");
    private final static QName _GetPostCodeDetailByPostCodeResponseGetPostCodeDetailByPostCodeResult_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "GetPostCodeDetailByPostCodeResult");
    private final static QName _GetPostCodeDetailByPostCodeRequest_QNAME = new QName("http://www.restfulwebservices.net/ServiceContracts/2008/01", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxf.client.postalcode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DefaultFaultContract }
     * 
     */
    public DefaultFaultContract createDefaultFaultContract() {
        return new DefaultFaultContract();
    }

    /**
     * Create an instance of {@link GetPostCodeDetailsByPlaceNameResponse }
     * 
     */
    public GetPostCodeDetailsByPlaceNameResponse createGetPostCodeDetailsByPlaceNameResponse() {
        return new GetPostCodeDetailsByPlaceNameResponse();
    }

    /**
     * Create an instance of {@link PostalCode }
     * 
     */
    public PostalCode createPostalCode() {
        return new PostalCode();
    }

    /**
     * Create an instance of {@link GetPostCodeDetailByPostCodeResponse }
     * 
     */
    public GetPostCodeDetailByPostCodeResponse createGetPostCodeDetailByPostCodeResponse() {
        return new GetPostCodeDetailByPostCodeResponse();
    }

    /**
     * Create an instance of {@link GetPostCodeDetailByPostCode }
     * 
     */
    public GetPostCodeDetailByPostCode createGetPostCodeDetailByPostCode() {
        return new GetPostCodeDetailByPostCode();
    }

    /**
     * Create an instance of {@link GetPostCodeDetailsByPlaceName }
     * 
     */
    public GetPostCodeDetailsByPlaceName createGetPostCodeDetailsByPlaceName() {
        return new GetPostCodeDetailsByPlaceName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefaultFaultContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GOTLServices.FaultContracts/2008/01", name = "DefaultFaultContract")
    public JAXBElement<DefaultFaultContract> createDefaultFaultContract(DefaultFaultContract value) {
        return new JAXBElement<DefaultFaultContract>(_DefaultFaultContract_QNAME, DefaultFaultContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "PostalCode")
    public JAXBElement<PostalCode> createPostalCode(PostalCode value) {
        return new JAXBElement<PostalCode>(_PostalCode_QNAME, PostalCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Latitude", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeLatitude(String value) {
        return new JAXBElement<String>(_PostalCodeLatitude_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "Longitude", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeLongitude(String value) {
        return new JAXBElement<String>(_PostalCodeLongitude_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "AdministrationCodeFirst", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeAdministrationCodeFirst(String value) {
        return new JAXBElement<String>(_PostalCodeAdministrationCodeFirst_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "PlaceName", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodePlaceName(String value) {
        return new JAXBElement<String>(_PostalCodePlaceName_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "CountryCode", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeCountryCode(String value) {
        return new JAXBElement<String>(_PostalCodeCountryCode_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "AdministrationNameSecond", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeAdministrationNameSecond(String value) {
        return new JAXBElement<String>(_PostalCodeAdministrationNameSecond_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "AdministrationNameFirst", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeAdministrationNameFirst(String value) {
        return new JAXBElement<String>(_PostalCodeAdministrationNameFirst_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "AdministrationNameThird", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeAdministrationNameThird(String value) {
        return new JAXBElement<String>(_PostalCodeAdministrationNameThird_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "AdministrationCodeFirstSecond", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodeAdministrationCodeFirstSecond(String value) {
        return new JAXBElement<String>(_PostalCodeAdministrationCodeFirstSecond_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", name = "PostCode", scope = PostalCode.class)
    public JAXBElement<String> createPostalCodePostCode(String value) {
        return new JAXBElement<String>(_PostalCodePostCode_QNAME, String.class, PostalCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetPostCodeDetailsByPlaceNameResult", scope = GetPostCodeDetailsByPlaceNameResponse.class)
    public JAXBElement<PostalCode> createGetPostCodeDetailsByPlaceNameResponseGetPostCodeDetailsByPlaceNameResult(PostalCode value) {
        return new JAXBElement<PostalCode>(_GetPostCodeDetailsByPlaceNameResponseGetPostCodeDetailsByPlaceNameResult_QNAME, PostalCode.class, GetPostCodeDetailsByPlaceNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "GetPostCodeDetailByPostCodeResult", scope = GetPostCodeDetailByPostCodeResponse.class)
    public JAXBElement<PostalCode> createGetPostCodeDetailByPostCodeResponseGetPostCodeDetailByPostCodeResult(PostalCode value) {
        return new JAXBElement<PostalCode>(_GetPostCodeDetailByPostCodeResponseGetPostCodeDetailByPostCodeResult_QNAME, PostalCode.class, GetPostCodeDetailByPostCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "request", scope = GetPostCodeDetailByPostCode.class)
    public JAXBElement<String> createGetPostCodeDetailByPostCodeRequest(String value) {
        return new JAXBElement<String>(_GetPostCodeDetailByPostCodeRequest_QNAME, String.class, GetPostCodeDetailByPostCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", name = "request", scope = GetPostCodeDetailsByPlaceName.class)
    public JAXBElement<String> createGetPostCodeDetailsByPlaceNameRequest(String value) {
        return new JAXBElement<String>(_GetPostCodeDetailByPostCodeRequest_QNAME, String.class, GetPostCodeDetailsByPlaceName.class, value);
    }

}
