package demo

import spock.lang.Specification
import spock.lang.Unroll

class MySpockSpec extends Specification {
    @Unroll
    def "#firstNum + keyFigure == #secondNum"() {
        expect:
        Integer.valueOf(firstNum as String) + new Business().calculateKeyFigure() == Integer.valueOf(secondNum as String)

        where:
        [firstNum, secondNum] << getClass().getClassLoader().getResourceAsStream("test.csv").readLines()*.split(",")
    }
}
