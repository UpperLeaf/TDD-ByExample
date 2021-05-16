public class TestCaseTest extends TestCase {

    private WasRun test;

    public TestCaseTest(String name) {
        super(name);
    }

    public void testTemplateMethod() throws Exception {
        test = new WasRun("testMethod");
        TestResult result = test.run();
        assert "1 run, 0 failed".equals(result.summary());
    }

    public void testFailedResult() throws Exception {
        test = new WasRun("testBrokenMethod");
        TestResult result = test.run();
        assert "1 run, 1 failed".equals(result.summary());
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        assert "1 run, 1 failed".equals(result.summary());
    }
}
