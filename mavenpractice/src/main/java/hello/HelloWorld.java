package hello;

/**
 * @author dongmei.gao
 * 
 * word类
 */
public class HelloWorld {
    public  String sayHello(){
        return "hello maven";
    }

    public static void main(String [] args){
        HelloWorld  hw= new HelloWorld();
        System.out.println(hw.sayHello());
    }
}
