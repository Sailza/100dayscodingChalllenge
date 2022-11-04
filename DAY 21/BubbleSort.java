PROBLEM :TO SOLVE BUBBLE SORT USING ARRAY IN JAVA 

EXPLANATION 
In bubble sort algorithm, array is traversed from first element to last element. 
Here, current element is compared with the next element. 
If current element is greater than the next element, it is swapped.
  
Input: arr[] = {5, 1, 4, 2, 8}

First Pass: 

Bubble sort starts with very first two elements, comparing them to check which one is greater.
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1. 
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4 
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2 
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
Second Pass: 
Now, during second iteration it should look like this:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ) 
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 ) 
Third Pass: 

Now, the array is already sorted, but our algorithm does not know if it is completed.
The algorithm needs one whole pass without any swap to know it is sorted.
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
  
LOGIC WE APPLIED 
Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
If arr[j] is greater than arr[j+1] then swap these adjacent elements, 
else move on
Print the sorted array



CODE 
import java.util.Scanner;
class BubbleSort {
  public static void main(String []args) {
      long start = System.currentTimeMillis();
      {
          
    int num, i, j, temp;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of integers to sort:");
    num = input.nextInt();
 
    int array[] = new int[num];
 
    System.out.println("Enter " + num + " integers: ");
 
    for (i = 0; i < num; i++) 
      array[i] = input.nextInt();
 
    for (i = 0; i < ( num - 1 ); i++) {
      for (j = 0; j < num - i - 1; j++) {
        if (array[j] > array[j+1]) 
        {
           temp = array[j];
           array[j] = array[j+1];
           array[j+1] = temp;
        }
      }
    }
 
    System.out.println("Sorted list of integers:");
 
    for (i = 0; i < num; i++) 
      System.out.println(array[i]);
      }
      long end = System.currentTimeMillis();
      float sec = (end - start )/1000f;
      System.out.println("TIME TAKEN TO EXECUTE THE CODE IS :" +sec+ "seconds");
  }
}

OUTPUT 
Array Before Bubble Sort
3 60 35 2 45 320 5 
Array After Bubble Sort
2 3 5 35 45 60 320

