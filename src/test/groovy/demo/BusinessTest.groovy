package demo

class BusinessTest extends GroovyTestCase {

    void testCalculateKeyFigure() {
        assert new Business().calculateKeyFigure() == 42
    }
}
