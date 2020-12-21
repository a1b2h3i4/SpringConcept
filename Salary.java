import java.util.*;
import java.util.Map.*;
public class Salary {
    private Map<String,String> salaries;
    public Salary(){}
    public Salary(Map<String, String> salaries){
        super();
        this.salaries=salaries;
    }
    public void displayInfo(){  
        System.out.println("Salaries....");  
        Set<Entry<String, String>> set=salaries.entrySet();  
        Iterator<Entry<String, String>> itr=set.iterator();  
        while(itr.hasNext()){  
            Entry<String,String> entry=itr.next();  
            System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
        }  
    }  
    
}
