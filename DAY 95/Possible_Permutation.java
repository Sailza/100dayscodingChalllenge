PROBLEM : TO FIND ALL THE POSSIBLE PERMUTATION OF A GIVEN STRING 
SOLUTION 
CODE 
import java.util.Scanner;
public class Permutation  {
	static void printPermutn(String str, String ans)
	{
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) +
						str.substring(i + 1);
			printPermutn(ros, ans + ch);
		}
	}
	public static void main(String[] args)
	{
	    System.out.println("ENTER THE STRING ");
	    Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("POSSIBLE PERMUTATIONS ARE :");
		printPermutn(s, "");
	}
}

OUTPUT 
ENTER THE STRING 
abs
POSSIBLE PERMUTATIONS ARE :
abs asb bas bsa sab sba 
