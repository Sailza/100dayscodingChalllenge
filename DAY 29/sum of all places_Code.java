PROBLEM - TO SOLVE THE SUM OF ALL DIGITS GIVEN BY USER 
THIS PROBLEM IS VERY SIMPLE , WE CAN SOLVE THIS BY USING WHILE LOOP IN JAVA LANGUAGE 

CODE 
import java.util.Scanner;
public class sumofdigits {
    public static void main(String args[]){
        int digit, number,sum= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        number = sc.nextInt();
        while(number>0){
            digit=number%10;
            sum = sum+digit;
            number= number/10;
        }
        System.out.println("THE SUM OF DIGITS IS " +sum);
     

    }
    
}

OUTPUT
ENTER THE NUMBER
234
THE SUM OF DIGITS IS 9
PS C:\Users\shail\OneDrive\Desktop\java practice ques> 
