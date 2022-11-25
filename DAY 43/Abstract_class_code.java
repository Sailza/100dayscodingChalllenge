PROBLEM - TO SHOW BANK CLASS BY USING ABSTRACT CLASS IN JAVA LANGUAGE 

SOLUTION :
CODE 
abstract class Bank{    
abstract int getRateOfInterest();    
}    
class SBI extends Bank{    
int getRateOfInterest(){return 6;}    
}    
class PNB extends Bank{    
int getRateOfInterest(){return 4;}    
}    
    
class TestBank{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}    

OUTPUT 
Rate of Interest is: 6 %
Rate of Interest is: 4 %

