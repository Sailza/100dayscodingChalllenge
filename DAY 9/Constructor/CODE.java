



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
