PROBLEM : To show the EMPLOYRR DEATILS  using super keyword in java 

SOLUTION 

CODE 
class Person{  
int id;  
String name;  
Person(int id,String name){  
this.id=id;  
this.name=name;  
}  
}  
class Emp extends Person{  
float salary;  
Emp(int id,String name,float salary){  
super(id,name);//reusing parent constructor  
this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
}  
class TestSuper5{  
public static void main(String[] args){  
Emp e1=new Emp(10077,"sailza",95000f);  
e1.display();  
}
}

OUTPUT 
10077 sailza 95000.0
