import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private List<TestCase> testCases;

    public TestSuite() {
        this.testCases = new ArrayList<>();
    }

    public void add(TestCase testCase){
        this.testCases.add(testCase);
    }

    public TestResult run(TestResult result) {
        testCases.forEach(testCase -> testCase.run(result));
        return result;
    }
}
