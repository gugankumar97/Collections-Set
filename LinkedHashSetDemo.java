package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// Creating LinkedHashSet and
        // adding elements
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		

        lhs.add("Fita");
        lhs.add("Academy");
        lhs.add("Is");
        lhs.add("Very helpful Academy");
        lhs.add("Academy");
        
        System.out.println(lhs);
  
        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

	}

}
