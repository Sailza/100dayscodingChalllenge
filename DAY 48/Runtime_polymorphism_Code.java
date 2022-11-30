PROBLEM : TO show run time polymorphism in java language 

SOLUTION :
CODE
class Box1{  
void weight(){
    System.out.println("weight of Box1 is : 12kg");
    
}  
}  
class Box2 extends Box1{  
void weight(){
    System.out.println(" weight of Box2 is : 10kg");
    
}  
}  
class Box3 extends Box2{  
void weight(){
    System.out.println("weight of Box3 is : 18kg");
    
}  
public static void main(String args[]){  
Box1 a1,a2,a3;  
a1=new Box1();  
a2=new Box2();  
a3=new Box3();  
a1.weight();  
a2.weight();  
a3.weight();  
}  
} 

OUTPUT 
weight of Box1 is : 12kg
weight of Box2 is : 10kg
weight of Box3 is : 18kg
