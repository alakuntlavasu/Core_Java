package CollectionsFremework.Queue;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	
     PriorityQueue pq=new PriorityQueue();
     
     // Adding elements add() offer()
     
      pq.add("A");
      pq.add("B");
      pq.add("c");
     pq.offer("c");
      
      System.out.println(pq);// insertion order is presurved & Duplicate elements allowed
      
      // get head element   element()
      
      System.out.println(pq.element());
     
	}

}
