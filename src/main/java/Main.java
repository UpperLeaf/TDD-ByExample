public class Main {

    public static void main(String[] args) throws Exception {
//        TestCaseTest test1 = new TestCaseTest("testTemplateMethod");
//        test1.run();
//
//        TestCaseTest test2 = new TestCaseTest("testFailedResult");
//        test2.run();
//
//        TestCaseTest test3 = new TestCaseTest("testFailedResultFormatting");
//        test3.run();

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
