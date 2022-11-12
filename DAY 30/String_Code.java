PROBLEM - CHECK WEATHER THE GIVEN WORD  IS PRESENT IN THE GIVEN STRING OR NOT 

CODE 
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("ENTER THE STRING ");
    Scanner sc = new Scanner(System.in);
    String txt = sc.nextLine();
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    boolean result = txt.contains(str1);
    if(result) {
      System.out.println(str1 + " is present in the string.");
    }
    else {
      System.out.println(str1 + " is not present in the string.");
    }

    result = txt.contains(str2);
    if(result) {
      System.out.println(str2 + " is present in the string.");
    }
    else {
      System.out.println(str2 + " is not present in the string.");
    }
  }
}


OUTPUT
ENTER THE STRING hello world 
hello 
hiee
hello  is present in the string.
hiee is not present in the string.
