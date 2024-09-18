package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceDemo {

	public static void main(String[] args) {
		
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

//		fillOutList(arrayList, 1000000);
//		fillOutList(linkedList, 1000000);

		System.out.println("=========== ARRAY LIST ===========");

		// ============== 100 elements

		long mill = System.nanoTime();
		addElementsToBeginning(arrayList, 10000);
		long add100ElementArrayListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("10000 element added into the beginning: " + add100ElementArrayListBeginning);
		
		System.out.println("=========== LINKED LIST ===========");

		// ============== 100 elements

		mill = System.nanoTime();
		addElementsToBeginning(linkedList, 10000);
		long add100ElementLinkedListBeginning = (System.nanoTime() - mill) / 10000;

		System.out.println("10000 element added into the beginning: " + add100ElementLinkedListBeginning);


	}

	private static void fillOutList(List<Integer> list, int amountOfElements) {
		for (int i = 0; i < amountOfElements; i++) {
			list.add(i);
		}
	}
	
	public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd) {
		for (int i = 0; i < numberOfElementsToAdd; i++) {
			list.add(0, i);
		}
	}
		

	}


