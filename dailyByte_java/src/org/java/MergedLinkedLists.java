//Given two sorted linked lists, merge them together in ascending order and return a reference to the merged list

package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergedLinkedLists {

	public static List<Integer> mergedLinkedLists(int[] list1, int[] list2) {
		
		List<Integer> result = new ArrayList<>();
		
		for (Integer integer : list1) {
			result.add(integer);
		}
		for (Integer integer : list2) {
			result.add(integer);
		}
		
		List<Integer> orderedResult = new ArrayList<>();
		
		bubbleSort(result);
	
		//Collections.sort(result);
		
		
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
		
		int[] list1 = {1, 2, 3}; 
		int[] list2 = {4, 5, 6}; 
		
		int[] list3 = {1, 3, 5}; 
		int[] list4 = {2, 4, 6}; 
		
		int[] list5 = {4, 4, 7}; 
		int[] list6 = {1, 5, 6};
		System.out.println(mergedLinkedLists(list1, list2));
		System.out.println(mergedLinkedLists(list3, list4));
		System.out.println(mergedLinkedLists(list5, list6));
		
	}
}
