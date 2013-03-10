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

    then:
    xml.status.@message != ""

    where:
    state | username
    'MN'  | 'demo'
  }
}
