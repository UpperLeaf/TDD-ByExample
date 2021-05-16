public class Main {

    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite();
        testSuite.add(new TestCaseTest("testTemplateMethod"));
        testSuite.add(new TestCaseTest("testFailedResult"));
        testSuite.add(new TestCaseTest("testFailedResultFormatting"));
        testSuite.add(new TestCaseTest("testSuite"));

        TestResult result = new TestResult();
        testSuite.run(result);
        System.out.println(result.summary());
    }
}
