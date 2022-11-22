PROBLEM: To show how parametarised constructor work in java language 

SOLUTION :
A constructor which has a specific number of parameters is called a parameterized constructor.
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

CODE 
class Student4{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4(111,"Karan");  
    Student4 s2 = new Student4(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
} 

OUTPUT 
111 Karan
222 Aryan
