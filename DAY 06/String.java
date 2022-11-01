StringBuilder or StringBuffer class 
  has an in-build method reverse() to reverse the characters in the string. 
  This method replaces the sequence of the characters in reverse order.
  The reverse method is the static method that has

 the logic to reverse a string in Java
 
 SAMPLE INPUT OUTPUT 
 
 Original word: Geeks

Reversed word: skeeG

CODE 
import java . util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("ENTER THE VALUE OF STRING ");

        String name = sc.nextLine();

        String reversedString = "";

 

        for (int i = name.length() - 1; i >= 0; i--) {

            reversedString = reversedString + name.charAt(i);

        }

 

        System.out.print("The reversed string of the '" + name + "' is: ");

        System.out.println(reversedString);

    }

}
 
 
 
 
 
 
 
 OUTPUT 
 
 ENTER THE VALUE OF STRING 

SAILZA 

The reversed string of the 'SAILZA ' is: AZLIAS
