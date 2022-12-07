PROBLEM :To store the given values in vector list using enum 
SOLUTION 
CODE 
import java.util.*;
public class List {
	public static void main(String[] argv) throws Exception
	{
		try {
			List<Integer> arrlist = new ArrayList<Integer>();
			Vector<Integer> v = new Vector<Integer>();
			v.add(10);
			v.add(20);
			v.add(30);
			v.add(40);
			v.add(50);
			System.out.println("Current list : " + arrlist
			Enumeration<Integer> e = v.elements();

			// getting arrlist of specified Enumeration
			// using list() method
			arrlist = Collections.list(e);

			// printing the arrlist
			System.out.println("Returned list: "
							+ arrlist);
		}

		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}

OUTPUT 
Current list : []
Returned list: [10, 20, 30, 40, 50]
