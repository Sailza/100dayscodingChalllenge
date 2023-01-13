PROBLEM : To Find the Largest number from the given string using java language  
SOLUTION 

CODE 
import java.util.Scanner;
 class MaxNumber{

     
    static int extractMaximum(String str)
    {
        int num = 0, res = 0;
        for (int i = 0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num = num * 10 + (str.charAt(i)-'0');
      
            else
            {
                res = Math.max(res, num);
      
               
                num = 0;
            }
        }
      
        
        return Math.max(res, num);
    }
     
    public static void main(String[] args)
    {
        System.out.println("ENTER STRING :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Largest number Present in the above String is :");
        System.out.println(extractMaximum(str));
    }
}

OUTPUT 
ENTER STRING :
hello this is 240 and 500 
Largest number Present in the above String is :
500
