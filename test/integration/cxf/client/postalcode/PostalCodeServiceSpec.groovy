package cxf.client.postalcode

import grails.plugin.spock.IntegrationSpec

/**
 * Created with IntelliJ IDEA.
 * User: Christian
 * Date: 3/9/13
 * Time: 8:53 PM
 * To change this template use File | Settings | File Templates.
 */
class PostalCodeServiceSpec extends IntegrationSpec {

  IPostalCodeService postalCode

  def "test cxf client invocation"() {
    when:
    PostalCode response = postalCode.getPostCodeDetailByPostCode("55345")

    then:
    response.postCode.value == '55345'
    response.placeName.value == 'Minnetonka'
  }

}
