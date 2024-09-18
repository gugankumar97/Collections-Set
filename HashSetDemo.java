package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// Creating HashSet and
        // adding elements
		
		HashSet<String> hs = new HashSet<String>();
		
		    hs.add("Fita");
	        hs.add("Academy");
	        hs.add("Is");
	        hs.add("Very helpful");
	        hs.add("Fita");
	        
	       
	        
	       

	        
        // Traversing elements
	        Iterator<String> itr = hs.iterator();
            while (itr.hasNext()) {
	        	System.out.println(itr.next());
	        	
	        	// Based on hashcode only ordering is happening in hashset
	        	 System.out.println(itr.hashCode());
	            
	          }
	       
	}
	
}


