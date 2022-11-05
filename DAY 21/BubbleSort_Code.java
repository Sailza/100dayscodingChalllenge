PROBLEM :TO SOLVE BUBBLE SORT USING ARRAY IN JAVA 


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

