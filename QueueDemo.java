package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
	/**
	 * Queue methods - offer or add , remove , poll , element , peek.
	 * offer or add = both are same (add the value).
	 * remove = retrives and remove the head of queue(return NoSuchElementException if queue is empty).
	 * poll = retrives and remove the head of queue(return null if queue is empty).
	 * element = retrives and does not remove the head of the queue(return NoSuchElementException if queue is empty).
	 * peek = retrives and does not remove the head of the queue(return null if queue is empty).
	 */
		
	    queue.offer(10);
	    queue.offer(15);
	    queue.offer(2);
	    queue.offer(7);
	    queue.offer(3);
	 
	    // It will not arrange in order:(It will ordered based on Binary Tree Algorithm)
        
	    System.out.println(queue);
		
		System.out.println("Size of the queue before poll(): " + queue.size());

		System.out.println("Get head of the queue and remove element: " + queue.poll());
	
		
		System.out.println("Get head of the queue and remove element: " + queue.remove()); //throws exception
		
	
		

		System.out.println("Size of the queue after poll(): " + queue.size());

		System.out.println("element(): " + queue.element()); //throws exception
		System.out.println("peek(): " + queue.peek());

		System.out.println("Size of the queue after peek(): " + queue.size());
		
	}

}
