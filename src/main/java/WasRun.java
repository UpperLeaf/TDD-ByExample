import java.lang.reflect.Method;

public class WasRun {

    public boolean wasRun;

    public String methodName;

    WasRun(String methodName) {
        this.methodName = methodName;
    }

    public void testMethod() {
        this.wasRun = true;
    }

    public void run() throws Exception {
        Method method = getClass().getMethod(methodName);
        method.invoke(this);
    }
}
