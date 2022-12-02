PROBLEM - Create a two  array list in collection and merge those array list and perform sorting removing operation on them 

SOLUTION 
CODE 
import java.util.*;  
class CList{  
public static void main(String args[]){  
  
ArrayList< Integer > al=new ArrayList< Integer >();  
al.add(2);  
al.add(4);  
al.add(5);  
al.add(6); 
System.out.println("ArrayList 1: "+ al);

ArrayList< Integer > a2=new ArrayList< Integer >();  
a2.add(11);  
a2.add(12);  
a2.add(15);  
a2.add(19);

//System.out.println("ArrayList 2: " + a2);

a2.remove(1);
Collections.sort(al);
Collections.sort(a2);

System.out.println("ArrayList 2: " + a2);
al.addAll(a2);
System.out.println("Joined ArrayLists: "+ al); 
} 
} 

OUTPUT 
ArrayList 1: [2, 4, 5, 6]
ArrayList 2: [11, 15, 19]
Joined ArrayLists: [2, 4, 5, 6, 11, 15, 19]

[Done] exited with code=0 in 4.251 seconds
