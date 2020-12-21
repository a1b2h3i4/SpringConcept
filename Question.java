import java.util.Iterator;  
import java.util.List;  
  
public class Question {  
private int id;  
private String name;  
private List<String> answers;  
private List<Answer> answerObjectList;  
public Question() {}  
public Question(int id, String name, List<String> answers) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;  
} 
public Question(int id, String name, List<String> answers,List<Answer> answerList) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.answers = answers;
    this.answerObjectList=answerList;  
}  

public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    if(answers!=null && answers.size() !=0 ){
    Iterator<String> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }
}
    if(answerObjectList!=null && answerObjectList.size() !=0 ){
    Iterator<Answer> itr1=answerObjectList.iterator();  
    while(itr1.hasNext()){  
        System.out.println(itr1.next());  
    }
}
}  
}  
