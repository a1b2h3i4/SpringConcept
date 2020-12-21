public class Employee {  
    private int id;  
    private String name;  
    private Address address;//Aggregation  
    public Employee() {System.out.println("Employee Constructor");}  
      
    public Employee(int id) {this.id = id;}  
      
    public Employee(String name) {  this.name = name;}  
    public Employee(int id, String name) {  
        this.id = id;  
        this.name = name;  
    }   
    public Employee(int id, String name,Address address) {  
        this.id = id;  
        this.name = name;  
        this.address = address;  
    }  
      
    void show(){  
        System.out.println(id+" "+name);  
        if(address != null){
        System.out.println(address.toString());
    }}  
}    