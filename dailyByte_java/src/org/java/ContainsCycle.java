//Given a linked list, containing unique numbers, return whether or not it has a cycle.
//Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)

package org.java;

import java.util.ArrayList;
import java.util.List;

public class ContainsCycle {

	public static boolean containsCycle(int[]numbs) {
		
		//trying with List and contains 
		//convert into List 
		List<Integer> numbsList = new ArrayList<>(); 
		for (int i : numbs) {
			numbsList.add(i);
		}
		
		List<Integer> controlList = new ArrayList<>(); 
		
		for (Integer integer : numbsList) {
			
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		int[] numbs1 = {1, 2, 3, 1};
		int[] numbs2 = {1, 2, 3}; 
		int[] numbs3 = {1, 1};
		
		System.out.println(containsCycle(numbs1));
		System.out.println(containsCycle(numbs2));
		System.out.println(containsCycle(numbs3));
	}
}
