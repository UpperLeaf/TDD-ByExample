public class TestCaseTest extends TestCase {

    public TestCaseTest(String name) {
        super(name);
    }

    public void testRunning() throws Exception {
        WasRun wasRun = new WasRun("testMethod");
        assert !wasRun.wasRun;
        wasRun.run();
        assert wasRun.wasRun;
    }

}
