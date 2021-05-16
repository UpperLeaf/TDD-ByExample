
public class WasRun extends TestCase{

    public boolean wasRun;

    public boolean wasSetUp;

    public String log;

    public WasRun(String name) {
        super(name);
    }

    public void setUp() {
        wasRun = false;
        wasSetUp = true;
        log = "setUp ";
    }

    public void testMethod() {
        this.wasRun = true;
        log += "testMethod ";
    }

    public void testBrokenMethod() throws Exception{
        throw new Exception();
    }

    public void tearDown() {
        this.log += "tearDown ";
    }
}
