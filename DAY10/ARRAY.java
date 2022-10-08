PROBLEM  : TO CALCULATE THE AVERAGE AND SUM OF ELEMENTS STORED IN ARRAY 
SOLUTION : THIS PROBLEM IS VERY SIMPLE , I USE FOR EACH LOOP IN JAVA LANGUAGE TO SOLVE THIS PROBLEM 

POSSIBLE TEST CASES 
TEST CASE 1 : 
IF GIVEN ARRAY IS EMPTY

SAMPLE INPUT 
Int [] numbers  ={ } 

SAMPLE OUTPUT 
SUM = 0 
AVG = 0 

TEST CASE 2 :
IF IT CONTAINS COMBINATION OF POSITIVE , NEGATIVE AND ZERO 

SO IN CASE OF SUM OF NUMBERS IT WILL PRINT INTEGER VALUE 
BUT 
IN CASE OF AVERAGE IT PRINT DECIMAL VALUE 
SO I TAKE AVERAGE AS DOUBLE 

SAMPLE INPUT 
Int [] numbers  ={ 0,4,1.3,-2} 

SAMPLE OUTPUT 
SUM = 3.3
avg = 0.825


EXPLANATION 

HERE I USE THE CONCEPT OF FOR EACH LOOP 
For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java 
It starts with the keyword for like a normal for-loop.
Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, followed by a colon, which is then followed by the array name.
In the loop body, you can use the loop variable you created rather than using an indexed array element. 
It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)


SYNTAX 
for (type var : array) 
{ 
    statements using var;
}


CODE 
public class Main {

 public static void main(String[] args) {

  int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
   int sum = 0;
   Double average;
   
   for (int number: numbers) {
     sum += number;
   }
   
   int arrayLength = numbers.length;
   average =  ((double)sum / (double)arrayLength);
   System.out.println("Sum of array elements  = " + sum);
   System.out.println("Average of array elements  = " + average);
 }
}


OUTPUT 
Sum of array elements  = 36
Average of array elements  = 3.6
