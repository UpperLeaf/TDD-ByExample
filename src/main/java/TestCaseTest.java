public class TestCaseTest extends TestCase {

    private WasRun test;

    private TestResult result;

    public TestCaseTest(String name) {
        super(name);
    }

    public void setUp() {
        this.result = new TestResult();
    }

    public void testTemplateMethod() throws Exception {
        test = new WasRun("testMethod");
        test.run(result);
        assert "1 run, 0 failed".equals(result.summary());
    }

    public void testFailedResult() throws Exception {
        test = new WasRun("testBrokenMethod");
        test.run(result);
        assert "1 run, 1 failed".equals(result.summary());
    }

    public void testFailedResultFormatting() {
        result.testStarted();
        result.testFailed();

        assert "1 run, 1 failed".equals(result.summary());
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);

        assert "2 run, 1 failed".equals(result.summary());
    }
}
