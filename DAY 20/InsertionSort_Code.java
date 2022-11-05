PROBLENM 
INSERTION SORT USING ARRAY IN JAVA LANGUAGE 



CODE IN JAVA LANGUAGE 

java.util.Scanner;import
    public class Insertionsort
{
   public static void main(String[] args){
   long start = System.currentTimeMillis();
   {
      int n, i, j, element;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the Size of Array: ");
      n = scan.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter " +n+ " Elements: ");
      i=0;
      while(i<n)
      {
         arr[i] = scan.nextInt();
         i++;
      }
      
      i=1;
      while(i<n)
      {
         element = arr[i];
         
         j=i-1;
         while(j>=0 && arr[j]>element)
         {
            arr[j+1] = arr[j];
            j--;
         }
         
         arr[j+1] = element;
         i++;
      }
      
      System.out.println("\nThe new sorted array is: ");
      i=0;
      while(i<n)
      {
         System.out.println(arr[i]+ " ");
         i++;
      }
         long end = System.currentTimeMillis();
         float sec = (end - start)/1000F;
         System.out.println("THE TIME TAKEN TO EXECUTE THE CODE IS:" + sec + "seconds");
      
   }
}
}

OUTPUT OF CODE 

ENTER THE SIZE OF ARRAY 
5
ENTER THE ARRAY ELEMENT 
24
12
76
18
01
THE NEW SORTED ARRAY IS 
01
12
18
24
76


