//Given two sorted linked lists, merge them together in ascending order and return a reference to the merged list

package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergedLinkedLists {

	public static List<Integer> mergedLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		List<Integer> result = new ArrayList<>();
		
		for (Integer integer : list1) {
			result.add(integer);
		}
		for (Integer integer : list2) {
			result.add(integer);
		}
		
		
		//bubbleSort(result);
	
		Collections.sort(result);
		
		
		return result;
		
	}
	
	//trying without collections (I've discovered that this method is colled bubbleSort)
			public static void bubbleSort(List<Integer> list) {
				int listSize = list.size();
				boolean change = false; 
				
				
				do {
					//resetting the switch on false;
					change = false;
					for(int i = 0; i < listSize; i++ ) {
						
						if(list.get(i) > list.get(i + 1)) {
							//switch
							int temp = list.get(i);
							list.set(i, i + 1);
							list.set(i + 1, temp);
							
							//setting the switch on true;
							change = true;
						}
						listSize --;
					}
				} while (change);
			
			}
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> list1 = new LinkedList<Integer>(List.of(1, 2, 3));
		LinkedList<Integer> list2 = new LinkedList<Integer>(List.of(4, 5, 6));
		LinkedList<Integer> list3 = new LinkedList<Integer>(List.of(1, 3, 5));
		LinkedList<Integer> list4 = new LinkedList<Integer>(List.of(2, 4, 5));
		LinkedList<Integer> list5 = new LinkedList<Integer>(List.of(4, 4, 7));
		LinkedList<Integer> list6 = new LinkedList<Integer>(List.of(1, 5, 6));
		
		System.out.println(mergedLinkedLists(list1, list2));
		System.out.println(mergedLinkedLists(list3, list4));
		System.out.println(mergedLinkedLists(list5, list6));
		
	}
}
