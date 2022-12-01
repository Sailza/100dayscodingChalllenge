PROBLEM : To show how to handle arithmetic exception in java language 

SOLUTION 
CODE 
// import statement   
import java.math.BigDecimal;  
public class HandleArithmeticException1  
{  
// main method  
public static void main(String[] argvs)  
{  
// creating two objects of BigDecimal  
BigDecimal a1 = new BigDecimal(11);  
BigDecimal a2 = new BigDecimal(17);  
try  
{  
// 11 / 17 = 0.6470588235294118...  
a1 = a1.divide(a2);  
System.out.println(a1.toString());  
}  
// handling the exception in the catch block  
catch(ArithmeticException ex)  
{  
System.out.println("Should avoid dividing by an integer that leads to non-terminating decimal expansion. " + ex);  
}  
}  
}

OUTPUT 
Should avoid dividing by an integer that leads to non-terminating decimal expansion.
  java.lang.ArithmeticException:Non-terminating decimal expansion; no exact representable decimal result
