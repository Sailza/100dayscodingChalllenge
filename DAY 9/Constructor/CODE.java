



PROBLEM TO SOLVE :- FIND THE AREA OF CIRCLE  

SOLUTION : THIS PROBLEM IS VERY SIMPLE , I USED CONSTRUCTOR CONCEPT IN JAVA LANGUAGE TO SOLVE THIS PROBLEM 

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
