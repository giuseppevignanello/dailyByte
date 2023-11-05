//Given a non-empty linked list, 
//return the middle node of the list.
//If the linked list contains an even number of elements, 
//return the node closer to the end.

package org.java;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleElement {

	public static int findMiddleElement(int[] numbs) {
		
		
		
		int halfLength = numbs.length / 2;
		int middleNumber = numbs[halfLength];
		
		
		return middleNumber;
	}
	
	public static void main(String[] args) {
		int[] numbs1 =  {1, 2, 3};
		int[] numbs2 = {1, 2, 3, 4};
		int[] numbs3 = {1};
		System.out.println(findMiddleElement(numbs1));
		System.out.println(findMiddleElement(numbs2));
		System.out.println(findMiddleElement(numbs3));
	}
}
