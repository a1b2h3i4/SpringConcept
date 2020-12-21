import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  
    Employee s=(Employee)factory.getBean("e");  
    s.show();  
    Employee s1=(Employee)factory.getBean("e1");  
    s1.show();  
    Question q=(Question)factory.getBean("q");  
    q.displayInfo();  
    Question q1=(Question)factory.getBean("q2");  
    q1.displayInfo();  
    Salary salary=(Salary)factory.getBean("salary");  
    salary.displayInfo();  
}  
}  
