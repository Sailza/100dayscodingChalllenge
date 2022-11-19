PROBLEM : When the parameters (formal arguments) and instance variables are same.

SOLUTION :To solve this problem we are using this keyword to distinguish local variable and instance variable in java language 

CODE 
class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Student s1=new Student(10077,"Sam",80000f);  
Student s2=new Student(10067,"John",76000f);  
s1.display();  
s2.display();  
}}  

OUTPUT 
10077 Sam 80000.0
10067 John 76000.0
