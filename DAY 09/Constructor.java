CONCEPT OF CONSTRUCTOR IN JAVA 

EXPLANATION 


Java constructors or constructors in Java is a terminology been used to construct something in our programs.
A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. It can be used to set initial values for object attributes. 

In Java, a constructor is a block of codes similar to the method.
It is called when an instance of the class is created. At the time of calling the constructor, memory for the object is allocated in the memory. 
It is a special type of method which is used to initialize the object. Every time an object is created using the new() keyword,
at least one constructor is called.

 It is not necessary to write a constructor for a class.
 It is because java compiler creates a default constructor if your class doesn’t have any.
 
 
 PROPERTIES OF CONSTRUCTOR 
 
 Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
Constructors do not return any type while method(s) have the return type or void if does not return any value.
Constructors are called only once at the time of Object creation while method(s) can be called any number of times.



SYNTAX 

class A
{   
  .......

  // A Constructor
  new A () {
  }

  .......
}

// We can create an object of the above class
// using the below statement. This statement
// calls above constructor.
A obj = new A(); 




PROBLEM TO SOLVE :- FIND THE AREA OF CIRCLE  

SOLUTION : THIS PROBLEM IS VERY SIMPLE , I USED CONSTRUCTOR CONCEPT IN JAVA LANGUAGE TO SOLVE THIS PROBLEM 

LOGIC :- 
	to find area of cirle we use the formula = [ area= (22*r*r)/7;]
	
	
DESCRIPTION :- 
	
	 PROPERTIES OF CONSTRUCTOR 
 
1- Constructors must have the same name as the class within which it is defined while it is not necessary for the method in Java.
2-Constructors do not return any type while method(s) have the return type or void if does not return any value.
3-Constructors are called only once at the time of Object creation while method(s) can be called any number of times.



SYNTAX 

class A
{   
  .......

  // A Constructor
  new A () {
  }

  .......
}

// We can create an object of the above class
// using the below statement. This statement
// calls above constructor.
A obj = new A(); 




CODE

import java.util.Scanner;
class Area
{
	double area;
	Area(double r)
	{
	 area= (22*r*r)/7;

	}
}
class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      Area  a=new Area(rad);
      System.out.println("Area of Circle is: " + a.area);      
   }
 }
 
 
 OUTPUT 
Enter the radius:2.5
Area of Circle is: 19.642857142857142
