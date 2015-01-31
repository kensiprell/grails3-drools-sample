import geb.spock.GebReportingSpec
import spock.lang.*

@Stepwise
class IndexPageSpec extends GebReportingSpec {

	def "IndexPage"() {
		when:
		go "http://localhost:8080/grails-drools-sample/"

		then:
		title == "Drools Sample"
	}

	def "Check results"() {
		given:
		waitFor { $("#result18").displayed }
		$("#result1").text() == "true"
		$("#result2").text() == "false"
		$("#result3").text() == "false"
		$("#result4").text() == "true"
		$("#result5").text() == "false"
		$("#result6").text() == "false"
		$("#result7").text() == "true"
		$("#result8").text() == "false"
		$("#result9").text() == "false"
		$("#result10").text() == "true"
		$("#result11").text() == "false"
		$("#result12").text() == "false"
		$("#result13").text() == "Escalate"
		$("#result14").text() == "5"
		$("#result15").text() == "Escalate"
		$("#result16").text() == "0"
		$("#result17").text() == "Pending"
		$("#result18").text() == "0"
	}
}
