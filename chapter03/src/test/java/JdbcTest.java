import env.Jdbc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dongmei.gao
 * @date 2019/5/23 13:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:configspring.xml"})
public class JdbcTest {
    @Autowired
    private Jdbc jdbc ;
/*    @Autowired
    private Environment environment;*/

    @Test
    public void cdShouldNotBeNull(){

        System.out.println("打印对象了:" + " "+ jdbc.getName() + " " + jdbc.getPasswd());
        Assert.assertNotNull(jdbc);
    }

/*    @Test
    public void  getEnv(){
        //default
       String[] strDefalt = environment.getDefaultProfiles();
       for (String str : strDefalt){
         System.out.println(str);
       }
        System.out.println(environment.getProperty("jdbcuser.name"));//获取不到
        System.out.println(environment.getProperty("password"));

    }*/
}
