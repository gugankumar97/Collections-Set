package Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>(10);   // I assign the SIZE as 10 since it is ArrayDeque
   
		deque.offer(45);
		deque.offer(10);
		deque.offer(2);
		deque.offer(7);
		deque.offer(5);
		deque.offer(27);
		
		// It will Arrange in order:
		   
		   System.out.println(deque);
		   
		// clear method:
		   
		   deque.clear();
		   System.out.println(deque);
		   
		// addfirst:
		  
		   deque.addFirst(100);
		   System.out.println(deque);
		   
		   deque.addFirst(200);
		   System.out.println(deque);
		   
		 // addlast:
		   
		   deque.addLast(55);
		   System.out.println(deque);
		   
		   deque.addLast(40);
		   System.out.println(deque);
		   
		 // removefirst:
		   
		   deque.removeFirst();
		   System.out.println(deque);
		   
		  
	
		   
		   
		// Iterator: (for iterator we dont want to create object):
		   
		   Iterator<Integer> dequeitr = deque.iterator();
		   while(dequeitr.hasNext()) {
			   System.out.print(dequeitr.next()+",");
		   }
		   
		// Descending Iterator:(We can iterate in reverse order)  
		   
		   Iterator<Integer> descenitr = deque.descendingIterator();
		   while(descenitr.hasNext()) {
			   System.out.print(descenitr.next()+",");
			   
		   }
		   
	}

}
