
//Given two integer arrays, return their intersection.
//Note: the intersection is the set of elements that are common to both arrays.
package org.java;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfNumbers {

	public static Set<Integer> intersectionOfNumbers(int[] numbs1, int[] numbs2) {
		
		Set<Integer> numbs1WithoutRepetion = new HashSet<>();
		Set<Integer> numbs2WithoutRepetion = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for (Integer num : numbs1) {
			numbs1WithoutRepetion.add(num);
		}
		
		for (Integer num : numbs2) {
			numbs2WithoutRepetion.add(num);
		}
		
	
		for (int i : numbs1WithoutRepetion) {
			if(numbs2WithoutRepetion.contains(i)) {
				result.add(i);
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int[] numbs1 = {2, 4, 4, 2};
		int[] numbs2 = {2, 4};
		int[] numbs3 = {1, 2, 3, 3};
		int[] numbs4 = {3, 3};
		int[] numbs5 = {2, 4, 6, 8};
		int[] numbs6 = {1, 3, 5, 7};
		
		System.out.println("[2, 4]" + intersectionOfNumbers(numbs1, numbs2));
		System.out.println("[3]" + intersectionOfNumbers(numbs3, numbs4));
		System.out.println("Nothing" + intersectionOfNumbers(numbs5, numbs6));
	}
}
