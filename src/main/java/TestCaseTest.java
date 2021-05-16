public class TestCaseTest extends TestCase {

    private WasRun test;

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() throws Exception {
        test = new WasRun("testMethod");
        test.run();
        assert "setUp testMethod tearDown ".equals(test.log);
    }
}
