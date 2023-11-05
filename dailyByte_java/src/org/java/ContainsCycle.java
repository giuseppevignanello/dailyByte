//Given a linked list, containing unique numbers, return whether or not it has a cycle.
//Note: a cycle is a circular arrangement (i.e. one node points back to a previous node)

package org.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContainsCycle {

	public static boolean containsCycle(LinkedList<Integer>numbs) {
		
		
		LinkedList<Integer> controlList = new LinkedList<>(); 
		
		for (Integer integer : numbs) {
			if(controlList.contains(integer)) {
				return true;
			}
			controlList.add(integer);
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		LinkedList<Integer> numbs1 = new LinkedList<>(List.of(1, 2, 3, 1));
		LinkedList<Integer> numbs2 = new LinkedList<>(List.of(1, 2, 3));
		LinkedList<Integer> numbs3 = new LinkedList<>(List.of(1, 1));
		
		
		System.out.println(containsCycle(numbs1));
		System.out.println(containsCycle(numbs2));
		System.out.println(containsCycle(numbs3));
	}
}
