PROBLEM :Some prime numbers can be expressed as a sum of other consecutive prime numbers.
  
SOLUTION 

For example
5 = 2 + 3,
17 = 2 + 3 + 5 + 7,
41 = 2 + 3 + 5 + 7 + 11 + 13.
Your task is to find out how many prime numbers which satisfy this property are present in the range 3 to N subject to a constraint that summation should always start with number 2.
Write code to find out the number of prime numbers that satisfy the above-mentioned property in a given range.

Input Format: First line contains a number N

Output Format: Print the total number of all such prime numbers which are less than or equal to N.

Constraints: 2<N<=12,000,000,000
  
CODE 
import java.util.Scanner;
 class Main {
 
    static int prime(int b) {
        int j,cnt;
        cnt=1;
        for (j = 2; j <= b/2; j++) {
            if(b%j==0)
                cnt=0;
        }
        if(cnt==0)
        return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n=0,cnt,c=0,sum=0,count=0,k=0;
        Main t = new Main();
        int[] a = new int[25];
        System.out.println("Enter no");
        n = sc.nextInt();
        for (i = 2; i <=n ; i++) {
            cnt=1;
            for (j = 2; j <= n/2; j++) {
                if(i%j==0)
                    cnt=0;
            }
            if(cnt==1) {
                a[k]=i;
                k++;
            }
            
        }
        for (i = 0; i < k; i++) {
            sum=sum+a[i];
            c=t.prime(sum);
            if(c==1)
                count++;
        }
        System.out.println(count);
    }

}

OUTPUT 
Enter no
43
4
