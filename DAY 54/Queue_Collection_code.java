PROBLEM : To show the concept of queue collection in java With poll and peek method 

SOLUTION 
CODE 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class CollectionQueue{
   public static void main(String args[]) {
      Queue<Integer> queue = new LinkedList<Integer>();
      queue.add(1);
      queue.add(10);
      queue.add(12);
      queue.add(19);
      queue.add(34);
      System.out.println("Remove element at the top of the queue: "+queue.poll());
      Iterator<Integer> it = queue.iterator();
      System.out.println("Contents of the queue: ");
      while(it.hasNext()) {
        System.out.println(it.next());
      }
      System.out.println("The element  at the top of the queue: "+queue.peek());
      Iterator<Integer> ite = queue.iterator();
      System.out.println("Contents of the queue: ");
      while(ite.hasNext()) {
        System.out.println(ite.next());
      }

}
}

OUTPUT 
Remove element at the top of the queue: 1
Contents of the queue: 
10
12
19
34
The element  at the top of the queue: 10
Contents of the queue: 
10
12
19
34

[Done] exited with code=0 in 1.975 seconds

