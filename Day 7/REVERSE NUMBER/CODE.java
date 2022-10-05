// PROBLEM - TO REVERSE THE INTEGER USING WHILE loop  AND IF- ELSE  in JAVA  language by taking input from user with all possible INPUT AND OUTPUT 


CODE 

 import java .util.Scanner;
 public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ENTER THE VALUE ");
      int num = sc.nextInt();
      int Originalnum = num;

      int reversed = 0;
    
    System.out.println("Original Number: " + num);

    while(num != 0) {
    
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      num /= 10;
    }
    if (Originalnum == reversed){
        
        System.out.println("Reversed number is palindrome :" +reversed);
    }
    else 
    System.out.println("Reversed Number: " + reversed);
  }
}


POSSIBLE OUTPUTS 

OUTPUT 1-(if the given number does not contain any value)
  it will display NULL


OUTPUT 2 - (If given number is PALINDROME )
ENTER THE VALUE 
1221
Original Number: 1221
Reversed number is palindrome :1221
  
  

OUTPUT 3 - ( if number  is NOT  PALINDROME then reversed number  is )
ENTER THE VALUE 
1234
Original Number: 234
Reversed Number: 432
  
OUTPUT 3 -(if the given number does not contain any value)
  it will display NULL

