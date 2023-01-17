PROBLEM : The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by $
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
Other than these concatenated word, no other characters/string should or message should be written to STDOUT

For example if you print how are you then output should be h$wa#eYOU.

You can assume that input of each word will not exceed more than 5 chars

SOLUTION 

CODE 
import java.util.*;
class wordsarrange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three words : ");				
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		int l1 = s1.length();
		int l2 = s2.length();
		String str1 = "";
		String str2 = "";
		String str3 = "";
		char c;
		for(int i = 0 ; i < l1 ; i++)
		{
			c = s1.charAt(i);
			if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
			str1 = str1 + "$";
			else
			str1 = str1 + c;
		}
		for(int i = 0 ; i < l2 ; i++)
		{
			c = s2.charAt(i);
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))
			{
				if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
					str2 = str2 + c;
				else
					str2 = str2 + "#";
			}
			else
				str2 = str2 + c;
		}
		str3 = s3.toUpperCase();
		System.out.println(str1+str2+str3);
	}
}

OUTPUT
Enter three words :
how
are
you
h$wa#eYOU
