import java.lang.reflect.Method;

public class TestCase {

    protected String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public void run() throws Exception {
        setUp();
        Method method = getClass().getMethod(name);
        method.invoke(this);
        tearDown();
    }
}
