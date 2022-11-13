PROBLEM - TO FIND THE POSITION OF A CHARACTER IN GIVEN STRING 

CODE 
import java.util.Scanner;
class Stringoperation4 
{  
public static void main(String args[]){  
System.out.println("ENTER THE STRING");
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
{  
System.out.println(s.charAt(4));
System.out.println(s.charAt(3));  
}  
}  
}

OUTPUT 
FOR TEST CASE -1 (WHEN CHARACTER IS PRESENT IN GIVEN STRING) 
ENTER THE STRING
Sailza
z
l

FOR TEST CASE-2 (WHEN CHARACTER IS NOT PRESENT IN GIVEN STRING OR WHEN WE PUT INTEGER INSTEAD OF NUMBER )
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
