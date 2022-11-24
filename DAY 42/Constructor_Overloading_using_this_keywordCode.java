PROBLEM : To show constructor overloading in java using this keyword 

SOLUTION 
CODE 
public class Student {  
int id,passoutYear;  
String name,contactNo,collegeName;  
  
Student(String contactNo, String collegeName, int passoutYear){  
this.contactNo = contactNo;  
this.collegeName = collegeName;  
this.passoutYear = passoutYear;  
}  
  
Student(int id, String name){  
this("7623980031", "VIT BHOPAL ", 2022);  
this.id = id;  
this.name = name;  
}  
  
public static void main(String[] args) {  
Student s = new Student(100, "Harry");  
System.out.println("Printing Student Information: \n");  
System.out.println("Name: "+s.name+"\nId: "+s.id+"\nContact No.: "+s.contactNo+"\nCollege Name: "+s.contactNo+"\nPassing Year: "+s.passoutYear);  
}  
}  

OUTPUT 
Printing Student Information: 

Name: Harry
Id: 100
Contact No.: 7623980031
College Name: 7623980031
Passing Year: 2022
