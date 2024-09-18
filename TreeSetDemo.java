package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Creating TreeSet and
        // adding elements
		
		TreeSet<String> ts = new TreeSet<String>();
		
		    ts.add("Fita");
	        ts.add("Academy");
	        ts.add("Is");
	        ts.add("Very helpful");
	        
	        System.out.println(ts);
	  
	        // Traversing elements
	        Iterator<String> itr = ts.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        
	     // Traversing elements in descending order
	        itr = ts.descendingIterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }


	}

}
