public class Main {

    public static void main(String[] args) throws Exception {
        TestCaseTest test1 = new TestCaseTest("testTemplateMethod");
        test1.run();

        TestCaseTest test2 = new TestCaseTest("testFailedResult");
        test2.run();

        TestCaseTest test3 = new TestCaseTest("testFailedResultFormatting");
        test3.run();
    }
}
