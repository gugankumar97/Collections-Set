package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		
		
		ListIterator<Integer> listIterator = integers.listIterator();
		
		listIterator = integers.listIterator(2);
		listIterator.next();
		listIterator.remove();

		
		System.out.println("Previous: " + listIterator.previous());
	
		listIterator.set(20);
		System.out.println("Next element after 'set(20)': " + listIterator.next());

		listIterator.add(21);
		System.out.println("Previous after adding 21: " + listIterator.previous());

		System.out.println(integers);
		
		listIterator.set(34);
		System.out.println(integers);
	}

}
