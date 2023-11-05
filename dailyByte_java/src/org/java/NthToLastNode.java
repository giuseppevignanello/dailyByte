package org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NthToLastNode {
	
	public static List<Integer> nthToLastNode(int[] numbsList, int value) {
		
		
		//without collections
		int[] reversedList = new int [numbsList.length];
		int[] finalListReversed = new int [numbsList.length - 1];
		
		//revers the list 
		for (int i = numbsList.length - 1; i >= 0; i--) {
			reversedList[numbsList.length - 1 - i] = numbsList[i];	
		}
	
		//remove the "value" element
		for (int i = 0, j = 0; i < reversedList.length; i++) {
			if(i != value - 1) {
				finalListReversed[j] = reversedList[i];
				j++;
			}
			
		}
		
		//reverse again
		int[] finalList = new int [finalListReversed.length];
		
		for (int i = finalListReversed.length - 1; i >= 0; i--) {
			finalList[finalListReversed.length - 1 - i] = finalListReversed[i];
			
		}
		
		
		//with Collections
		
		//adding items in an ArrayList
		List<Integer> numbListAsList = new ArrayList<>();
		for (Integer integer : numbsList) {
			numbListAsList.add(integer);
		}
		
		Collections.reverse(numbListAsList);
		numbListAsList.remove(value - 1);
		Collections.reverse(numbListAsList);
		
		return numbListAsList ;
		
		
		
		
	}
	
	public static void main(String[] args) {
		int[] numbsList = {1, 2, 3};
		System.out.println(nthToLastNode(numbsList, 1));
		System.out.println(nthToLastNode(numbsList, 2));
		System.out.println(nthToLastNode(numbsList, 3));
		
		
	}
}
