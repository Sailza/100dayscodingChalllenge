REFERENCE - GeeksForGeeks 


PROBLEM - PERFORM ENUM OPERATION USING SWITCH CASE IN  JAVA 


EXPLANATION :-

Enums are used when we know all possible values at compile time, such as choices on a menu, rounding modes, command-line flags, etc.
It is not necessary that the set of constants in an enum type stay fixed for all time.
A Java enumeration is a class type.
Although we don’t need need to instantiate an enum using new, it has the same capabilities as other classes.
This fact makes Java enumeration a very powerful tool. 
The main objective of enum is to define our own data types(Enumerated Data Types).




CODE 

public class JavaSwitchEnumExample {      
       public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat  }    
       public static void main(String args[])    
       {    
         Day[] DayNow = Day.values();    
           for (Day Now : DayNow)    
           {    
                switch (Now)    
                {    
                    case Sun:    
                        System.out.println("Sunday");    
                        break;    
                    case Mon:    
                        System.out.println("Monday");    
                        break;    
                    case Tue:    
                        System.out.println("Tuesday");    
                        break;         
                    case Wed:    
                        System.out.println("Wednesday");    
                        break;    
                    case Thu:    
                        System.out.println("Thursday");    
                        break;    
                    case Fri:    
                        System.out.println("Friday");    
                        break;    
                    case Sat:    
                        System.out.println("Saturday");    
                        break;    
                }    
            }    
        }    
} 


OUTPUT 

SUNDAY 
MONDAY 
TUESDAY 
WEDNESDAY 
THURSDAY 
FRIDAY 
SATURDAY 
