package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Object> list1 = new ArrayList<>();
		// === non-generic list demo
		list1.add("some string");
		list1.add(1);
		list1.add(45.56);
		
		System.out.println(list1);
		
		Object object = list1.get(2);
		System.out.println(object);

		List<String> list2 = new ArrayList<String>();
		// === generic list demo
		list2.add(0,"some string");
		list2.add(1,"Hi"); // COMPILATION ERROR! Can't add integer
		String string = list2.get(0);
		System.out.println(string);
		
		System.out.println("Arraylist Size :"+list1.size());
		
		System.out.println("Arraylist Size :"+list2.size());
		
		// === LinkedList
		
				list2 = new LinkedList<>();
				System.out.println("Linkedlist Size :"+list2.size());
				
				list2.add("another string");
				list2.add(" string2");
				list2.add(" string3");
				list2.add(" string4");
				
				System.out.println(list2.get(0));
				System.out.println(list2);
				
				list2.remove(2);
				System.out.println(list2);
				
				//list2.addFirst("Hi");
				((LinkedList<String>) list2).addFirst("Hi");
				System.out.println(list2);
				
				list2.addLast("BYE");
				System.out.println(list2);
				
                list1.addAll(1,list2);
                System.out.println("list1 is added with list2:"+list1);
                
                list1.removeAll(list2);
                System.out.println(list1);


				// === initialization demo
				List<Integer> list3 = new ArrayList<>(Arrays.asList(11, 2, 9));
				System.out.println(list3.get(1));

				// === List toString demo
				System.out.println(list3);

				// === foreach demo
				for (Integer i : list3) {
					System.out.println(i);
				}

				
				
				Collections.sort(list3);
				
				System.out.println(list3);
				
				// === clear() demo
				list3.clear();
				System.out.println(list3);
				
				
				// Vector
				
				System.out.println("----VECTOR----");
				Vector<String> list4 = new Vector<String>();
				Vector<String> list5 = new Vector<String>();
				
				list4.add("hello world");
				list4.add("gugan");
				list5.add("giridhar");
				
				
				System.out.println("is empty or not:"+list4.isEmpty());
				System.out.println(list4);
				System.out.println(list5);
				
				
				CopyOnWriteArrayList<String> list6 = new CopyOnWriteArrayList<String>();
				
				Stack<String> list7 = new Stack<String>();
				
	// push to add the elements.
   //  pop to see top of the elements and removed it.
  //   peek to see top of the elements without removing it.				
 //	   search is to see wheather the element is present or not.		
				
				list7.push("Good Morning");
				list7.push("Good Afternoon");
				list7.push("Good Evening");
				list7.push("Good Night");
				list7.push("Mid Night");
				System.out.println(list7);
				
				list7.pop();
				System.out.println(list7);
				
			
				System.out.println("top element:" +list7.peek());
				
				
				
				System.out.println("empty or not:"+list7.empty());
				
			
				System.out.println("contains or not:"+list7.search("Good Evening"));
			
				
	}

}
