import knights.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dongmei.gao
 * @date 2019/5/20 14:05
 */
public class KnightMain {

    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
