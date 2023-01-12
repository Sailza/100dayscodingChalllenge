PROBLEM - To break the string into substring using java language 
SOLUTION 
CODE 
import java.io.*;
import java.util.ArrayList;
class SubstringsOfAString {
	public static ArrayList<String>
	splitSubstrings(String s)
	{
		int i, j;
		int stringLength = s.length();
		ArrayList<String> subStringList
			= new ArrayList<String>();
		for (i = 0; i < stringLength; i++) {

			for (j = i + 1; j <= stringLength; j++) {

				subStringList.add(s.substring(i, j));
			}

		} 
		return subStringList;
	}

	public static void main(String[] args)
	{
		String stringInput = new String("Java");

		ArrayList<String> subStringList
			= SubstringsOfAString.splitSubstrings(
				stringInput);

		System.out.println(
			"\n\nAll substrings are : ");
		int count = 1;
		for (String it : subStringList) {
			System.out.println("(" + count + ") \"" + it
							+ "\"");
			count++;
		}
	}
}

OUTPUT 
All substrings are : 
(1) "J"
(2) "Ja"
(3) "Jav"
(4) "Java"
(5) "a"
(6) "av"
(7) "ava"
(8) "v"
(9) "va"
(10) "a"
