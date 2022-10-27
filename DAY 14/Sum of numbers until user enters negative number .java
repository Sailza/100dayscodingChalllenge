PROBLEM:
The program below calculates the sum of numbers entered by the user until user enters a negative number.

SOLUTION 
This problem is very simple, I use while and break statement in java language to solve this problem 


CODE 
import java.util.Scanner;

class UserInputSum {

    public static void main(String[] args) {

      

        Double number, sum = 0.0;

        // create an object of Scanner

        Scanner input = new Scanner(System.in);

      

        while (true) {

            System.out.print("Enter a number: ");

            // takes double input from user

            number = input.nextDouble();

         

            // if number is negative the loop terminates

            if (number < 0.0) {

                break;

            }

         

           sum += number;

        }

        System.out.println("Sum = " + sum);

    }

}

OUTPUT 
Enter a number: 3.2

Enter a number: 5

Enter a number: 2.3

Enter a number: 0

Enter a number: -4.5

Sum = 10.5



