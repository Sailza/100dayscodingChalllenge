PROBLEM: Program to print hollow rectangle or square star patterns

Hollow rectangle star pattern :

The task is print below hollow pattern of given dimension. 

 
SAMPLE OUTPUT 
********************

*                  *

*                  *

*                  *

*                  *

********************

SOLUTION OF THIS PROBLEM: 
I SOLVED THIS PROBLEM BY USING FOR LOOP IN JAVA LANGUAGE 
 

Input number of rows and columns.

For rows of rectangle run the outer loop from 1 to rows. 

 

for (i = 1; i < = rows; i++)

For column of rectangle run the inner loop from 1 to columns. 

 

for (j = 1; j < = columns; j++)

Print star for first or last row or for first or last column, otherwise print blank space.

After printing all columns of a row, print new line after inner loop.
  
  
  
  
  
  
  CODE 
  
  
  import java.io.*;



class Rectangle {

     

    // Function to print hollow rectangle

    static void print_rectangle(int n, int m)

    {

        int i, j;

        for (i = 1; i <= n; i++)

        {

            for (j = 1; j <= m; j++)

            {

                if (i == 1 || i == n || 

                    j == 1 || j == m)            

                    System.out.print("*");            

                else

                    System.out.print(" ");            

            }

            System.out.println();

        }

      

    }

      

    // Driver program for above function

    public static void main(String args[])

    {

        int rows = 6, columns = 20;

        print_rectangle(rows, columns);

    }

}







 
  
  
  
  
  
  
  
  
  
