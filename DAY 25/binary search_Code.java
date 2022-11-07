CODE 

import java.util.Scanner;
 class BinarySearch
{
   public static void main(String args[]){
   long start = System.currentTimeMillis();
   {
      int counter, num, item, array[], first, last, middle;
      Scanner input = new Scanner(System.in);
      System.out.println("ENTER THE NUMBER OF INTEGER");
      num = input.nextInt(); 
      array = new int[num];

      System.out.println("Enter " + num + " integers");
      for (counter = 0; counter < num; counter++)
          array[counter] = input.nextInt();

      System.out.println("Enter the search value:");
      item = input.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }

    long  end = System.currentTimeMillis();
    float sec = ( end-start)/1000f ; 
    System.out.println("TIME TAKEN TO EXECUTE CODE IS : " +sec+ "seconds");
}
  }


OUTPUT
ENTER THE NUMBER OF INTEGER
5
Enter 5 integers
39
54
76
90
12
Enter the search value:54
54 found at location 2.
TIME TAKEN TO EXECUTE CODE IS : 15.811seconds
