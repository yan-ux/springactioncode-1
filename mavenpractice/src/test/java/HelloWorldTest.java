import hello.HelloWorld;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * @author  dongmei.gao
 *
 * hellworld 测试类
 */
public class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        HelloWorld hw = new HelloWorld();
        String result = hw.sayHello();
        Assert.assertEquals("hello maven",result);
    }
}
