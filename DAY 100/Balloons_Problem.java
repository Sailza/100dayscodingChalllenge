PROBLEM : Input:

10 -> Value of N
[a,b,b,b,c,c,c,a,f,c] -> B[], elements B[0] to B[N-1] where input each element is separated by new line.
Output :
b-> ‘b’ colour balloon is present odd number of times in the bunch.

Explanation:
From the input array above:

a: 2 balloons
b: 3 balloons 
c: 4 balloons 
f: 1 balloons 
Here, both ‘b’ and ‘f’ have odd number of balloons. But ‘b’ colour balloon occurs first.
Hence , b is the output.

Input Format for testing
The candidate has to write the code to accept: 2 input 

First input: Accept value for number of N(Positive integer number).
Second Input : Accept N number of character values (B[]), where each value is separated by a new line.
Output format for testing
The output should be a single literal

Constraints:

3<=N<=50
B[i]={{a-z} or {A-Z}}

SOLUTION:

CODE 
import java.util.*;
class Main
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next ().charAt (0);
        int lower[] = new int[26];
        int upper[] = new int[26];
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] >= 'A') && (arr[i] <= 'Z'))
            upper[arr[i] - 'A']++;
            else if ((arr[i] >= 'a') && (arr[i] <= 'z'))
            lower[arr[i] - 'a']++;
        }
        boolean flag = false;
        char ch = '\0';
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] >= 'A') && (arr[i] <= 'Z'))
            {
                if (upper[arr[i] - 'A'] % 2 == 1)
                    {
                        ch = (char) (arr[i]);
                        flag = true;
                        break;
                    }
            }
            else if ((arr[i] >= 'a') && (arr[i] <= 'z'))
            {
                if (lower[arr[i] - 'a'] % 2 == 1)
                {
                    ch = (char) (arr[i]);
                    flag = true;
                    break;
                }
        
            }
        
        }
        if (flag == true)
            System.out.println (ch);
        else
            System.out.println ("All are even");
    }
}

OUTPUT 
3
5
6
3
All are even
