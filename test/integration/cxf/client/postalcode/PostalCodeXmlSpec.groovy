package cxf.client.postalcode

import grails.plugin.spock.IntegrationSpec

/**
 * Created with IntelliJ IDEA.
 * User: Christian
 * Date: 3/9/13
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
class PostalCodeXmlSpec extends IntegrationSpec {

  def "test xml parse"() {
    given:
    String url = "http://api.geonames.org/postalCodeSearch?placename=${state}&username=${username}"

    when:
    def text = new URL(url).text
    def xml = new XmlSlurper().parseText(text)

    then: 'check that xml is valid and test for demo user credit expires'
    if(xml?.status){
        assert xml.status.@message != ""
    } else if(xml){
        assert xml
    }

    where:
    state | username
    'MN'  | 'demo'
  }
}
