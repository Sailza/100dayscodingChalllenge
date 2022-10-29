Problem: sparseMatrix using array in java 


Explanation 
2D array is used to represent a sparse matrix in which there are three rows named as 

Row: Index of row, where non-zero element is located

Column: Index of column, where non-zero element is located

Value: Value of the non zero element located at index – (row,column)
A matrix is a two-dimensional data object made of m rows and n columns, therefore having total m x n values.
If most of the elements of the matrix have 0 value, then it is called a sparse matrix.

Why to use Sparse Matrix instead of simple matrix ?

Storage: There are lesser non-zero elements than zeros and thus lesser memory can be used to store only those elements.

Computing time: Computing time can be saved by logically designing a data structure traversing only non-zero elements.

Sample Output
Output

 0 0 1 1 3 3

 2 4 2 3 1 2

 3 4 5 7 2 6
 
 CODE 
 

// Java program for Sparse Matrix Representation

// using Array

class Sparse 

{

 

    public static void main(String[] args)

    {

        int sparseMatrix[][]

                = {

                    {0, 0, 3, 0, 4},

                    {0, 0, 5, 7, 0},

                    {0, 0, 0, 0, 0},

                    {0, 2, 6, 0, 0}

                };

 

        int size = 0;

        for (int i = 0; i < 4; i++) 

        {

            for (int j = 0; j < 5; j++) 

            {

                if (sparseMatrix[i][j] != 0) 

                {

                    size++;

                }

            }

        }

 

        // number of columns in compactMatrix (size) must be

        // equal to number of non - zero elements in

        // sparseMatrix

        int compactMatrix[][] = new int[3][size];

 

        // Making of new matrix

        int k = 0;

        for (int i = 0; i < 4; i++) 

        {

            for (int j = 0; j < 5; j++)

            {

                if (sparseMatrix[i][j] != 0) 

                {

                    compactMatrix[0][k] = i;

                    compactMatrix[1][k] = j;

                    compactMatrix[2][k] = sparseMatrix[i][j];

                    k++;

                }

            }

        }

 

        for (int i = 0; i < 3; i++) 

        {

            for (int j = 0; j < size; j++) 

            {

                System.out.printf("%d ", compactMatrix[i][j]);

            }

            System.out.printf("\n");

        }

    }

} 
