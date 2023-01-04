PROBLEM : To print Number Pyramid  pattern in java 
SOLUTION 
CODE 
public class Pattern3  
{              
public static void main(String[] args)   
{  
int n = 8;    //n is the number of rows you want to print  
for (int i = 0; i < n; i++)   
{  
int number = 1;  
System.out.printf("%" + (n - i) * 2 + "s", "");  
for (int j = 0; j <= i; j++)   
{  
System.out.printf("%4d", number);  
number = number * (i - j) / (j + 1);  
}  
System.out.println();  
}  
}  
}  

OUTPUT 
                  1
                 1   1
               1   2   1
             1   3   3   1
           1   4   6   4  1
          1   5  1010   5   1
       1   6  15  20  15   6   1
      1   7  21  3535  21   7   1
