refrence - https://www.geeksforgeeks.org/interesting-facts-increment-decrement-operators-java/


// To find increament decreament value of an integer given by user 

import java.util.Scanner;
public class Operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF INTEGER ");
        int i = sc.nextInt();
        int a,b,c,d;
        System.out.println("THE ORIGINAL VALUE OF INTEGER:");
        System.out.println(i);
        a= i++;
        System.out.println( "THE POST INCREAMENT VALUE OF INTEGER IS:");
        System.out.println(a);
        b = ++i;
        System.out.println("THE PREINCREAMENT VALUE OF INTEGER IS:");
        System.out.println(b);
        c= i--;
        System.out.println("THE POST DECREAMENT VALUE OF INTEGER IS :");
        System.out.println(c);
        d= --i;
        System.out.println("THE PRE DECREAMENT VALUE OF INTEGER IS:");
        System.out.println(d);
        
        
    }
}




OUTPUT OF THIS PROGRAM 

        
 ENTER THE VALUE OF INTEGER 
7
THE ORIGINAL VALUE OF INTEGER:
7
THE POST INCREAMENT VALUE OF INTEGER IS:
7
THE PREINCREAMENT VALUE OF INTEGER IS:
9
THE POST DECREAMENT VALUE OF INTEGER IS :
9
THE PRE DECREAMENT VALUE OF INTEGER IS:
7



EXPLANATION 

Increment operator is used to increment a value by 1.
 There are two varieties of increment operator: 

Post-Increment: Value is first used for computing the result and then incremented.
Pre-Increment: Value is incremented first and then the result is computed.

Decrement operator is used for decrementing the value by 1. 
There are two varieties of decrement operators. 

Post-decrement: Value is first used for computing the result and then decremented.
Pre-decrement: Value is decremented first and then the result is computed.

