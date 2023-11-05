//Given a linked list and a value, remove all nodes containing the provided value, and return the resulting list.


package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveValue {

	
	public static List<Integer> removeValue(int [] numbs, int value) {
		
		//convert numbs into a List
		List<Integer> numbsList = new ArrayList <>();
		for (Integer integer : numbs) {
			numbsList.add(integer);
		}
		
		Iterator<Integer> numbsListIterator = numbsList.iterator();
		
		while (numbsListIterator.hasNext()) {
			Integer i = numbsListIterator.next();
			if(i == value) {
				numbsListIterator.remove();
			}
		}
		
		return numbsList;
		
		
	}
	public static void main(String[] args) {
		
		int[] numbsList1 = {1, 2, 3};
		int[] numbsList2 = {8, 1, 1, 4, 12}; 
		int[] numbsList3 = {7, 12, 2, 9};
		
		System.out.println(removeValue(numbsList1, 3));
		System.out.println(removeValue(numbsList2, 1));
		System.out.println(removeValue(numbsList3, 7));
	}
}
