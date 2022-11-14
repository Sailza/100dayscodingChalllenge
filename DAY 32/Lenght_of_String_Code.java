PROBLEM : TO FIND THE LENGHT OF STRING BY USER 

SOLUTION 
WE CAN FIND THE LENGHT OF STRING BY USING STRING LENGHT METHOD IN JAVA LANGUAGE

CODE 
import java .util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE STRING ");
    String s1= sc.nextLine();
    System.out.println("String: " + s1);
    int length = s1.length();
    System.out.println("Length: " + length);
  }
}

OUTPUT 

FOR TEST CASE -1 
  ENTER THE STRING 
Hello how are you 
String: Hello how are you 
Length: 18
  
 FOR TEST CASE -2
  ENTER THE STRING 
String: 1234FDSHG
Length: 0
1234FDSHG: not found

FOR TEST CASE -3 
  ENTER THE STRING 
String: 
Length: 0

