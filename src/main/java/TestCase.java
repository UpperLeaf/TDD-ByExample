import java.lang.reflect.Method;

public class TestCase {

    protected String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void run() throws Exception {
        Method method = getClass().getMethod(name);
        method.invoke(this);
    }
}
