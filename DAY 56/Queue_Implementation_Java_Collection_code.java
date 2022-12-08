PROBLEM : Implementing queue using java collection and performing Insertion and deletion of elements 
SOLUTION 
CODE 
import java.util.*;  
public class queue{  
public static void main(String args[]){  
PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  
queue.add(100);  
queue.add(200);  
queue.add(300);  
queue.add(400);  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.element());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<Integer> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
} 

OUTPUT 
head:100
head:100
iterating the queue elements:
100
200
300
400
after removing two elements:
300
400
