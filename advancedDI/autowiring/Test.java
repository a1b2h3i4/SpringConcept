import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {
     public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
        A a=context.getBean("a",A.class);  
        a.display();   
        A a1=context.getBean("a1",A.class);  
        a.display();   
        A a2=context.getBean("a2",A.class);  
        a2.display();   
    }
}
