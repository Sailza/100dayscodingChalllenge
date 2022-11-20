PROBLEM : To convert the lower data type in higher data type 

SOLUTION :
Converting a lower data type into a higher one is called widening type casting. 
It is also known as implicit conversion or casting down. It is done automatically. 
It is safe because there is no chance to lose data. It takes place when:

CODE 
import java.util.Scanner;
public class WideningTypeCasting{  
public static void main(String[] args){  
    System.out.println("ENTER THE VALUE OF X");
    Scanner sc= new Scanner(System.in);
    int x = sc.nextInt();
    long y = x;  
    float z = y;  
System.out.println("Before conversion, int value "+x);  
System.out.println("After conversion, long value "+y);  
System.out.println("After conversion, float value "+z);  
}  
} 

OUTPUT 
ENTER THE VALUE OF X
7
Before conversion, int value 7
After conversion, long value 7
After conversion, float value 7.0
