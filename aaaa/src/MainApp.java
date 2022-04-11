import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Test.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloworld22");
        obj.getMessage();
    }
}
