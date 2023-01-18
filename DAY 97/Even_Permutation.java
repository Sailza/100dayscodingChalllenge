PROBLEM : To check weather the given number sum is Even or Not 
SOLUTION 
CODE 
import java.util.*;
class Permutation{
	public static void
	countEvenSum(int low, int high,
				int k)
	{
		int even_count = high / 2 - (low - 1) / 2;
		int odd_count = (high + 1) / 2 - low / 2;

		long even_sum = 1;
		long odd_sum = 0;
		int c=0;
		for (int i = 0; i < k; i++) {
			long prev_even = even_sum;
			long prev_odd = odd_sum;
			even_sum = (prev_even * even_count)
					+ (prev_odd * odd_count);
        
            if(even_sum%2==0)
            {
                c++;
            }
			odd_sum = (prev_even * odd_count)
					+ (prev_odd * even_count);
		}
		System.out.println(even_sum+"   "+c);
		if(even_sum%2==0 && c%2==0)
		{
		    System.out.println("The input is valid");
		}
		else{
		    System.out.println("The input is invalid");
		}
}
	public static void main(String[] args)
	{
		int low = 4;
		int high = 5;
		int K = 2;

		countEvenSum(low,high,K);
	}
}

OUTPUT 
2   1
The input is invalid
