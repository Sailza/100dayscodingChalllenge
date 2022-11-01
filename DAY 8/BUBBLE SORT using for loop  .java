PROBLEM TO BE SOLVE - PERFORM BUBBLLE SORT USING FOR LOOP IN JAVA LANGUAGE 

EXPLANATION 
Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.


CODE 

import java.util.Scanner;
public class BubbleSort {
  public static void main(String []args) {
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
  }
}
    
    
    
    
    
    OUTPUT 
    
Enter the number of integers to sort:
5
Enter 5 integers: 
76
3
90
1
4
Sorted list of integers:
1
3
4
76
90

     
